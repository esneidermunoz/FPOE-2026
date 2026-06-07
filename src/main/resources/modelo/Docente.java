/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import co.edu.uvpalmira.fpoe.jpalib.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.validation.constraints.NotEmpty;

/**
 *
 * @author Asus i5
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Docente.buscarPorCodigo", query = "SELECT d FROM Docente a WHERE d.codigo= :codigo"),
    @NamedQuery(name = "Asignatura.buscarPorEscuela", query = "SELECT a FROM Docente a WHERE d.codigo LIKE :prefijo ORDER BY d.codigo ASC")
})
public class Docente extends AbstractEntity {
    @NotEmpty
    @Column (nullable= false)
    private long nit;
    @Column(nullable = false, unique = true, length = 7)
    private String codigo;
    @Column (nullable= false)
    private String nombres;
    @Column (nullable= false)
    private String apellidos;
    @Column (nullable= false)
    private String especializacion;

    public Docente() {
        this.nit = 0;
        this.codigo= "";
        this.nombres = "";
        this.apellidos = "";
        this.especializacion = "";
    }

    public Docente(long nit,String codigo, String nombres, String apellidos, String especializacion) {
        this.nit = nit;
        this.codigo= codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.especializacion = especializacion;
    }

    public long getNit() {
        return nit;
    }
    public String getCodigo(){
        return codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setNit(long nit) {
        this.nit = nit;
    }
    
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    
    
    
}
