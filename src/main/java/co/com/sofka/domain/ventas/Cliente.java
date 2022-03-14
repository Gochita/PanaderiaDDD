package co.com.sofka.domain.ventas;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.ventas.valor.ClienteId;
import co.com.sofka.domain.ventas.valor.Nombre;
import co.com.sofka.domain.ventas.valor.Telefono;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Entity<ClienteId> {

    private Nombre nombre;
    private Telefono telefono;


    public Cliente(ClienteId clienteId, Nombre nombre, Telefono telefono){
        super(clienteId);
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Telefono Telefono() {
        return telefono;
    }
}
