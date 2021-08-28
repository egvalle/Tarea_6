package edu.umg;

public class Presentacion extends Persona{


    public Presentacion(String profesion) {
        super(profesion);
    }

    @Override
    public void Presentacion(String pf) {
        super.Presentacion(pf);
        System.out.println("Eso quiere decir que " + pf);
    }

}
