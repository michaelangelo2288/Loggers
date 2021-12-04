import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonTestJavaUtilLogger {

    Logger logger = Logger.getLogger("PersonTestLogger.class");

    @Test
    public void useJavaUtilLogger() {
        Person person = new Person("mike", "Oakland", 22);
        logger.setLevel(Level.INFO);
        logger.info(String.format("Person -> %s | %s | %s", person.getFirst(), person.getCity(), person.getAge()));

        logger.setLevel(Level.WARNING);
        logger.info(String.format("Person -> %s | %s | %s", person.getFirst(), person.getCity(), person.getAge()));
        logger.warning(String.format("Person -> %s | %s | %s", person.getFirst(), person.getCity(), person.getAge()));
    }
}
