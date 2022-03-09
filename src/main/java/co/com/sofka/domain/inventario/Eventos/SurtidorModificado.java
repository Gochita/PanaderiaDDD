package co.com.sofka.domain.inventario.Eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.inventario.valor.Nombre;
import co.com.sofka.domain.inventario.valor.SurtidorID;
import co.com.sofka.domain.inventario.valor.Telefono;

public class SurtidorModificado extends DomainEvent {
    private SurtidorID entityId;
    private  Telefono telefono;
    private  Nombre nombre;

    public SurtidorModificado(SurtidorID entityId , Telefono telefono, Nombre nombre) {
        super("Surtidor ha sido Modificado");
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
}
