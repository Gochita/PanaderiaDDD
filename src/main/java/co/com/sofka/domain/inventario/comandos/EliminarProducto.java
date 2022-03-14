package co.com.sofka.domain.inventario.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.inventario.valor.InventarioID;
import co.com.sofka.domain.inventario.valor.ProductoID;

public class EliminarProducto extends Command {

    private InventarioID inventarioID;
    private ProductoID productoID;


    public EliminarProducto(InventarioID inventarioID){

        this.inventarioID=inventarioID;
        this.productoID=productoID;
    }

    public InventarioID getInventarioID() {
        return inventarioID;
    }

    public ProductoID getProductoID() {
        return productoID;
    }
}
