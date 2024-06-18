package patterns.decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * <h1> Паттерн программирования : Декоратор </h1>
 * <p> Автор: Денис Дементьев </p>
 * <p> Назначение паттерна : </p>
 * <p> Класс {@link DeveloperDecorator} нужен для создания новых ролей разработчиков с помощью которых и созданы {@link JavaTeamLead} и {@link SeniorJavaDeveloper}. </p>
 * <p> Это позволяет динамически добавлять обьекту новые обязанности без использования сложной логики. </p>
 */
    public final class Task {
        private static final Logger LOGGER = LogManager.getLogger(Task.class);
        private Task() {
        }

        public static void main(String[] args) {
            Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));

            LOGGER.info(developer.makeJob());
        }
    }
