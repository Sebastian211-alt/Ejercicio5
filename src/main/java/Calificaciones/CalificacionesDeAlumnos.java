package Calificaciones;

import java.util.Scanner;

/**
 *
 * @author SebasTati
 */

public class CalificacionesDeAlumnos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double Calificacion1, Calificacion2, Calificacion3, Promedio;
        String Alumno;

        System.out.println("Nombre del Alumno: ");
        Alumno = teclado.nextLine();

        System.out.println("Calificacin de la evaluacion 1: ");
        Calificacion1 = teclado.nextDouble();

        System.out.println("Calificacin de la evaluacion 2: ");
        Calificacion2 = teclado.nextDouble();

        System.out.println("Calificacin de la evaluacion 3: ");
        Calificacion3 = teclado.nextDouble();

        Promedio = (Calificacion1 + Calificacion2 + Calificacion3) / 3;

        System.out.println("EL PROMEDIO DEL ALUMNO: " + Alumno + " ES DE: " + Promedio);

    }

}
