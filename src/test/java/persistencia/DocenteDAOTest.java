/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package persistencia;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Docente;
import org.eclipse.persistence.config.EntityManagerProperties;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class DocenteDAOTest {

    private DocenteDAO DocenteDAO;
    private Long id;

    public DocenteDAOTest() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Web1PU");
        this.DocenteDAO = new DocenteDAO(emf);
    }

    @Test
    public void testBuscarPorCodigo() {
        try {
            System.out.println("insertar");
            Docente doc = new Docente("750014C", (long) 123456, "pepe juam", "perez parera", "dormitologo");
            DocenteDAO.create(doc);
            this.id = doc.getId();
            System.out.println(this.id);
            Assert.assertNotNull(doc.getId());

            System.out.println("buscar");
            doc = null;
            doc = DocenteDAO.buscarPorCodigo(("750014C"));
            Assert.assertEquals("pepe juam", doc.getNombres());

        } catch (Exception ex) {
            Logger.getLogger(DocenteDAOTest.class.getName()).log(Level.SEVERE, null, ex);
            fail();
        }

    }
}
