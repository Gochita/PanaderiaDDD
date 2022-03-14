package co.com.sofka.domain.ventas.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.ventas.comandos.AgregarProducto;
import co.com.sofka.domain.ventas.Ventas;

public class AgregarProductoVentaUseCase extends UseCase<RequestCommand<AgregarProducto>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarProducto> input) {
        var command = input.getCommand();
        var venta = Ventas.from(command.getVentasId(), retrieveEvents());
        venta.agregarProductoACarrito(command.getProductoId(),
                command.getPrecio(),
                command.getDescripcion(),
                command.getNombre());

        emit().onResponse(new ResponseEvents(venta.getUncommittedChanges()));
    }
}
