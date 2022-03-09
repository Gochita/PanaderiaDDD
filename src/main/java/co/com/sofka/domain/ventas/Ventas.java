package co.com.sofka.domain.ventas;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.ventas.valor.Fecha;

public class Ventas extends AggregateEvent{

    public Ventas(Identity ventasId) {
        super(ventasId);
    }


}
