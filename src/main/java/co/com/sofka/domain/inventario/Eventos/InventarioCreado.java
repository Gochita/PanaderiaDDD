package co.com.sofka.domain.inventario.Eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.inventario.valor.InventarioID;

public class InventarioCreado extends DomainEvent {

    private final InventarioID inventarioID;

    public InventarioCreado(InventarioID inventarioId) {
        super("Sofka.inventario.inventarioCreado");
        this.inventarioID = inventarioId;
    }

    public InventarioID getInventarioID() {
        return inventarioID;
    }
}
