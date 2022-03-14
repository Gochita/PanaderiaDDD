package co.com.sofka.domain.ventas.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.ventas.comandos.CrearVenta;
import co.com.sofka.domain.ventas.events.VentaCreada;
import co.com.sofka.domain.ventas.valor.Fecha;
import co.com.sofka.domain.ventas.valor.VentasId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearVentaUseCaseTest {

    @Test
    void crearVenta(){
        //arrange
        VentasId ventasId = new VentasId();
        Fecha fecha = new Fecha();


        var command = new CrearVenta(ventasId,fecha);
        var usecase = new CrearVentaUseCase();
        //act

        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event = (VentaCreada)events.get(0);
        Assertions.assertEquals("sofka.ventas.ventacreada", event.type);
        Assertions.assertEquals(ventasId.value(),event.aggregateRootId());

    }}