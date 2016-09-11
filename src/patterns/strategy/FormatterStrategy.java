package patterns.strategy;

import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

/**
 * Created by Marius on 07.09.2016.
 */
public class FormatterStrategy {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("theLogger");
        logger.setUseParentHandlers(false);

        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(new XMLFormatter());
        logger.addHandler(handler);

        logger.info("Info message");
        logger.warning("A warn message");

        logger.getHandlers()[0].setFormatter(new SimpleFormatter());
        logger.info("Info message");
        logger.warning("A warn message");
    }
}
