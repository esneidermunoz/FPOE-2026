/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package logica;

import co.edu.uvpalmira.fpoe.jpalib.NonexistentEntityException;
import java.util.List;
import web.modelo.Asignatura;

/**
 *
 * @author Sala Sistemas
 */
public interface ILogica {
    public void crearAsignatura(Asignatura asignatura);
    public void modificarAsignatura(Asignatura asignatura);
    public Asignatura buscarAsignatura(Asignatura asignatura);
    public List<Asignatura> buscarAsignaturas();
    
}
