package patterns.decorator;

/**
 * Класс реализующий интерфейс {@link Developer} c переопределённым методом {@link Developer#makeJob()} для определения работы именно этого разработчика.
 */
    public class JavaDeveloper implements Developer {
        @Override
        public String makeJob() {
            return "Write java code. ";
        }
    }
