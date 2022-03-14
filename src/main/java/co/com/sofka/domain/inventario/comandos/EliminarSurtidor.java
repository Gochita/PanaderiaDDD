package co.com.sofka.domain.inventario.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.inventario.valor.InventarioID;
import co.com.sofka.domain.inventario.valor.SurtidorID;

public class EliminarSurtidor extends Command {
    private final SurtidorID surtidorID;
    private final InventarioID inventarioID;

    public EliminarSurtidor(SurtidorID surtidorID, InventarioID inventarioID){

        this.surtidorID=surtidorID;
        this.inventarioID=inventarioID;

    }

    public SurtidorID getSurtidorID() {
        return surtidorID;
    }

    public InventarioID getInventarioID() {
        return inventarioID;
    }
}
