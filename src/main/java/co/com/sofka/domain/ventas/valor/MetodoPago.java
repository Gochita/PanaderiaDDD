package co.com.sofka.domain.ventas.valor;

import co.com.sofka.domain.generic.ValueObject;

public class MetodoPago implements ValueObject<MetodoPago.Pago> {
    private final Pago value;

    public MetodoPago(Pago value) {
        this.value = value;
    }


    @Override
    public Pago value() {

        return value ;
    }

    public enum Pago {
        EFECTIVO,
        TARJETA,
        OTRO
    }

    public static void main(String[] args) {

        MetodoPago pagar = new MetodoPago(Pago.TARJETA);
        System.out.println(pagar);
    }

}
