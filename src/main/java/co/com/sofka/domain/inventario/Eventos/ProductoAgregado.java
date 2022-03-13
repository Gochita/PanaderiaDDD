package co.com.sofka.domain.inventario.Eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.inventario.valor.Nombre;
import co.com.sofka.domain.inventario.valor.ProductoID;
import co.com.sofka.domain.inventario.valor.Telefono;

public class ProductoAgregado extends DomainEvent {

   private final ProductoID productoID;
   private final Nombre nombre;
   private final Telefono telefono;


    public ProductoAgregado(ProductoID productoID, Nombre nombre, Telefono telefono) {
        super("Sofka.Inventario.inventarioCreado");
        this.productoID = productoID;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public ProductoID getProductoID() {
        return productoID;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
