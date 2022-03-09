package co.com.sofka.domain.inventario.valor;

import co.com.sofka.domain.generic.Identity;

public class SurtidorID extends Identity {

    private SurtidorID(String valor){
        super(valor);
    }

    public SurtidorID(){}

    public static SurtidorID of(String valor) {
        return new SurtidorID(valor);
    }
}
