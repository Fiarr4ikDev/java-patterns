package patterns.bridge;

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

    @ExtendWith(MockitoExtension.class)
    class BridgeTest {
        @Mock
        private Logger logger;

        @InjectMocks
        private CppDeveloper cppDeveloper;

        @Captor
        private ArgumentCaptor<String> captor;

        @BeforeEach
        public void setUp() {
            cppDeveloper = new CppDeveloper();
        }

        @Test
        void testWriteCodeLogsCorrectMessage() {
            CppDeveloper.LOGGER = logger;

            cppDeveloper.writeCode();

            verify(logger).info(captor.capture());
            assertEquals("С++ разработчик пишет С++ код", captor.getValue());
        }
    }