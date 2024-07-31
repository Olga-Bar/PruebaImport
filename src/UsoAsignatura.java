import edu.formacion.model.Asignatura;

import java.time.DateTimeException;
import java.time.LocalDate;

public class UsoAsignatura {
    public static void main(String[] args) {
        Asignatura asignatura1 = new Asignatura(100, "Matemáticas", 5, LocalDate.of(2024, 12, 18));//create
        Asignatura asignatura2 = new Asignatura(101, "Inglés", 4, LocalDate.of(2024, 12, 19));
        Asignatura asignatura3 = null;
        try {
            //ambito local: variable / objeto declarado en su bloque sólo puede ser usado en su bloque
            asignatura3 = new Asignatura(102, "Inglés", 4, LocalDate.of(2024, 14, 19));
        } catch (DateTimeException e) {
            System.out.println("Error en la fecha. Seguro que en el mes");
        }
        catch (Exception e) {
            System.out.println("Error genérico que no puedo identificar");
        }


        asignatura1.setCreditos(6);//update
        System.out.println(asignatura1.toString());//select
        System.out.println(asignatura2.toString());

    }//cierra main
}//cierra clase UsoAsignatura
