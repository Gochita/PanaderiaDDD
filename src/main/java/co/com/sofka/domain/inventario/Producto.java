package co.com.sofka.domain.inventario;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.inventario.valor.*;

import java.util.Objects;

public class Producto extends Entity<ProductoID> {


    private  Precio precio;
    private  Descripcion descripcion;
    private Nombre nombre;



    public Producto(ProductoID entityId,  Nombre nombre, Descripcion descripcion ,Precio precio) {
        super(entityId);
        this.precio = precio;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Precio Precio() {
        return precio;
    }

    public Descripcion Descripcion() {
        return descripcion;
    }

    public void modificarDescripcion(Descripcion nuevaDescripcion){
        this.descripcion = Objects.requireNonNull(nuevaDescripcion);
    }

    public void modificarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);

    }
}
