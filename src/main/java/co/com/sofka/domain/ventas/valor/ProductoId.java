package co.com.sofka.domain.ventas.valor;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.inventario.valor.ProductoID;

public class ProductoId extends Identity {

    private ProductoId(String valor){
        super(valor);
    }

    public ProductoId(){}
    public static ProductoId of(String valor) {
        return new ProductoId(valor);
    }
}
