package co.com.sofka.domain.inventario;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.inventario.Eventos.SurtidorAgregado;
import co.com.sofka.domain.inventario.valor.*;

import java.util.List;
import java.util.Objects;

public class Inventario extends AggregateEvent<InventarioID> {

    protected ListaInventario listaInventario;
    protected Producto producto;
    protected List<Surtidor> surtidor;


    public Inventario(InventarioID inventarioId , ListaInventario listaInventario ) {
        super(inventarioId);


    }

    public void agregarSurtidor(SurtidorID entityId , Telefono telefono, Nombre nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(telefono);
        Objects.requireNonNull(nombre);
        appendChange(new SurtidorAgregado(entityId,telefono,nombre)).apply();
    }

    public void modificarSurtidor(){
        appendChange(new SurtidorModificado()).apply();
    }

    public void eliminarSurtidor(){
        appendChange(new SurtidorEliminado()).apply();
    }

    public void eliminarProducto(ListaInventario listaInventario, ProductoID entityID){
        appendChange(new ProductoEliminado(entityID)).apply();
    }

    public void modificarDescripcionProducto(ProductoID entityID , Descripcion descripcion){
        appendChange(new descripcionProductoModificado(entityID,descripcion)).apply();
    }

    public ListaInventario ListaInventario() {
        return listaInventario;
    }

    public Producto Producto() {
        return producto;
    }

    public List<Surtidor> Surtidor() {
        return surtidor;
    }
    public Producto getProductoId(ProductoID productoID){
        listaInventario.value();
    }
}