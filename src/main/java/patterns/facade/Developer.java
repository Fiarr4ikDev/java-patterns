package patterns.facade;

    /**
     * Класс разработчика с методом {@link Developer#doJobBeforeDeadline(BugTracker)}.
     * <p> {@link BugTracker} в методе нужен для определения действий разработчика в зависимости от его значения. </p>
     */
    public class Developer {
        public void doJobBeforeDeadline(BugTracker bugTracker) {
            if (bugTracker.isActiveSprint()) {
                System.out.println("Решение проблем");
            } else {
                System.out.println("Разработчик спит");
            }
        }
    }
