package app;

import io.jooby.annotations.*;

@Path("/divisao/{op1}/{op2}")
public class Divisao {

    @GET
    public double dividir(@PathParam double op1, @PathParam double op2) {
        double result = op1/op2;
        return result;
    }
}