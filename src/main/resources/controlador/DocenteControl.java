package controlador;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
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
@Named(value="docCtrl")
@SessionScoped
public class DocenteControl implements Serializable{
    private Docente docente= new Docente(12345678,"doc12345","Juan","perez","maestro en literatura");
    @Inject 
    private ILogica logica;
    
    public Docente getDocente() {
        try{
        return docente;
    }
    public void guardar(){
        this.logica.registrarDocente(this.docente);
        FacesContext.getCurrentInstance().addMessage(
                null, new FacesMessage("el docente fue registrado"));
    }catch 
}
    
}