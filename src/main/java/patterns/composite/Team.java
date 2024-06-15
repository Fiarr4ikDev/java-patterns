package patterns.composite;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

    /**
     * Класс команды имплементируюющий интерфейс {@link Developer}.
     */
    public class Team implements Developer {
        public static Logger logger = LogManager.getLogger(Team.class);
        private final List<Developer> developers = new ArrayList<Developer>();

        public void addDeveloper(Developer developer) {
            developers.add(developer);
        }

        public void removeDeveloper(Developer developer) {
            developers.remove(developer);
        }

        @Override
        public void writeCode() {
            System.out.println("Команда создаёт проект...\n");
            System.out.println("Команда пишет код...\n\n");
            for (Developer developer: developers) {
                developer.writeCode();
            }
            logger.info("Команда написала проект");
        }
    }
