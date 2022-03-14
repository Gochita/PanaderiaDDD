package co.com.sofka.domain.inventario.Eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.inventario.valor.Nombre;
import co.com.sofka.domain.inventario.valor.SurtidorID;
import co.com.sofka.domain.ventas.valor.Telefono;


public class SurtidorAgregado extends DomainEvent {
    private final Nombre nombre;
    private final Telefono telefono;
    private final SurtidorID surtidorID;


    public SurtidorAgregado(SurtidorID surtidorID, Nombre nombre,Telefono telefono) {
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
