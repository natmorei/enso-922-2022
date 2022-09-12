package app;

import io.jooby.annotations.*;

@Path("/subtracao/{op1}/{op2}")
public class Subtracao {

    @GET
    public double subtrair(@PathParam double op1, @PathParam double op2) {
        double result = op1-op2;
        return result;
    }
}