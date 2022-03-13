package co.com.sofka.domain.inventario.Eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.inventario.valor.Nombre;
import co.com.sofka.domain.inventario.valor.SurtidorID;
import co.com.sofka.domain.inventario.valor.Telefono;

public class SurtidorAgregado extends DomainEvent {
    private final Nombre nombre;
    private final Telefono telefono;
    private final SurtidorID surtidorID;


    public SurtidorAgregado(Nombre nombre, Telefono telefono, SurtidorID surtidorID) {
        super("sofka.Inventario.SurtidorCreado");
        this.nombre = nombre;
        this.telefono = telefono;
        this.surtidorID = surtidorID;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public SurtidorID getSurtidorID() {
        return surtidorID;
    }
}
