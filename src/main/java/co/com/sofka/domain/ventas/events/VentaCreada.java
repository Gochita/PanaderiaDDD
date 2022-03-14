package co.com.sofka.domain.ventas.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ventas.valor.Fecha;
import co.com.sofka.domain.ventas.valor.VentasId;

public class VentaCreada extends DomainEvent {

    private final VentasId entityId;
    private final Fecha fecha;

    public VentaCreada(VentasId entityId, Fecha fecha) {
        super("sofka.ventas.ventacreada");
        this.entityId = entityId;
        this.fecha = fecha;
    }

    public VentasId getEntityId() {
        return entityId;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
