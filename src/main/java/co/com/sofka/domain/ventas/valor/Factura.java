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
    private MetodoPago metodoPago;

    public Factura(Fecha fecha, Cliente cliente, Total total, Vendedor vendedor, Carrito carrito, MetodoPago metodoPago) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.total = total;
        this.vendedor = vendedor;
        this.carrito = carrito;
        this.metodoPago = metodoPago;
    }


    @Override
    public String toString() {
        return "Factura{" +
                "fecha=" + fecha +
                ", cliente=" + cliente +
                ", vendedor=" + vendedor +
                ", carrito=" + carrito +
                ", metodoPago=" + metodoPago +
                ", total=" + total +
                '}';
    }

    @Override
    public String value() {
        return this.toString();
    }
}
