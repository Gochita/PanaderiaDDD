package co.com.sofka.domain.inventario.Eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.inventario.valor.Descripcion;
import co.com.sofka.domain.inventario.valor.Nombre;
import co.com.sofka.domain.inventario.valor.Precio;
import co.com.sofka.domain.inventario.valor.ProductoID;


public class ProductoAgregado extends DomainEvent {

   private final ProductoID productoID;
   private final Nombre nombre;
   private final Descripcion descripcion;
   private final Precio precio;


    public ProductoAgregado(ProductoID productoID, Nombre nombre, Descripcion descripcion,Precio precio) {
        super("Sofka.Inventario.inventarioCreado");
        this.productoID = productoID;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public ProductoID getProductoID() {
        return productoID;
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
