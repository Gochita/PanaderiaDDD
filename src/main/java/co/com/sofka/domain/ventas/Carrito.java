package co.com.sofka.domain.ventas;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.inventario.Producto;
import co.com.sofka.domain.inventario.valor.ProductoID;
import co.com.sofka.domain.ventas.valor.ProductoId;

import java.util.ArrayList;
import java.util.List;

public class Carrito extends Entity {

    private List<Producto> productosCarrito = new ArrayList<>();
    
    public Carrito(Identity carritoId) {
        super(carritoId);
    }

    public void agregarProducto(Producto producto){
        productosCarrito.add(producto);
    }

    public void eliminarProducto(ProductoID productoID){
        for (Producto producto:productosCarrito) {
            if(producto.equals(producto)){
                productosCarrito.remove(producto);
            }
            else{
                System.out.println("Producto no encontrado");
            }
        }
    }

    public List<Producto> listarProductos(){
        return productosCarrito;
    }

}
