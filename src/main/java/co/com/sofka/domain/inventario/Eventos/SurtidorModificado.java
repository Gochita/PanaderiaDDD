package co.com.sofka.domain.inventario.Eventos;

import co.com.sofka.domain.generic.DomainEvent;

public class SurtidorModificado extends DomainEvent {
    
    
    public SurtidorModificado() {
        super("Surtidor ha sido Modificado");
    }
}
