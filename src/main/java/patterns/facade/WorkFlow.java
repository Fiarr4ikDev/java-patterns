package patterns.facade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Сам фасад который обьединяет в себе классы {@link Developer},{@link Job},{@link BugTracker} в один интерфейс высокого уровня.
 */
    public class WorkFlow {
        public static Logger logger = LogManager.getLogger(WorkFlow.class);
        private Developer developer = new Developer();
        private Job job = new Job();
        private BugTracker bugTracker = new BugTracker();

        public void solveProblems() {
            job.doJob();
            bugTracker.isActiveSprint();
            developer.doJobBeforeDeadline(bugTracker);
            logger.info("Проблемы решены");
        }
    }
