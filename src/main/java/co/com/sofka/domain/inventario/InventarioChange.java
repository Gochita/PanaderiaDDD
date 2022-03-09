package co.com.sofka.domain.inventario;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domain.inventario.Eventos.ProductoEliminado;
import co.com.sofka.domain.inventario.Eventos.SurtidorModificado;

import java.util.function.Consumer;

public class InventarioChange extends EventChange {

    public InventarioChange(Inventario inventario) {

        /*apply((ProductoEliminado event) ->
                inventario.eliminarProducto(event.getProducto() ) );

        apply((SurtidorModificado event ) ->{
            inventario.modificarSurtidor();
        });*/
    }
}
