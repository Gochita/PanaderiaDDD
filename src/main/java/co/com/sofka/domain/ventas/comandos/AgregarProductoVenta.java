package co.com.sofka.domain.ventas.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.ventas.valor.Descripcion;
import co.com.sofka.domain.ventas.valor.Nombre;
import co.com.sofka.domain.ventas.valor.Precio;
import co.com.sofka.domain.ventas.valor.ProductoId;

public class AgregarProductoVenta extends Command {

    private final ProductoId productoId;
    private final Nombre nombre;
    private final Precio precio;
    private final Descripcion descripcion;


    public AgregarProductoVenta(ProductoId productoId, Nombre nombre, Precio precio, Descripcion descripcion) {
        this.productoId = productoId;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
