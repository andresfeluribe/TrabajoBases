/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behind;

/**
 *
 * @author brandon.aguirre
 */
public class Asignatura {
    
    private String id_asignatura;
    private String nombre_asignatura;

    public String getId_asignatura() {
        return id_asignatura;
    }

    public String getNombre_asignatura() {
        return nombre_asignatura;
    }

    public void setId_asignatura(String id_asignatura) {
        this.id_asignatura = id_asignatura;
    }

    public void setNombre_asignatura(String nombre_asignatura) {
        this.nombre_asignatura = nombre_asignatura;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "id_asignatura=" + id_asignatura 
                             + ", nombre_asignatura=" + nombre_asignatura + '}';
    }
    
}
