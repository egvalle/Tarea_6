package edu.umg;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Persona persona1 = new Persona ("Carlos", 25);
        persona1.Presentacion();

        Persona persona2 = new Persona ("Zapatero");

        Presentacion presentacion = new Presentacion("Zapatero");
        presentacion.Presentacion("arreglo zapatos");


    }
}
