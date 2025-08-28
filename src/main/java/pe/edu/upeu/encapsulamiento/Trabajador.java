package pe.edu.upeu.encapsulamiento;

public class Trabajador {
    private String nombre;
    private String apellido;
    private int edad;
    private char genero;
    private String area;

    @Override
    public String toString() {
        return "Tiene las siguientes características:" +
                "\nnombre: "+nombre+
                "\napellido: "+apellido;
    }
}
