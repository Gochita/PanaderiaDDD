package co.com.sofka.domain.inventario.Eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.inventario.valor.Descripcion;
import co.com.sofka.domain.inventario.valor.ProductoID;

public class DescripcionProductoModificado extends DomainEvent {
    public DescripcionProductoModificado(ProductoID entityID , Descripcion descripcion) {
        super("Descripción modificada");
    }
}
