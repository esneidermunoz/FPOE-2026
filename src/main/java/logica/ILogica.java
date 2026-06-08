package logica;

import co.edu.uvpalmira.fpoe.jpalib.NonexistentEntityException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import modelo.Docente;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus i5
 */
public interface ILogica {
    public void registrarDocente(Docente docente)throws SQLIntegrityConstraintViolationException, Exception;
    public void modificarDocente(Docente docente) throws NonexistentEntityException, Exception;
    public Docente buscarDocente(String codigo);
    public List<Docente> buscarDocentes();
}
