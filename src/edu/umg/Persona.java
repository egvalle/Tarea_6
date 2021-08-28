package edu.umg;

public class Persona {

    private String nombre;
    private int edad;
    private String profesion;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;

    }

    public Persona(String profesion){
        this.profesion = profesion;

    }

    public void Presentacion(){
        System.out.println("Hola me llamo " + nombre + " y tengo " + edad + " años.");

    }

    public void Presentacion(String pf){
        System.out.println("Mi profesion es " + profesion);
    }



}
