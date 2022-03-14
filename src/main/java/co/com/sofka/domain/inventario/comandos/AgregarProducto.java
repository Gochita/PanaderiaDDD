package co.com.sofka.domain.inventario.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.inventario.valor.Descripcion;
import co.com.sofka.domain.inventario.valor.InventarioID;
import co.com.sofka.domain.inventario.valor.Nombre;
import co.com.sofka.domain.inventario.valor.Precio;

public class AgregarProducto extends Command {
    private final InventarioID inventarioID;
    private final Nombre nombre;
    private final Descripcion descripcion;
    private final Precio precio;

    public AgregarProducto(InventarioID inventarioID, Nombre nombre, Descripcion descripcion, Precio precio){

        this.inventarioID=inventarioID;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.precio=precio;
    }

    public InventarioID getInventarioID() {
        return inventarioID;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Precio getPrecio() {
        return precio;
    }
}
