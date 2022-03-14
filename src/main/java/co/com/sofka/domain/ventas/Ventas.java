package co.com.sofka.domain.ventas;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ventas.events.CarritoCreado;
import co.com.sofka.domain.ventas.events.VentaCreada;
import co.com.sofka.domain.ventas.valor.*;

import java.util.ArrayList;
import java.util.List;

public class Ventas extends AggregateEvent<VentasId>{

    protected Cliente cliente;
    protected VendedorId vendedorId;
    protected MetodoPago metodoPago;
    protected Total total;
    protected Fecha fecha;
    protected Factura factura;
    protected Carrito carrito;
    private List<Cliente> clientes = new ArrayList();


    public Ventas(VentasId ventasId,
                      Fecha fecha) {
        super(ventasId);
        subscribe(new VentaEventChange(this));
        appendChange(new VentaCreada(entityId, fecha)).apply();
    }

    private Ventas(VentasId ventasId) {
        super(ventasId);
        subscribe(new VentaEventChange(this));
    }

    public static Ventas from(VentasId entityId, List<DomainEvent> list) {
        Ventas venta = new Ventas(entityId);
        list.forEach(venta::applyEvent);
        return venta;
    }

    public void crearCarrito(CarritoId carritoId){
        appendChange(new CarritoCreado(carritoId)).apply();
    }

    public void crearCliente(ClienteId clienteId, Nombre nombre, Telefono telefono){
        for (Cliente cliente: clientes) {
            if(cliente.identity().equals(clienteId)){
                System.out.println("Cliente ya existe");
            }
            Cliente clientito = new Cliente(clienteId, nombre, telefono);
            clientes.add(clientito);
        }
    }

    public void eliminarCliente(ClienteId clienteId){
        for (Cliente cliente:clientes) {
            if(cliente.identity().equals(clienteId)){
                clientes.remove(cliente);
            }
            else{
                System.out.println("Cliente no encontrado");
            }
        }
    }

    public void actualizarCliente(ClienteId clienteId,Nombre nombre, Telefono telefono){
        for (Cliente cliente:clientes) {
            if(cliente.identity().equals(clienteId)){
                eliminarCliente(clienteId);
                crearCliente(clienteId, nombre, telefono);
            }else{
                System.out.println("Cliente no encontrado");
            }
        }
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public Total getTotal() {
        return total;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Factura getFactura() {
        return factura;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
