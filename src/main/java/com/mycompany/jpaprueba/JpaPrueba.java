package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.Controladora;
import com.mycompany.jpaprueba.persistencia.AlumnoJpaController;
import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;

public class JpaPrueba {

    public static void main(String[] args) {
       
    // creamos la db directamente desde el main : "ControladoraPersistencia controlPersis = new  ControladoraPersistencia();"
        
    // instanciamos a la controlador de la logica
    
    Controladora control = new Controladora();
    
    // creamos un alumno en la DB.
    //  Alumno alu = new Alumno(4, "jose", "amaya", new Date());
    //   control.crearAlumno(alu);
      
    /* eliminar un alumno de la db */
        
    //    control.eliminarAlumno(1);
        
        /*Editamos un alumno en la db*/
     //   alu.setApellido("ramirez");
     //   control.editarAlumno(alu);
    
   /* 
     /*--TRAER ALUMNOS --
    Alumno alu = control.traerAlumno(4);
        System.out.println("------------BUSQUEDA INDIVIDUAL");
        System.out.println("El alumno con ese id es : " + alu.toString());
        
        System.out.println("------------BUSQUEDA DE TODOS");

        ArrayList<Alumno> listaAlumnos = control.traerListaAlumnos();
        
        for (Alumno al :listaAlumnos){
            System.out.println("Estos son todos los Alumnos: " + al.toString());
        }
       */
   
      //  Carrera carre= new Carrera(1, "JAVA"); // creamos la tabla carrera
       // control.crearCarrera(carre); // creamos la tablas carrera en la DB
   
        // creamos alumno en la base de datso con la relacion carrera
    //    Alumno alu= new Alumno(6, "jose", "perez", new Date(), carre); 
      //  control.crearAlumno(alu);
        
        System.out.println("---------------------------");
        System.out.println("------DATOS ALUMNO----------");
       //buscamos en la base de datos al alumno y lo traemos
        Alumno alun = control.traerAlumno(6);
       
        System.out.println("ALUMNO : " + alun.getNombre() + " " + alun.getApellido());
         System.out.println("----CURSA LA CARRERA DE : " + alun.getCarre().getNombre());
       
   
   
    }
}
