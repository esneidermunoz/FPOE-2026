/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.exfinal.backend.logic;

import co.edu.uvpalmira.fpoe.exfinal.backend.dao.EditorialDAO;
import co.edu.uvpalmira.fpoe.exfinal.entities.Editorial;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceUnit;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

/**
 *
 * @author ajvelez
 */
@ApplicationScoped
public class BussinessLogicImp implements BusinessLogicInterface {

    // AV-TODO: Cambiar
    @PersistenceUnit(name = "FPOE-PU")
    private EntityManagerFactory emf;

    private EditorialDAO editorialDAO;

    @PostConstruct
    public void init() {
        this.editorialDAO = new EditorialDAO(this.emf);
    }

    @Override
    public List<Editorial> getEditoriales() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void guardar(Editorial editorial) throws SQLIntegrityConstraintViolationException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Editorial buscarEditorial(Long nit) throws NoResultException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
