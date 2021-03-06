package co.com.sofka.domain.ventas.valor;
import co.com.sofka.domain.generic.ValueObject;
import java.time.format.DateTimeFormatter;


import java.time.LocalDateTime;


    public class Fecha implements ValueObject<String> {


        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

        private final LocalDateTime value= LocalDateTime.now();

        public Fecha() {

        }

        @Override
        public String value() {
            return dtf4.format(value);

        }


}
