package co.com.sofka.domain.ventas.valor;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.generic.ValueObject;

public class ClienteId extends Identity {

    private ClienteId(String valor){
        super(valor);
    }

    public ClienteId(){

    }

    public static ClienteId of(String valor) {
        return new ClienteId(valor);
    }
}
