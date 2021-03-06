package co.com.sofka.domain.inventario.Eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.inventario.valor.ProductoID;

public class ProductoEliminado extends DomainEvent {
    private ProductoID productoID;

    public ProductoEliminado(ProductoID producto) {
        super("Sofka.Inventario.ProductoEliminado");
        this.productoID = producto;
    }

    public ProductoID getProducto() {
        return productoID;
    }
}
