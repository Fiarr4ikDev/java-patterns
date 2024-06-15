package patterns.composite;

import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

    /**
     * Тест проверяющий что всё сделано и команда сделала программу
     */
    @ExtendWith(MockitoExtension.class)
    class TeamTest {
        @Mock
        private Logger logger;

        @InjectMocks
        private Team team;

        @Captor
        private ArgumentCaptor<String> captor;

        @BeforeEach
        public void setUp() {
            Team team = new Team();

            Developer firstJavaDev = new JavaDeveloper();
            Developer secondJavaDev = new JavaDeveloper();
            Developer firstCppDev = new CppDeveloper();

            team.addDeveloper(firstJavaDev);
            team.addDeveloper(secondJavaDev);
            team.addDeveloper(firstCppDev);
        }

        @Test
        void testWriteCodeLogsCorrectMessage() {

            Team.logger = logger;

            team.writeCode();

            verify(logger).info(captor.capture());
            assertEquals("Команда написала проект", captor.getValue());
        }
    }