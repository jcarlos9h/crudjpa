
package com.mycompany.jpaprueba.logica;
import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;

public class Controladora {
    //instanciamos para acceder a los metodos de controladora de Persis
    ControladoraPersistencia controlPersi = new ControladoraPersistencia(); // conectamos con la controladora persis.
    
    public void crearAlumno(Alumno alu){
    controlPersi.crearAlumno(alu);
    }
    
    // METODO PARA ELIMINAR REGISTRO EN LA DB
    
    public void eliminarAlumno( int id){
    controlPersi.eliminarAlumno(id);
    }
    
    public void editarAlumno(Alumno alu){
    controlPersi.editarAlumno( alu);
    }
    
    public Alumno traerAlumno(int id){
    
        return controlPersi.traerAlumno(id);
    }
    
    
    public ArrayList<Alumno> traerListaAlumnos (){
    return controlPersi.traerListaAlumnos();
    }
    
    
    
    /* METODOS DE LA CLASE CARRERA*/
    
    public void crearCarrera(Carrera carre){
    controlPersi.creaCarrera(carre);
    }
    
    public void eliminarCarrera( int id){
    controlPersi.eliminarCarrera(id);
    }
    
    public void editarCarrera(Carrera carre){
    controlPersi.editarCarrera( carre);
    }
    
    public Carrera traerCarrera(int id){
    
        return controlPersi.traerCarrera(id);
    }
    
    
    public ArrayList<Carrera> traerListaCarrera (){
    return controlPersi.traerListaCarrera();
    }
    
}
