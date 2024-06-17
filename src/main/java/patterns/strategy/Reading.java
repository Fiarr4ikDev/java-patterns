package patterns.strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

    /**
    * Класс {@link Reading} реализующий интерфейс {@link Activity}.
    * Имеет переопределённый метод {@link Reading#justDoIt()} для своей деятельности
    */
    public class Reading implements Activity {
        public static Logger logger = LogManager.getLogger(Codding.class);
        @Override
        public void justDoIt() {
            logger.info("Чтение...");
        }
    }
