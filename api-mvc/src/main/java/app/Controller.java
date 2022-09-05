package app;

import io.jooby.annotations.*;

@Path("/bem-vindos")
public class Controller {
    @GET
    public String welcomeAll() {
        return "Sejam todos BEM VINDOS(AS)! Nessa api, voce conseguira calcular qualquer multiplicacao desejada. Apenas precisa digitar /mult/(valor)/(valor)";
    }
}
