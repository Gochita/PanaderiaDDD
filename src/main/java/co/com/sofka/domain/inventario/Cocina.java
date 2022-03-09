package co.com.sofka.domain.inventario;

import co.com.sofka.domain.inventario.valor.Descripcion;
import co.com.sofka.domain.inventario.valor.Precio;
import co.com.sofka.domain.inventario.valor.ProductoID;

import java.util.ArrayList;
import java.util.List;

public class Cocina {

    List<Producto> listaProductos = new ArrayList();
    private ProductoID productoID;

    Precio precioUno = new Precio(500.00);
    Descripcion descripcion = new Descripcion("");

    Producto panQueso = new Producto( productoID, precioUno, descripcion);
    Producto panMantequilla = new Producto( productoID, precioUno, descripcion);
    Producto panArequipe = new Producto( productoID, precioUno, descripcion);
    Producto panMariquiteño = new Producto( productoID, precioUno, descripcion);
    Producto cocaCola = new Producto( productoID, precioUno, descripcion);
}
