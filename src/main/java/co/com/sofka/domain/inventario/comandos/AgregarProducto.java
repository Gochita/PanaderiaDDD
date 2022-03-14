package co.com.sofka.domain.ventas.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.ventas.valor.Descripcion;
import co.com.sofka.domain.ventas.valor.Nombre;
import co.com.sofka.domain.ventas.valor.Precio;
import co.com.sofka.domain.ventas.valor.ProductoId;
import co.com.sofka.domain.ventas.valor.VentasId;

public class AgregarProducto extends Command {
    private final VentasId ventasId;
    private final ProductoId productoId;
    private final Nombre nombre;
    private final Descripcion descripcion;
    private final Precio precio;

    public AgregarProducto(VentasId ventasId,
                           ProductoId productoId,
                           Nombre nombre,
                           Descripcion descripcion,
                           Precio precio){
        this.ventasId=ventasId;
        this.productoId=productoId;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.precio=precio;
    }

    public VentasId getVentasId() {
        return ventasId;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Precio getPrecio() {
        return precio;
    }
}
