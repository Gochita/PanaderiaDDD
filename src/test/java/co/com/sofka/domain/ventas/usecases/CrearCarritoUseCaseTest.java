package co.com.sofka.domain.ventas.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.ventas.comandos.CrearCarrito;
import co.com.sofka.domain.ventas.events.CarritoCreado;
import co.com.sofka.domain.ventas.events.VentaCreada;
import co.com.sofka.domain.ventas.valor.CarritoId;
import co.com.sofka.domain.ventas.valor.VentasId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CrearCarritoUseCaseTest {
    @Mock
    private DomainEventRepository repository;

    @Test
    void CrearCarrito() {
        //arrange
        CarritoId carritoId = CarritoId.of("5230");
        VentasId ventasId = VentasId.of("xxxx");

        var command = new CrearCarrito(ventasId, carritoId);
        var usecase = new CrearCarritoUseCase();

        Mockito.when(repository.getEventsBy("xxxx")).thenReturn(history());
        usecase.addRepository(repository);
        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(ventasId.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (CarritoCreado) events.get(0);
        Assertions.assertEquals("sofka.ventas.carritocreado", event.type);
        Assertions.assertEquals("5230", event.getCarritoId().value());
    }

    private List<DomainEvent> history() {
        return List.of(
                new VentaCreada(VentasId.of("xxxx"), null)
        );
    }
}