package app;

import io.jooby.annotations.*;

@Path("/help")
public class Controller {

    @GET
    public String helping() {
        return "Nessa API, voce conseguira realizar qualquer multplicacao envolvendo dois numeros. Para realizar tal tarefa, digite /mult/(valor)/(valor2) na URL.";
    }
}