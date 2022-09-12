package app;

import io.jooby.annotations.*;

@Path("/mult/{x}/{y}")
public class Multiplicacao {

    @GET
    public double calcularMult(@PathParam double x, @PathParam double y) {
        return x * y;
    }
}
