package co.com.sofka.domain.inventario;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.inventario.valor.Nombre;
import co.com.sofka.domain.inventario.valor.SurtidorID;
import co.com.sofka.domain.inventario.valor.Telefono;

public class Surtidor extends Entity<SurtidorID> {

    private final Telefono telefono;
    private Nombre nombre;
    
    public Surtidor(SurtidorID entityId , Telefono telefono, Nombre nombre) {
        super(entityId);
        this.nombre = nombre;
        this.telefono = telefono;

    }


    public void modificarNombre(Nombre nuevoNombre){
        this.nombre = nuevoNombre;
    }
}
