package co.com.sofka.domain.ventas;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;

import co.com.sofka.domain.ventas.valor.Descripcion;
import co.com.sofka.domain.ventas.valor.Nombre;
import co.com.sofka.domain.ventas.valor.Precio;
import co.com.sofka.domain.ventas.valor.ProductoId;

import java.util.Objects;

public class ProductoVenta extends Entity<ProductoId> {

    private Precio precio;
    private Descripcion descripcion;
    private Nombre nombre;

    public ProductoVenta(ProductoId entityId , Precio precio, Descripcion descripcion , Nombre nombre) {
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
}
