package patterns.iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;


import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;


/**
 * Тест проверяющий что всё вывелось нормально и клиентский класс завершился до конца.
 */
class IteratorTest {

    @Test
    void testWriteCodeLogsCorrectMessage() {
        MockedStatic<LogManager> integerMock = Mockito.mockStatic(LogManager.class);
        Logger logger = spy(Logger.class);
        integerMock.when(() -> LogManager.getLogger(any(Class.class))).thenReturn(logger);

        String[] skills = {"java", "Spring", "Maven"}; //Массив навыков

        JavaDeveloper javaDeveloper = new JavaDeveloper("Denis Dementev", skills);

        Iterator iterator = javaDeveloper.getIterator();

        logger.info("Developer: {}", javaDeveloper.getName());
        logger.info("Skills:");

        while (iterator.hasNext()) {
            logger.info(iterator.next().toString());
        }
        logger.info("Done");

        verify(logger).info("Done");
    }
}