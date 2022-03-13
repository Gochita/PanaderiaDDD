package co.com.sofka.domain.inventario.Eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.inventario.valor.Descripcion;
import co.com.sofka.domain.inventario.valor.ProductoID;

public class DescripcionProductoModificado extends DomainEvent {
    private final ProductoID entityID;
    private final Descripcion descripcion;

    public DescripcionProductoModificado(ProductoID entityID , Descripcion descripcion) {
        super("Sofka.Inventario.DescripcionModificada");
        this.entityID = entityID;
        this.descripcion = descripcion;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public ProductoID getEntityID() {
        return entityID;
    }
}
