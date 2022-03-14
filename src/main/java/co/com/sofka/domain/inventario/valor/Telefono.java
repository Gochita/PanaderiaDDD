package co.com.sofka.domain.inventario.valor;

import co.com.sofka.domain.generic.ValueObject;

public class Descripcion implements ValueObject<String> {

    private final String telefono;

    protected Telefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String value() {
        return this.telefono;
    }
}
