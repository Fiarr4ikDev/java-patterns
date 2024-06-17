package patterns.bridge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

    public class StockExchange extends Program {
            protected StockExchange(Developer developer) {
                super(developer);
            }

            private static final Logger LOGGER = LogManager.getLogger(BankSystem.class);
            @Override
            public void developProgram() {
                LOGGER.info("Биржа в разработке...");
                developer.writeCode();
            }
    }
