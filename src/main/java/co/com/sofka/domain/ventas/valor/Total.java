package co.com.sofka.domain.ventas.valor;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.generic.ValueObject;
import co.com.sofka.domain.inventario.Producto;
import co.com.sofka.domain.ventas.Carrito;


public class Total implements ValueObject<Double>  {

    Identity carritoId;
    Carrito carrito = new Carrito(carritoId);
    Double contador = 0.0;


    @Override
    public Double value() {
        for (Producto producto: carrito.listarProductos()) {
            contador = contador + producto.Precio().getPrice();
        }
        return contador;
    }

}
