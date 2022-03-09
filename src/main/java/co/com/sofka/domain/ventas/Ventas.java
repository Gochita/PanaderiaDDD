package co.com.sofka.domain.ventas;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.inventario.valor.ListaInventario;
import co.com.sofka.domain.ventas.valor.*;

public class Ventas extends AggregateEvent<VentasId>{

    protected Cliente cliente;
    protected Vendedor vendedor;
    protected ListaInventario listaInventario;
    protected MetodoPago metodoPago;
    protected Total total;
    protected Fecha fecha;
    protected Factura factura;
    protected Carrito carrito;

    public Ventas(VentasId ventasId) {

        super(ventasId);
    }

    public void cancelarVenta(){

    }


}
