package patterns.composite;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;


import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

/**
 * Тест проверяющий, что команда закончила работу и метод {@link Team#writeCode()} выполнился до конца.
 */
class TeamTest {

    @Test
    void testWriteCodeLogsCorrectMessage() {
        MockedStatic<LogManager> integerMock = Mockito.mockStatic(LogManager.class);
        Logger logger = spy(Logger.class);
        integerMock.when(() -> LogManager.getLogger(any(Class.class))).thenReturn(logger);
        Team team = new Team();

        Developer firstJavaDev = new JavaDeveloper();
        Developer secondJavaDev = new JavaDeveloper();
        Developer firstCppDev = new CppDeveloper();

        team.addDeveloper(firstJavaDev);
        team.addDeveloper(secondJavaDev);
        team.addDeveloper(firstCppDev);

        team.writeCode();
        verify(logger).info("Команда написала проект");
    }
}
