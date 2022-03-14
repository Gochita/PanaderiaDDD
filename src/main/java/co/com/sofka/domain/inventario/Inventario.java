package co.com.sofka.domain.inventario;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.inventario.Eventos.*;

import co.com.sofka.domain.inventario.valor.*;
import co.com.sofka.domain.ventas.valor.Telefono;

import java.util.List;
import java.util.Objects;

public class Inventario extends AggregateEvent<InventarioID> {

    protected List<Producto> productos;
    protected List<Surtidor> surtidor;


    private Inventario(InventarioID inventarioId){
        super(inventarioId);
        subscribe(new InventarioChange(this));
        appendChange(new InventarioCreado(inventarioId));
    }

    public static Inventario from(InventarioID inventarioId , List<DomainEvent> events){
        Inventario inventario = new Inventario(inventarioId);
        events.forEach(inventario::applyEvent);
        return inventario;

    }

    public void agregarSurtidor(SurtidorID entityId , Telefono telefono, Nombre nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(telefono);
        Objects.requireNonNull(nombre);
        appendChange(new SurtidorAgregado(entityId,nombre,telefono)).apply();
    }

    public void agregarProducto(ProductoID productoID, Nombre nombre, Descripcion descripcion, Precio precio){
        Objects.requireNonNull(productoID);
        Objects.requireNonNull(descripcion);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(precio);
        appendChange(new ProductoAgregado(productoID,nombre,descripcion, precio ) ).apply();
    }

    public void modificarSurtidor(SurtidorID entityId , Telefono telefono, Nombre nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(telefono);
        Objects.requireNonNull(nombre);
        appendChange(new SurtidorModificado(entityId,telefono,nombre)).apply();
    }

    public void eliminarSurtidor(SurtidorID entityId){
        appendChange(new SurtidorEliminado(entityId)).apply();
    }

    public void eliminarProducto(ProductoID productoID){
        appendChange(new ProductoEliminado(productoID)).apply();
    }

    public void modificarDescripcionProducto(ProductoID entityID , Descripcion descripcion){

        appendChange(new DescripcionProductoModificado(entityID,descripcion)).apply();
    }

    public List<Producto> Productos() {
        return productos;
    }

    public List<Surtidor> Surtidor() {
        return surtidor;
    }
}
