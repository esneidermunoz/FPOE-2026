/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package persistencia;

import web.modelo.Asignatura;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.persistence.config.EntityManagerProperties;
import org.junit.Test;
import static org.junit.Assert.*;

public class AsignaturaDAOTest {
    private AsignaturaDAO asignaturaDAO;
    private Long id;

    public AsignaturaDAOTest() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("prueba");
        this.asignaturaDAO = new AsignaturaDAO(emf);
    }

    @Test
    public void testBuscarPorCodigo() {
        try {
            System.out.println("insertar");
            Asignatura asig = new Asignatura("750014C", "FPOE", (byte) 3, (byte) 3);
            asignaturaDAO.create(asig);
            this.id = asig.getId();
            System.out.println(this.id);
        } catch (Exception ex) {
            Logger.getLogger(AsignaturaDAOTest.class.getName()).log(Level.SEVERE, null, ex);
            fail();
        }

        /**
         * Test of buscarPorEscuela method, of class AsignaturaDAO.
         */
        /*
         * @Test public void testBuscarPorEscuela() {
         * System.out.println("buscarPorEscuela"); String codigoEscuela = "";
         * AsignaturaDAO instance = null; List<Asignatura> expResult = null;
         * List<Asignatura> result = instance.buscarPorEscuela(codigoEscuela);
         * assertEquals(expResult, result); // TODO review the generated test
         * code and remove the default call to fail. fail("The test case is a
         * prototype."); }
         */
    }}
