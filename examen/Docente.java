package com.mycompany.examen;

/**
 *
 * @author caaco
 */
public class Docente {
    //Atributos
    private String nombre1;
    private int cedula1;
    private String correo1;
    private int edad1;
    private String materia1;
    //Constructor
    public Docente(String nombre1, int cedula1, String correo1,int edad1, String materia1){
        this.nombre1=nombre1;
        this.cedula1=cedula1;
        this.correo1=correo1;
        this.edad1=edad1;
        this.materia1=materia1;
    }
      //Getters
    public String getnombre1(){
        return nombre1;
    }
      public int getcedula1(){
        return cedula1;
    }
     public String getcorreo1(){
        return correo1;
    }
       public int getedad1(){
        return edad1;
    }
        public String getmateria1(){
        return materia1;
    }
        
   //Setter
        public void setnombre1(){
            this.nombre1=nombre1;
        }
        public void setcorreo1(){
            this.correo1=correo1;
        }
         public void setcedula1(){
            this.cedula1=cedula1;
        }
          public void setedad1(){
            this.edad1=edad1;
        }
           public void setmateria1(){
            this.materia1=materia1;
        }
           //Imprimir valores
           public void MostrarInformacion1(){
               System.out.println("Docente"+nombre1+"Con  edad de :"+edad1+"Imparte clase de: "+materia1+"Cedula del docente:"+cedula1+"Correo:"+correo1+".");
               
           }
    
}
