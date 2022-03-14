package co.com.sofka.domain.ventas;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.inventario.Producto;
import co.com.sofka.domain.inventario.valor.ProductoID;
import co.com.sofka.domain.ventas.valor.ProductoId;

import java.util.ArrayList;
import java.util.List;

public class Carrito extends Entity {

    private List<ProductoId> productosCarrito = new ArrayList<>();
    
    public Carrito(Identity carritoId) {
        super(carritoId);
    }

    public void agregarProducto(ProductoId productoId){
        productosCarrito.add(productoId);
    }

    public void eliminarProducto(ProductoID productoID){
        for (ProductoId productoId:productosCarrito) {
            if(productoId.value().equals(productoID)){
                productosCarrito.remove(productoId);
            }
            else{
                System.out.println("Producto no encontrado");
            }
        }
    }

    public List<ProductoId> listarProductos(){
        return productosCarrito;
    }

}
