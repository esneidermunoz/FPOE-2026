/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.exfinal.entities;

import co.edu.uvpalmira.fpoe.persistence.jpalib.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.validation.constraints.NotEmpty;

/**
 *
 * @author Univalle
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "e.buscarPorNit", query = "SELECT e FROM Editorial e WHERE e.nit= :nit"),
    //@NamedQuery(name="e.buscarCompleto",query= "SELECT e FROM Editorial e WHERE e.nit LIKE :prefijo ORDER BY e.nit ASC")
})
public class Editorial extends AbstractEntity {
    @NotEmpty
    @Column(nullable = false, unique = true)
    private long nit;
    @NotEmpty
    @Column(nullable = false)
    private String nombre;

    public Editorial(long nit, String nombre) {
        this.nit = nit;
        this.nombre = nombre;
    }

    public Editorial() {
        this.nit = 0;
        this.nombre = "";
    }

    public long getNit() {
        return nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNit(long nit) {
        this.nit = nit;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
