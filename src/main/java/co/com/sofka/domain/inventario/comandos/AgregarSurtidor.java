package co.com.sofka.domain.inventario.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.inventario.valor.InventarioID;
import co.com.sofka.domain.inventario.valor.Nombre;
import co.com.sofka.domain.inventario.valor.SurtidorID;
import co.com.sofka.domain.ventas.valor.Telefono;

public class AgregarSurtidor extends Command {
    private final InventarioID inventarioID;
    private final Nombre nombre;
    private final Telefono telefono;
    private final SurtidorID surtidorID;

    public AgregarSurtidor(InventarioID inventarioID, Nombre nombre, Telefono telefono, SurtidorID surtidorID){

        this.inventarioID=inventarioID;
        this.nombre=nombre;
        this.telefono=telefono;
        this.surtidorID=surtidorID;
    }

    public InventarioID getInventarioID() {
        return inventarioID;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public SurtidorID getSurtidorID() {
        return surtidorID;
    }
}
