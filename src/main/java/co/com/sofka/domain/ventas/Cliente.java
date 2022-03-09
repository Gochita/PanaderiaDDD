package co.com.sofka.domain.ventas;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.ventas.valor.ClienteId;
import co.com.sofka.domain.ventas.valor.Nombre;
import co.com.sofka.domain.ventas.valor.Telefono;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Entity<ClienteId> {

    private Nombre nombre;
    private Telefono telefono;
    private List<Cliente> clientes = new ArrayList();

     public Cliente(ClienteId clienteId, Nombre nombre, Telefono telefono){
         super(clienteId);
         this.nombre = nombre;
         this.telefono = telefono;
     }

    public void crearCliente(ClienteId clienteId, Nombre nombre, Telefono telefono){
        for (Cliente cliente: clientes) {
            if(cliente.entityId.equals(clienteId)){
                System.out.println("Cliente ya existe");
            }
            Cliente clientito = new Cliente(clienteId, nombre, telefono);
            clientes.add(clientito);
        }
    }

    public void eliminarCliente(ClienteId identificacion){

    }

    public void actualizarCliente(){

    }

    public Nombre nombre() {
        return nombre;
    }

    public Telefono telefono() {
        return telefono;
    }
}
