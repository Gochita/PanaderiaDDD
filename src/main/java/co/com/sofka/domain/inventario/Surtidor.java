package co.com.sofka.domain.inventario;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.inventario.valor.Nombre;
import co.com.sofka.domain.inventario.valor.SurtidorID;
import co.com.sofka.domain.inventario.valor.Telefono;

import java.util.Objects;

public class Surtidor extends Entity<SurtidorID> {

    private Telefono telefono;
    private Nombre nombre;
    
    public Surtidor(SurtidorID entityId , Nombre nombre, Telefono telefono) {
        super(entityId);
        this.nombre = nombre;
        this.telefono = telefono;

    }

    public Telefono Telefono() {
        return telefono;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public void modificarNombre(Nombre nuevoNombre){
        this.nombre = Objects.requireNonNull(nuevoNombre);
    }

    public void modificarTelefono(Telefono nuevotelefono){
        this.telefono = Objects.requireNonNull(nuevotelefono);
    }
}
