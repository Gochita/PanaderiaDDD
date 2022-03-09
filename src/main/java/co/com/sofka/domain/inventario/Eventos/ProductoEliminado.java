package co.com.sofka.domain.inventario.Eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.inventario.valor.ProductoID;

public class ProductoEliminado extends DomainEvent {
    

    public ProductoEliminado( ProductoID entityID) {
        super("ProductoEliminado");
    }
}
