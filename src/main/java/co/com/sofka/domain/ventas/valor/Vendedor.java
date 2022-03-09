package co.com.sofka.domain.ventas.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.UUID;

public class Vendedor implements ValueObject<String> {
    private final UUID vendedorId = UUID.randomUUID();

    @Override
    public String value() {
        return vendedorId.toString();
    }

}





