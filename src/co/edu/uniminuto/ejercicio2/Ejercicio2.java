package co.edu.uniminuto.ejercicio2;

import co.edu.uniminuto.entity.Estudiante;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

class Ejercicio2 {

    /**
     * 2. El departamento escolar de la facultad de 
     * ingeniería necesita obtener un reporte global de
       los promedios de sus estudiantes y que muestre 
     * el promedio de cada uno, nombres,
       apellidos, carrera y semestre. Se debe imprimir 
     * el promedio global y cada uno de los datos
     de los estudiantes.
     */
    public static void main(String[] args) {
        // 
        List<Estudiante> listEstudiantes = new ArrayList<>();
        short opcion = 0;
        double promedio = 0;
        double semestre = 0;
        String nombre = "";
        String apellido = "";
        String carrera = "";
        Estudiante estudiante; // declaracion de tipo estudiante
        try {
            do {
                nombre = JOptionPane.showInputDialog("Dame tus nombre");
                apellido = JOptionPane.showInputDialog("Dame tus apellidos");
                carrera = JOptionPane.showInputDialog("Digite la carrera que esta cursando");
                semestre = Double.parseDouble(JOptionPane.showInputDialog("Digite en que semestre se encuentra"));
                promedio = Double.parseDouble(JOptionPane.showInputDialog("Dame tu promedio"));

                if ((promedio >= 0) && (promedio <= 5)) {
                    estudiante = new Estudiante(nombre, apellido, promedio, carrera, semestre);
                    listEstudiantes.add(estudiante);
                } else {
                    JOptionPane.showMessageDialog(null, "el valor fuera de rango ");
                }
                opcion = Short.parseShort(JOptionPane.showInputDialog("Si no desea seguir agregando promedios presione 0"));
            } while (opcion != 0);
        } catch (Exception e) {
            //System.out.println("Error en captura de datos:"+e.getMessage());
        }
        for (Estudiante e : listEstudiantes) {
            System.out.println(e);
        }
        estudiante = new Estudiante();
        double avgGlobal = estudiante.promediarGlobal(listEstudiantes);
        System.out.println("Promedio Global:" + avgGlobal);
    }
}
