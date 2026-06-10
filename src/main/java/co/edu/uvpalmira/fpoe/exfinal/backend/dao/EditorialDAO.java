/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.exfinal.backend.dao;

import co.edu.uvpalmira.fpoe.exfinal.entities.Editorial;
import co.edu.uvpalmira.fpoe.persistence.jpalib.AbstractDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import java.util.List;

/**
 *
 * @author ajvelez
 */
public class EditorialDAO extends AbstractDAO<Editorial> {

    public EditorialDAO(EntityManagerFactory emf) {
        super(Editorial.class, emf);
    }

    public Editorial buscarPorNit(long nit) {
        EntityManager em = super.getEntityManager();
        return (Editorial) em.createNamedQuery("Editorial.buscarPorNit").setParameter("nit", nit).getSingleResult();

    }

   /* public List<Editorial> todosEditoriales(String codigoEditorial) {
        EntityManager em = super.getEntityManager();
        return em.createNamedQuery("Editorial.todosEditoriales")
                .setParameter("prefijo", codigoEditorial)
                .getResultList();
    }
*/
}
