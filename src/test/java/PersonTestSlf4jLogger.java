//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class PersonTestSlf4jLogger {

    @Test
    public void useSlf4jAnnotationLogger() {
        Person person = new Person("mike", "Oakland", 22);
        log.info(String.format("Person -> %s | %s | %s", person.getFirst(), person.getCity(), person.getAge()));
    }

    @Test
    public void useSlf4jInitiatedLogger() {
//        Able to set SLF4J logging level here (below) or in 'simplelogger.properties' files
//        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Debug");

        Logger logger = LoggerFactory.getLogger(PersonTestSlf4jLogger.class);
        Person person = new Person("mike", "Oakland", 41);

        // this will show when log level = error/warn/info/debug simplelogger.prop file overrides level set in test method
        logger.error(String.format("Person -> %s | %s | %s", person.getFirst(), person.getCity(), person.getAge()));

        // this will show when log level =
        logger.warn(String.format("Person -> %s | %s | %s", person.getFirst(), person.getCity(), person.getAge()));

        // this will NOT show when log level =
        logger.info(String.format("Person -> %s | %s | %s", person.getFirst(), person.getCity(), person.getAge()));

        // this will NOT show when log level =
        logger.debug(String.format("Person -> %s | %s | %s", person.getFirst(), person.getCity(), person.getAge()));
    }
}
