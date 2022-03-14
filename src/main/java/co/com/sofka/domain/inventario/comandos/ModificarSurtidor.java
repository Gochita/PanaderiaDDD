package co.com.sofka.domain.inventario.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.inventario.valor.InventarioID;
import co.com.sofka.domain.inventario.valor.Nombre;
import co.com.sofka.domain.inventario.valor.SurtidorID;
import co.com.sofka.domain.inventario.valor.Telefono;

public class ModificarSurtidor extends Command {

    private final InventarioID inventarioID;
    private final SurtidorID entityId;
    private final Telefono telefono;
    private final Nombre nombre;

    public ModificarSurtidor(InventarioID inventarioID, SurtidorID entityId, Telefono telefono, Nombre nombre) {
        this.inventarioID = inventarioID;
        this.entityId = entityId;
        this.telefono = telefono;
        this.nombre = nombre;
    }

    public InventarioID getInventarioID() {
        return inventarioID;
    }

    public SurtidorID getEntityId() {
        return entityId;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
