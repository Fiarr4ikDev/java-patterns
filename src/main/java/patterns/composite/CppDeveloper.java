package patterns.composite;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

    /**
     * Класс разработчика расширающий интерфейс {@link Developer} c переопределённым методом {@link Developer#writeCode()} для написания своего кода.
     */
    public class CppDeveloper implements Developer {
        private static final Logger LOGGER = LogManager.getLogger(CppDeveloper.class);
        @Override
        public void writeCode() {
            LOGGER.info("C++ разработчик пишет C++ код");
        }
    }
