package patterns.decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;


import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

    /**
     * Тест который проверяет что выполнение метода {@link Developer#makeJob()} выполняется до конца и отдаёт в логи нужный вывод.
     */
    class TaskTest {
        @Test
        void testWriteCodeLogsCorrectMessage() {
            MockedStatic<LogManager> integerMock = Mockito.mockStatic(LogManager.class);
            Logger logger = spy(Logger.class);
            integerMock.when(() -> LogManager.getLogger(any(Class.class))).thenReturn(logger);

            Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
            logger.info(developer.makeJob());

            verify(logger).info("Write java code. Make code review. Send week report to customer. ");
        }
    }
