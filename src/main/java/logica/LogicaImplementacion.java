package logica;

import co.edu.uvpalmira.fpoe.jpalib.NonexistentEntityException;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceUnit;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import modelo.Docente;
import persistencia.DocenteDAO;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus i5
 */
@ApplicationScoped
public class LogicaImplementacion implements ILogica{
    @PersistenceUnit(name="Web1PU")
    private EntityManagerFactory emf;
    private DocenteDAO docenteDAO;
    
    @PostConstruct
    public void init(){
        this.docenteDAO=new DocenteDAO(this.emf);
    }

    @Override
    public void registrarDocente(Docente docente) throws SQLIntegrityConstraintViolationException, Exception {
        this.docenteDAO.create(docente);
    }

    @Override
    public void modificarDocente(Docente docente) throws NonexistentEntityException, Exception {
        this.docenteDAO.edit(docente);
    }

    @Override
    public Docente buscarDocente(String codigo) {
        return this.docenteDAO.buscarPorCodigo(codigo);
    }

    @Override
    public List<Docente> buscarDocentes() {
        return this.docenteDAO.findEntities();
    }
    
}