package co.com.sofka.domain.inventario.valor;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofka.domain.inventario.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ListaInventario implements ValueObject<Object> {


    private Set<Producto> productos;

    public ListaInventario(Set<Producto> productos) {
        this.productos = productos;
    }

    public Set<Producto> agregarProductos(Producto producto){
        productos.add(producto);
        return productos ;
    }

    public void eliminarProductoPorID(ProductoID productoid){
        productos.stream().filter( producto1 -> producto1.identity().equals(productoid));
        
    }

    @Override
    public Object value() {
        return null;
    }
}
