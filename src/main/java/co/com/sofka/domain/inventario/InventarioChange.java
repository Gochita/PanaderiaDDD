package co.com.sofka.domain.inventario;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domain.inventario.Eventos.*;

import java.util.ArrayList;
import java.util.function.Consumer;

public class InventarioChange extends EventChange {

    public InventarioChange(Inventario inventario) {

        apply((InventarioCreado event) ->{
            inventario.productos = new ArrayList<>();
            inventario.surtidor = new ArrayList<>();
        });


        apply((SurtidorAgregado event ) ->{
            Surtidor surtidor = new Surtidor(event.getSurtidorID(),event.getNombre(), event.getTelefono());
            inventario.surtidor.add(surtidor);
        });

        apply((ProductoAgregado event ) ->{
            Producto producto = new Producto(event.getProductoID(),
                    event.getNombre(),event.getDescripcion(),event.getPrecio());
            inventario.productos.add(producto);
        });

        apply((SurtidorEliminado event)->{
            var surtidorAEliminar = inventario.surtidor.stream()
                    .filter( item -> item.identity().equals(event.getSurtidorID())).findFirst()
                    .orElseThrow(()-> new RuntimeException("No se encuentra el surtidor"));
            inventario.surtidor.remove(surtidorAEliminar);
        });

        apply((ProductoEliminado event)->{
            var ProductoAEliminar = inventario.productos.stream()
                    .filter( item -> item.identity().equals(event.getProducto())).findFirst()
                    .orElseThrow(()-> new RuntimeException("No se encuentra el producto"));
            inventario.productos.remove(ProductoAEliminar);
        });

        apply((DescripcionProductoModificado event)->{
            inventario.getProductoPorID(event.getEntityID()).modificarDescripcion(event.getDescripcion());
        });
    }
}
