package patterns.bridge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

    public class JavaDeveloper implements Developer {
        private static final Logger LOGGER = LogManager.getLogger(JavaDeveloper.class);
        @Override
        public void writeCode() {
            LOGGER.info("Жава разработчик пишет жава код");
        }
    }
