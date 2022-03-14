package co.com.sofka.domain.ventas;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.ventas.valor.Descripcion;
import co.com.sofka.domain.ventas.valor.Nombre;
import co.com.sofka.domain.ventas.valor.Precio;
import co.com.sofka.domain.ventas.valor.ProductoId;

import java.util.ArrayList;
import java.util.List;

public class Carrito extends Entity {

    private List<ProductoVenta> productosCarrito = new ArrayList<>();
    
    public Carrito(Identity carritoId) {
        super(carritoId);
    }

    public void agregarProducto(
                                ProductoId productoId ,
                                Precio precio,
                                Descripcion descripcion ,
                                Nombre nombre){

        ProductoVenta productoVenta = new ProductoVenta(productoId, precio, descripcion ,nombre);
        productosCarrito.add(productoVenta);
    }

    public void eliminarProducto(ProductoId productoID){
        for (ProductoVenta productoVenta :productosCarrito) {
            if(productoVenta.equals(productoVenta)){
                productosCarrito.remove(productoVenta);
            }
            else{
                System.out.println("Producto no encontrado");
            }
        }
    }

    public List<ProductoVenta> listarProductos(){
        return productosCarrito;
    }

}
