package patterns.bridge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

    public class CppDeveloper implements Developer {
        public static Logger LOGGER = LogManager.getLogger(CppDeveloper.class);
            @Override
            public void writeCode() {
                LOGGER.info("С++ разработчик пишет С++ код");
            }
    }
