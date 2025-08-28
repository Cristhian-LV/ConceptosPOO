package pe.edu.upeu.encapsulamiento;

public class ClaseGeneral {
    public static void main(String[] args) {
        Persona per=new Persona();
        per.setNombre("Juan");
        per.edad=20;
        per.saludo();

        per.setNombre("Cristhian");
        per.setEdad(25);
        per.saludo();
    }
}
