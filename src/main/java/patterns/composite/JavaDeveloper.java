package patterns.composite;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

    /**
     * Класс разработчика расширающий интерфейс {@link Developer} c переопределённым методом {@link Developer#writeCode()} для написания своего кода.
     */
    public class JavaDeveloper implements Developer {
        static final Logger LOGGER = LogManager.getLogger(JavaDeveloper.class);
        @Override
        public void writeCode() {
            LOGGER.info("жава разработчик пишет жава код");
        }
    }
