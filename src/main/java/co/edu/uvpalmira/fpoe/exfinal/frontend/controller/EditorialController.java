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

/**
 *
 * @author ajvelez
 */
@Named(value = "edctrl")
@SessionScoped
public class EditorialController implements Serializable {

    @Inject
    private BusinessLogicInterface logic;


}
