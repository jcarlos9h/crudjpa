package com.mycompany.jpaprueba.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//mapeamos esta clase para que se transforme en una tabla en una DB con @Entity

@Entity // clase alumno se convierta en tabla en la DB
public class Alumno implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO) // genera el id automaticamente
    private int id;
    
    @Basic
    private String nombre;
    private String apellido;
    
    @Temporal(TemporalType.DATE)
    private Date fechaNac;
    
    @OneToOne
    private Carrera carre;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido, Date fechaNac, Carrera carre) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.carre = carre;
    }

 
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Carrera getCarre() {
        return carre;
    }

    public void setCarre(Carrera carre) {
        this.carre = carre;
    }

    
    
    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac + '}';
    }

    
}
