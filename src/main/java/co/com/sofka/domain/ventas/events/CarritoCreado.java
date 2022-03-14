package co.com.sofka.domain.ventas.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ventas.valor.CarritoId;

public class CarritoCreado extends DomainEvent {

    private final CarritoId carritoId;

    public CarritoCreado(CarritoId carritoId) {
        super("sofka.ventas.carritocreado");
        this.carritoId = carritoId;
    }

    public CarritoId getCarritoId() {
        return carritoId;
    }
}
