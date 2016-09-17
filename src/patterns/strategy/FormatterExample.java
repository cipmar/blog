package patterns.strategy;

import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

/**
 * Created by Marius on 07.09.2016.
 */
public class FormatterExample {
  public static void main(String[] args) {
    Logger logger1 = Logger.getLogger("logger1");
    logger1.setUseParentHandlers(false);

    ConsoleHandler handler1 = new ConsoleHandler();
    handler1.setFormatter(new XMLFormatter());

    ConsoleHandler handler2 = new ConsoleHandler();
    handler2.setFormatter(new SimpleFormatter());

    logger1.addHandler(handler1);
    logger1.addHandler(handler2);

    logger1.info("Info message");
    logger1.warning("A warn message");
  }
}
