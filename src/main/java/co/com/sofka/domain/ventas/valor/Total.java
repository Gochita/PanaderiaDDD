package co.com.sofka.domain.ventas.valor;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.generic.ValueObject;
import co.com.sofka.domain.inventario.Producto;
import co.com.sofka.domain.ventas.Carrito;


public class Total implements ValueObject<Double>  {

    Double contador = 0.0;

    public Double sumarProductos(Carrito carrito){
        for (ProductoId productoId: carrito.listarProductos()) {
            //contador = contador + productoId.value().getPrice();
        }
        return contador;
    }

    @Override
    public Double value() {
        return contador;
    }

}
