package app;

import io.jooby.Jooby;

public class App extends Jooby {
  {
    get("/", ctx -> "Bem vindos a API Jooby! Para mais informacoes, digite /help na URL.");
    mvc(new Controller());
    mvc(new Multiplicacao());
    mvc(new Soma());
    mvc(new Subtracao());
    mvc(new Divisao());
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }
}
