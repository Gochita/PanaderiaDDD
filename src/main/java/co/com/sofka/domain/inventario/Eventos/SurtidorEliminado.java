package co.com.sofka.domain.inventario.Eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.inventario.valor.SurtidorID;

public class SurtidorEliminado  extends DomainEvent{
        private final SurtidorID surtidorID;

    public SurtidorEliminado(SurtidorID surtidorID) {
        super("Surtidor ha sido eliminado");
        this.surtidorID = surtidorID;
    }

    public SurtidorID getSurtidorID() {
        return surtidorID;
    }
}
