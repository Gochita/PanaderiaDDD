package co.com.sofka.domain.ventas;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.ventas.valor.Fecha;
import co.com.sofka.domain.ventas.valor.VentasId;

public class Ventas extends AggregateEvent<VentasId>{



    public Ventas(VentasId ventasId) {

        super(ventasId);
    }


}
