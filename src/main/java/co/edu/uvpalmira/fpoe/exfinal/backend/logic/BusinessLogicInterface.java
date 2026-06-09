/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.exfinal.backend.logic;

import co.edu.uvpalmira.fpoe.exfinal.entities.Editorial;
import jakarta.persistence.NoResultException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

/**
 *
 * @author ajvelez
 */
public interface BusinessLogicInterface {
  
    public List<Editorial> getEditoriales();

    public void guardar(Editorial editorial) throws SQLIntegrityConstraintViolationException, Exception;

    public Editorial buscarEditorial(Long nit) throws NoResultException, Exception;

}
