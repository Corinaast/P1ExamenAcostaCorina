/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen; // Me olvide de poner el paquete 
public class Estudiante {
    //Atributos
    private String nombre;
    private int cedula;
    private String correo;
    private int edad;
    private String materia;
    //Constructor
    public Estudiante(String nombre, int cedula, String correo,int edad, String materia){
        this.nombre=nombre;
        this.cedula=cedula;
        this.correo=correo;
        this.edad=edad;
        this.materia=materia;
    }
    //Getters
    public String getnombre(){
        return nombre;
    }
      public int getcedula(){
        return cedula;
    }
     public String getcorreo(){
        return correo;
    }
       public int getedad(){
        return edad;
    }
        public String getmateria(){
        return materia;
    }
        
   //Setter
        public void setnombre(){
            this.nombre=nombre;
        }
        public void setcorreo(){
            this.correo=correo;
        }
         public void setcedula(){
            this.cedula=cedula;
        }
          public void setedad(){
            this.edad=edad;
        }
           public void setmateria(){
            this.materia=materia;
        }
           //Imprimir valores
           public void MostrarInformacion(){
               System.out.println("Estudiante"+nombre+"Con la identidad de:"+cedula+"Correo: "+correo+"La edad es :"+edad+"Materia:"+materia+".");
               
           }
}
