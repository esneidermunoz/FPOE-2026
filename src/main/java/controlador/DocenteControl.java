package controlador;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.ILogica;
import modelo.Docente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Asus i5
 */
@Named(value = "docCtrl")
@SessionScoped
public class DocenteControl implements Serializable {

    private Docente docente = new Docente(12345678, "doc12345", "Juan", "perez", "maestro en literatura");
    @Inject
    private ILogica logica;

    public Docente getDocente() {
        return docente;
    }

    public List<Docente> getDocentes() {
        return this.logica.buscarDocentes();
    }

    public void guardar() {
        try {
            this.logica.registrarDocente(this.docente);
            FacesContext.getCurrentInstance().addMessage(
                    null, new FacesMessage("el docente fue registrado"));
        } catch (SQLIntegrityConstraintViolationException ex) {
            FacesContext.getCurrentInstance().addMessage(
                    null, new FacesMessage(
                            FacesMessage.SEVERITY_ERROR, "error de restricciones", ex.getLocalizedMessage()));
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        }catch (Exception ex) { // <-- NUEVO CATCH PARA EL ERROR DE LA LÍNEA 42
            FacesContext.getCurrentInstance().addMessage(
                    null, new FacesMessage(
                            FacesMessage.SEVERITY_ERROR, "Error desconocido, contacte con el desarrollador", ex.getLocalizedMessage()));
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        }
    }    
        

    public void cancelar() {
        this.docente = new Docente();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("prioceso cancelado"));
        }
}
