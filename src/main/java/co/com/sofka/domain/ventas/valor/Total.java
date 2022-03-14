package co.com.sofka.domain.ventas.valor;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofka.domain.ventas.ProductoVenta;
import co.com.sofka.domain.ventas.Carrito;


public class Total implements ValueObject<Double>  {

    Double contador = 0.0;
    private final CarritoId carritoId;

    public Total(CarritoId carritoId) {
        this.carritoId = carritoId;
    }


    public Double sumarProductos(){
        Carrito carrito = new Carrito(carritoId);
        for (ProductoVenta productoVenta : carrito.listarProductos()) {
            contador = contador + productoVenta.Precio().value();
        }
        return contador;
    }

    @Override
    public Double value() {
        return this.sumarProductos();
    }

}
