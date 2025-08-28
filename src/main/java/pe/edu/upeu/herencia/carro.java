package pe.edu.upeu.herencia;

public class carro extends vehiculo {

    private String modelo="Mustang";

    public static void main(String[] args) {
        carro c=new carro();
        c.sonido();
        System.out.println(c.marca+" "+c.modelo);
    }
}
