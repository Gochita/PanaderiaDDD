package co.com.sofka.domain.ventas;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domain.ventas.events.CarritoCreado;
import co.com.sofka.domain.ventas.events.ProuctoAgregadoACarrito;
import co.com.sofka.domain.ventas.events.VentaCreada;

public class VentaEventChange extends EventChange {

    public VentaEventChange(Ventas ventas) {

        apply((VentaCreada event) -> {
            ventas.fecha = event.getFecha();
        });

        apply((CarritoCreado event) -> {
            ventas.carrito = new Carrito(event.getCarritoId());
        });

        apply(((ProuctoAgregadoACarrito event) -> {
            ventas.carrito.agregarProducto(event.getProductoId(),
                    event.getPrecio(),
                    event.getDescripcion(),
                    event.getNombre());
        }));

    }
}
