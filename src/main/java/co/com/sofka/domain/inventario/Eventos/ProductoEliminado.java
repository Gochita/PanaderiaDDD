package co.com.sofka.domain.inventario.Eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.inventario.Producto;
import co.com.sofka.domain.inventario.valor.ProductoID;

public class ProductoEliminado extends DomainEvent {
    private Producto producto;

    public ProductoEliminado(Producto producto) {
        super("ProductoEliminado");
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }
}
