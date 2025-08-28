package pe.edu.upeu.claseinterface;

public class ClaseGeneral {

    public static void main(String[] args) {
        Animal an=new Loro();

        an.emitirSonido();
        an.dormir();

        an=new Gato();
        an.emitirSonido();
        an.dormir();
    }
}
