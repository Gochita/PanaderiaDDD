package co.com.sofka.domain.inventario.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.inventario.Inventario;
import co.com.sofka.domain.inventario.comandos.CrearInventario;

public class CrearInventarioUseCase extends UseCase<RequestCommand<CrearInventario>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearInventario> crearInventarioRequestCommand) {
        var command = crearInventarioRequestCommand.getCommand();

        var inventario = new Inventario(command.getInventarioID());
        emit().onResponse(new ResponseEvents(inventario.getUncommittedChanges()));
    }
}
