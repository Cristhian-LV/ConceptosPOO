package pe.edu.upeu.claseInterna;

public class ClaseExterna {

    int a,b;

    class claseInterna1{
        double r;
        double sumar(){
            r=a+b;
            return r;
        }
    }

    class claseInterna2{
        double r;
        double restar(){
            r=a-b;
            return r;
        }
    }

    public static void main(String[] args) {
        ClaseExterna c = new ClaseExterna();
        c.a=10;
        c.b=5;
        claseInterna1 ci1=c.new claseInterna1();
        System.out.println(ci1.sumar());

        claseInterna2 ci2=c.new claseInterna2();
        ci2.restar();
        System.out.println(ci2.r);
    }
}

class ClaseExterna3{

}