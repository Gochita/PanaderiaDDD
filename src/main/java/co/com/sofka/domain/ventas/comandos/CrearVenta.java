package co.com.sofka.domain.ventas.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.ventas.valor.Fecha;
import co.com.sofka.domain.ventas.valor.VentasId;

public class CrearVenta extends Command {

    private final VentasId ventasId;
    private final Fecha fecha;

    public CrearVenta(VentasId ventasId, Fecha fecha) {
        this.ventasId = ventasId;
        this.fecha = fecha;
    }

    public VentasId getVentasId() {
        return ventasId;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
