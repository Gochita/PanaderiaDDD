package co.com.sofka.domain.inventario.Eventos;

import co.com.sofka.domain.generic.DomainEvent;

public class SurtidorEliminado  extends DomainEvent{

    public SurtidorEliminado() {
        super("Surtidor ha sido eliminado");
    }
}
