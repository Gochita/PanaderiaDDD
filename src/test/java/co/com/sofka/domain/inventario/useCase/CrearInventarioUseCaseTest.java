package co.com.sofka.domain.inventario.useCase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.inventario.Eventos.InventarioCreado;
import co.com.sofka.domain.inventario.comandos.CrearInventario;
import co.com.sofka.domain.inventario.valor.InventarioID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearInventarioUseCaseTest {

    @Test
    void crearInventario(){
        //arrange
        InventarioID inventarioID = new InventarioID();


        var command = new CrearInventario(inventarioID);
        var usecase = new CrearInventarioUseCase();
        //act

        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event = (InventarioCreado)events.get(0);
        Assertions.assertEquals("Sofka.inventario.inventarioCreado", event.type);
        Assertions.assertEquals(inventarioID.value(),event.aggregateRootId());

}}