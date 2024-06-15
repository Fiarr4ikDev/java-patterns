package patterns.decorator;

import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class TaskTest {

    @Mock
    private Logger logger;

    @Captor
    private ArgumentCaptor<String> captor;

    @Test
    void testWriteCodeLogsCorrectMessage() {
        Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        Task.logger = logger;

        logger.info(developer.makeJob());

        verify(logger).info(captor.capture());
        assertEquals("Write java code. Make code review. Send week report to customer. ", captor.getValue());
    }
}
