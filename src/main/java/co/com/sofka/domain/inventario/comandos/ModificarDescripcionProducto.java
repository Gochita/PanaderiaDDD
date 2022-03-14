package co.com.sofka.domain.inventario.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.inventario.valor.Descripcion;
import co.com.sofka.domain.inventario.valor.InventarioID;
import co.com.sofka.domain.inventario.valor.ProductoID;

public class ModificarDescripcionProducto extends Command {

    private final InventarioID inventarioID;
    private final ProductoID productoID;
    private final Descripcion descripcion;

    public ModificarDescripcionProducto(InventarioID inventarioID, ProductoID productoID, Descripcion descripcion){
        this.inventarioID=inventarioID;
        this.productoID=productoID;
        this.descripcion=descripcion;
    }

    public InventarioID getInventarioID() {
        return inventarioID;
    }

    public ProductoID getProductoID() {
        return productoID;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
