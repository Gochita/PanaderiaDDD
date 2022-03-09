package co.com.sofka.domain.inventario.valor;

import co.com.sofka.domain.generic.ValueObject;

public class Descripcion implements ValueObject<String> {

    private String  descripcion;

    public Descripcion(String  descripcion) {
        this.descripcion = descripcion;
    }


    @Override
    public String value() {
        return this.descripcion;
    }
}
