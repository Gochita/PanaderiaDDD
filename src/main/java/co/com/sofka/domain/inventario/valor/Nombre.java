package co.com.sofka.domain.inventario.valor;

import co.com.sofka.domain.generic.ValueObject;

public class Nombre implements ValueObject<String> {
   private final String nombre;

    public Nombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String value() {
        return this.nombre;
    }
}
