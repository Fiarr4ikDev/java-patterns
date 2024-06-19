package patterns.iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

    /**
     * <h1> Паттерн программирования : Итератор </h1>
     * <p> Автор: Денис Дементьев </p>
     * <p> Назначение паттерна : </p>
     * Паттерн нужен для для последовательного доступа ко всем элементам составного объекта без раскрытия его внутренней структуры.
     */
    public final class Program {
        private Program() {
        }

        public static void main(String[] args) {
            Logger logger = LogManager.getLogger(Program.class);
            String[] skills = {"java", "Spring", "Maven"}; //Массив навыков

            JavaDeveloper javaDeveloper = new JavaDeveloper("Denis Dementev", skills);

            Iterator iterator = javaDeveloper.getIterator(); //Получение итератора для разработчика

            logger.info("Developer: {}", javaDeveloper.getName());
            logger.info("Skills:");

            while (iterator.hasNext()) { //Вывод всех навыков разработчика
                logger.info(iterator.next().toString());
            }
            logger.info("Done");
        }
    }
