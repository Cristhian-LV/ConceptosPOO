package pe.edu.upeu.claseinterface;

public class Gato implements Animal {

    @Override
    public void emitirSonido() {
        System.out.println("miu, miau");
    }

    @Override
    public void dormir() {
        System.out.println("zzzz zzzz zzz");
    }
}
