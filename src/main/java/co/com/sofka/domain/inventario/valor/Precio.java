package co.com.sofka.domain.inventario.valor;

import co.com.sofka.domain.generic.ValueObject;

public class Precio implements ValueObject<Double> {

    private Double price;

    public Precio(Double price) {
        this.price = price;
    }


    @Override
    public Double value() {
        return this.price;
    }
}
