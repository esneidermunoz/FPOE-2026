/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.exfinal.frontend.controller;

import co.edu.uvpalmira.fpoe.exfinal.entities.Editorial;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import co.edu.uvpalmira.fpoe.exfinal.backend.logic.BusinessLogicInterface;
import jakarta.persistence.NoResultException;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 *
 * @author ajvelez
 */
@Named(value = "edctrl")
@SessionScoped
public class EditorialController implements Serializable {

    private Editorial editorial = new Editorial(12345678, "editorial");
    @Inject
    private BusinessLogicInterface logic;

    public Editorial getEditorial() {
        try {
            return editorial;
        } catch (NoResultException ex) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("no se encontro la editorial"));
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("error desconocido, contacte con el desarrollador"));
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public List<Editorial> getEditoriales() {
        return this.logic.getEditoriales();
    }

    public void guardar() {
        try {
            this.logic.guardar(editorial);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("la editorial fue registrada"));
        } catch (SQLIntegrityConstraintViolationException ex) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("error de restricciones"));
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("error desconocido, contacte con el desarrollador"));
        }

    }

    public void cancelar() {
        this.editorial = new Editorial();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("proceso cancelado"));
    }
}
