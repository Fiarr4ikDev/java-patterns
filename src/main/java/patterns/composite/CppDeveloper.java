package patterns.composite;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

    public class CppDeveloper implements Developer {
        private static final Logger LOGGER = LogManager.getLogger(CppDeveloper.class);
        @Override
        public void writeCode() {
            System.out.println("C++ разработчик пишет C++ код");
        }
    }
