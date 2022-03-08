package co.com.sofka.domain.ventas.valor;

import co.com.sofka.domain.generic.ValueObject;

public class Nombre implements ValueObject<String> {

    private String nombre;
    private String apellido;


    public Nombre(String primerNombre, String segundoNombre) {
        this.nombre = primerNombre;
        this.apellido = segundoNombre;
    }

    @Override
    public String value() {
        return nombre + " " + apellido;
    }

}
