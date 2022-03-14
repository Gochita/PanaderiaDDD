package co.com.sofka.domain.inventario.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.inventario.valor.InventarioID;

public class CrearInventario extends Command {
    private final InventarioID inventarioID;

    public CrearInventario(InventarioID inventarioID){
        this.inventarioID=inventarioID;
    }

    public InventarioID getInventarioID() {
        return inventarioID;
    }
}

