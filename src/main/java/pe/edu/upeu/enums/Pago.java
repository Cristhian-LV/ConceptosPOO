package pe.edu.upeu.enums;

enum TIPO_PAGO{Efecticvo, Credito, Transferencia, Yape}

enum MES{Enero, Febrero}

public class Pago {
    TIPO_PAGO tipo;
    MES mes;
    double monto;
    double impuesto;
    String cuenta;

    public static void main(String[] args) {
        Pago p=new Pago();
        p.tipo=TIPO_PAGO.Efecticvo;
        p.mes=MES.Enero;
        p.monto=100.0;
        p.impuesto=10.0;
        p.cuenta="1234 1234 1234 1234";

        System.out.println("Tipo de Pago: "+p.tipo);
        System.out.println("Mes: "+p.mes);
        System.out.println("Monto: "+p.monto);
        System.out.println("Impuesto: "+p.impuesto);
        System.out.println("Cuenta: "+p.cuenta);
        System.out.println();

        for (TIPO_PAGO t:TIPO_PAGO.values()){
            System.out.println("Tipo de Pago: "+t);
        }
    }
}
