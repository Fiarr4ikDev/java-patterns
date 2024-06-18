package patterns.composite;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

    /**
     * Класс команды имплементируюющий интерфейс {@link Developer}.
     */
    public class Team implements Developer {
        private static final Logger LOGGER = LogManager.getLogger(Team.class);
        private final List<Developer> developers = new ArrayList<Developer>();

        /**
         * Метод для добавления разработчика.
         * @param developer принимает экземпляр класса {@link Developer}.
         */
        public void addDeveloper(Developer developer) {
            developers.add(developer);
        }

        /**
         * Метод для удаления разработчика.
         * @param developer принимает экземпляр класса {@link Developer}.
         */
        public void removeDeveloper(Developer developer) {
            developers.remove(developer);
        }

        /**
         * Переопределённый метод который собирает всех разработчиков в листе и вызывает у каждого метод {@link Developer#writeCode()}.
         */
        @Override
        public void writeCode() {
            LOGGER.info("Команда создаёт проект...");
            LOGGER.info("Команда пишет код...");
            for (Developer developer: developers) {
                developer.writeCode();
            }
            LOGGER.info("Команда написала проект");
        }
    }
