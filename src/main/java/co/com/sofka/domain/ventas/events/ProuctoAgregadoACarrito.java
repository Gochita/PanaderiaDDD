package co.com.sofka.domain.ventas.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ventas.valor.Descripcion;
import co.com.sofka.domain.ventas.valor.Nombre;
import co.com.sofka.domain.ventas.valor.Precio;
import co.com.sofka.domain.ventas.valor.ProductoId;

public class ProuctoAgregadoACarrito extends DomainEvent {

    private final ProductoId productoId;
    private final Precio precio;
    private final Descripcion descripcion;
    private final Nombre nombre;

    public ProuctoAgregadoACarrito(ProductoId productoId,
                                   Precio precio,
                                   Descripcion descripcion,
                                   Nombre nombre) {
        super("sofka.ventas.productoagregadoacarrito");
        this.productoId = productoId;
        this.precio = precio;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
