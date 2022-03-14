package co.com.sofka.domain.ventas.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.ventas.valor.CarritoId;
import co.com.sofka.domain.ventas.valor.VentasId;

public class CrearCarrito extends Command {

    private final VentasId ventasId;
    private final CarritoId carritoId;

    public CrearCarrito(VentasId ventasId, CarritoId carritoId) {
        this.ventasId = ventasId;
        this.carritoId = carritoId;
    }

    public VentasId getVentasId() {
        return ventasId;
    }

    public CarritoId getCarritoId() {
        return carritoId;
    }
}
