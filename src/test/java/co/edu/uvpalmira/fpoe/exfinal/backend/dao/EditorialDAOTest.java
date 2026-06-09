/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package co.edu.uvpalmira.fpoe.exfinal.backend.dao;

import co.edu.uvpalmira.fpoe.exfinal.entities.Editorial;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.TestMethodOrder;
/**
 *
 * @author ajvelez
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EditorialDAOTest {

    private EditorialDAO editorialDAO;

    public EditorialDAOTest() {
        //AV-TODO
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("FPOE-Test-PU");
        this.editorialDAO = new EditorialDAO(emf);
    }

//    @Order(2)
//    @Test
//    public void testFind() throws Exception {
//        Editorial editorial = this.editorialDAO.findByNIT(8903990106L);
//        assertEquals("Editorial Universidad del Valle", editorial.getNombre());
//    }

}
