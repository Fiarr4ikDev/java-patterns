package patterns.facade;

import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

    /**
     * Тест проверяющий что вызываемый метод {@link WorkFlow#solveProblems()} выполняется до конца.
     */
    @ExtendWith(MockitoExtension.class)
    class FacadeTest {
        @Mock
        private Logger logger;

        @Captor
        private ArgumentCaptor<String> captor;

        @InjectMocks
        private WorkFlow workFlow;

        @BeforeEach
        void setUp() {
            WorkFlow.logger = logger;
        }

        @Test
        void testWriteCodeLogsCorrectMessage() {
            workFlow.solveProblems();

            verify(logger).info(captor.capture());
            assertEquals("Проблемы решены", captor.getValue());
        }
    }
