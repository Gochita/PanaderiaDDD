package co.com.sofka.domain.ventas.valor;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofka.domain.ventas.Carrito;
import co.com.sofka.domain.ventas.Cliente;

public class Factura implements ValueObject<String> {

    private final Fecha fecha;
    private final ClienteId clienteId;
    private final Total total;
    private final VendedorId vendedorId;
    private final CarritoId carritoId;
    private final MetodoPago metodoPago;

    public Factura(Fecha fecha, ClienteId clienteId, Total total, VendedorId vendedorId, CarritoId carritoId, MetodoPago metodoPago) {
        this.fecha = fecha;
        this.clienteId = clienteId;
        this.total = total;
        this.vendedorId = vendedorId;
        this.carritoId = carritoId;
        this.metodoPago = metodoPago;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "fecha=" + fecha +
                ", clienteId=" + clienteId +
                ", total=" + total +
                ", vendedorId=" + vendedorId +
                ", carritoId=" + carritoId +
                ", metodoPago=" + metodoPago +
                '}';
    }

    @Override
    public String value() {
        return this.toString();
    }
}
