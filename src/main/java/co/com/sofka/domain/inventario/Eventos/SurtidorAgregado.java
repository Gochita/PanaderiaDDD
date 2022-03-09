package co.com.sofka.domain.inventario.Eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.inventario.valor.Nombre;
import co.com.sofka.domain.inventario.valor.SurtidorID;
import co.com.sofka.domain.inventario.valor.Telefono;

public class SurtidorAgregado extends DomainEvent {
    private Nombre nombre;

    public SurtidorAgregado(SurtidorID entityId , Telefono telefono, Nombre nombre) {
        super("SurtidorNuevoCreado");

    }

    public Nombre getNombre() {
        return nombre;
    }
}
