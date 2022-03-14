package co.com.sofka.domain.ventas.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.ventas.Ventas;
import co.com.sofka.domain.ventas.comandos.CrearCarrito;

public class CrearCarritoUseCase extends UseCase<RequestCommand<CrearCarrito>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearCarrito> input) {

        var command = input.getCommand();
        var venta = Ventas.from(command.getVentasId(), retrieveEvents());
        venta.crearCarrito(command.getCarritoId());

        emit().onResponse(new ResponseEvents(venta.getUncommittedChanges()));
    }
}
