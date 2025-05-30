/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen;

/**
 *
 * @author caaco
 */
public class Examen {

    public static void main(String[] args) {
      MostrarInformacion();
      MostrarInformacion1();
    }

    
    //Esto me falto 
   private static void MostrarInformacion() {
        Estudiante estudiante = new Estudiante("Carlos", 123456, "carlos@email.com", 20, "Matematicas");
        estudiante.MostrarInformacion();
    }

    private static void MostrarInformacion1() {
        Docente docente = new Docente("Ana", 654321, "ana@email.com", 35, "Fisica");
        docente.MostrarInformacion1();
    }

}
