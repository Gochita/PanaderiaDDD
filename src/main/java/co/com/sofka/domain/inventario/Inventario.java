package co.com.sofka.domain.inventario;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.inventario.valor.InventarioID;
import co.com.sofka.domain.inventario.valor.ListaInventario;

public class Inventario extends AggregateEvent<InventarioID> {

    protected ListaInventario listaInventario;
    protected Surtidor surtidor;

    public Inventario(InventarioID inventarioId , ListaInventario listaInventario ) {
        super(inventarioId);
    }


}
