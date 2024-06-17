package patterns.strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

    /**
    * Класс {@link Codding} реализующий интерфейс {@link Activity}.
    * Имеет переопределённый метод {@link Codding#justDoIt()} для своей деятельности
    */
    public class Codding implements Activity {
        public static Logger logger = LogManager.getLogger(Codding.class);
        @Override
        public void justDoIt() {
            logger.info("Коддинг...");
        }
    }
