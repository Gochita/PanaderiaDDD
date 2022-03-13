package co.com.sofka.domain.ventas.valor;

import co.com.sofka.domain.generic.ValueObject;

public class VendedorId implements ValueObject<String> {

    private final String vendedorId;

    public VendedorId(String vendedorId) {
        this.vendedorId = vendedorId;
    }

    @Override
    public String value() {
        return null;
    }
}
