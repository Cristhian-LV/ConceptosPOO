package pe.edu.upeu.claseinterface;

public class Loro implements Animal {
    @Override
    public void emitirSonido() {
        System.out.println("Amigo, no seas flojo");
    }

    @Override
    public void dormir() {
        System.out.println("No molestar, tengo sueño");
    }
}
