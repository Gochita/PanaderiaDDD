package co.com.sofka.domain.inventario.Eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.inventario.valor.Nombre;
import co.com.sofka.domain.inventario.valor.SurtidorID;

import co.com.sofka.domain.ventas.valor.Telefono;

public class SurtidorModificado extends DomainEvent {
    private final SurtidorID entityId;
    private final Telefono telefono;
    private final  Nombre nombre;

    public SurtidorModificado(SurtidorID entityId , Telefono telefono, Nombre nombre) {
        super("Sofka.Inventario.SurtidorModificado");
        this.entityId = entityId;
        this.nombre= nombre;
        this.telefono = telefono;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public SurtidorID getEntityId() {
        return entityId;
    }
}
