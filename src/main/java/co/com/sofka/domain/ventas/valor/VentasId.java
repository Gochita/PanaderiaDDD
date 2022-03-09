package co.com.sofka.domain.ventas.valor;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.inventario.valor.InventarioID;

public class VentasId extends Identity {
    private VentasId(String valor){
        super(valor);
    }

    public VentasId(){}
    public static VentasId of(String valor) {
        return new VentasId(valor);
    }
}
