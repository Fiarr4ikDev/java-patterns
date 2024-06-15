package patterns.composite;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

    public class JavaDeveloper implements Developer {
        static final Logger LOGGER = LogManager.getLogger(JavaDeveloper.class);
        @Override
        public void writeCode() {
            System.out.println("жава разработчик пишет жава код");
        }
    }
