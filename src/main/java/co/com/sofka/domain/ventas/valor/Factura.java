package co.com.sofka.domain.ventas.valor;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofka.domain.ventas.Carrito;
import co.com.sofka.domain.ventas.Cliente;

public class Factura implements ValueObject<String> {

    private Fecha fecha = new Fecha();
    private Cliente cliente;
    private Total total;
    private Vendedor vendedor;
    private Carrito carrito;

    public Factura(Fecha fecha, Cliente cliente, Total total, Vendedor vendedor, Carrito carrito) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.total = total;
        this.vendedor = vendedor;
        this.carrito = carrito;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "fecha=" + fecha.value() +
                ", cliente=" + cliente.nombre() +
                ", vendedor=" + vendedor.value() +
                ", carrito=" + carrito.listarProductos() +
                ", total=" + total.value() +
                '}';
    }

    @Override
    public String value() {
        return this.toString();
    }
}
