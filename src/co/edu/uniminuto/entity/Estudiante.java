
package co.edu.uniminuto.entity;

import java.util.ArrayList;
import java.util.List;


public class Estudiante {
    // Declarar atributos o propiedades 
    private String nombre;
    private String apellidos;
    private String carrera;
    private double promedio;
    private double semestre;
    //2. Metodos constructor 

    public Estudiante(String nombre, String apellidos, double promedio, String carrera, double semestre) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.promedio = promedio;
        this.semestre = semestre;
        this.carrera = carrera;
    }
    
    public Estudiante() {
        
    }
    
    //3. Metodos de acceso

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getSemestre() {
        return semestre;
    }

    public void setSemestre(double semestre) {
        this.semestre = semestre;
    }
    
    public double promediarGlobal (List<Estudiante> lista){
        List<Estudiante> listas = new ArrayList<>(lista);
        double suma = 0;
        for(Estudiante e:listas){
            suma+=e.getPromedio(); 
        }
        return suma / listas.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", promedio=").append(promedio);
        sb.append(", carrera=").append(carrera);
        sb.append(", semestre=").append(semestre);
        sb.append('}');
        return sb.toString();
    }
    
}
