package patterns.bridge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

    public class BankSystem extends Program {
        protected BankSystem(Developer developer) {
            super(developer);
        }

        private static final Logger LOGGER = LogManager.getLogger(BankSystem.class);
        @Override
        public void developProgram() {
            LOGGER.info("Банковская система в разработке...");
            developer.writeCode();
        }
    }
