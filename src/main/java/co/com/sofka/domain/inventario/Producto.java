package co.com.sofka.domain.inventario;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.inventario.valor.Descripcion;
import co.com.sofka.domain.inventario.valor.Precio;
import co.com.sofka.domain.inventario.valor.ProductoID;
import co.com.sofka.domain.inventario.valor.SurtidorID;

import java.util.Objects;

public class Producto extends Entity<ProductoID> {


    private  Precio precio;
    private  Descripcion descripcion;

    public Producto(ProductoID entityId , Precio precio, Descripcion descripcion) {
        super(entityId);
        this.precio = precio;
        this.descripcion = descripcion;
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
}
