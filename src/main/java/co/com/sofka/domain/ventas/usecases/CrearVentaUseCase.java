package co.com.sofka.domain.ventas.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.ventas.Ventas;
import co.com.sofka.domain.ventas.comandos.CrearVenta;

public class CrearVentaUseCase extends UseCase<RequestCommand<CrearVenta>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearVenta> input) {
        var command = input.getCommand();

        var venta = new Ventas(command.getVentasId(), command.getFecha());

        emit().onResponse(new ResponseEvents(venta.getUncommittedChanges()));
    }
}
