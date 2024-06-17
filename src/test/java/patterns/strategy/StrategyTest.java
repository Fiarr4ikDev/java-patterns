package patterns.strategy;

import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
    /**
     * Тест проверяющий что вызываемый метод {@link Activity#justDoIt()} выполняется до конца.
     */
    @ExtendWith(MockitoExtension.class)
    class StrategyTest {
        @Mock
        private Logger logger;

        @Captor
        private ArgumentCaptor<String> captor;

        @Test
        void testWriteCodeLogsCorrectMessageOne() {
            Codding.logger = logger;
            Developer developer = new Developer();
            developer.setActivity(new Codding());
            developer.executeActivity();

            verify(logger).info(captor.capture());
            assertEquals("Коддинг...", captor.getValue());
        }

        @Test
        void testWriteCodeLogsCorrectMessageTwo() {
            Reading.logger = logger;
            Developer developer = new Developer();
            developer.setActivity(new Reading());
            developer.executeActivity();

            verify(logger).info(captor.capture());
            assertEquals("Чтение...", captor.getValue());
        }
    }

