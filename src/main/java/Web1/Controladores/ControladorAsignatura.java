package Web1.Controladores;


import web.modelo.Asignatura;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import logica.ILogica;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sala Sistemas
 */
@Named(value= "asignCtrl")
@SessionScoped
public class ControladorAsignatura implements Serializable{
    private Asignatura asignatura= new Asignatura("750014C", "FPOE", (byte)3, (byte)3);
    @Inject 
    private ILogica logica;
    
    public void guardar (){
        this.logica.crearAsignatura(this.asignatura);
        FacesContext.getCurrentInstance().addMessage(
                null, new FacesMessage("la asignatura fue guardada"));
    }
    public Asignatura getAsignatura(){
        return asignatura;
    }
}
