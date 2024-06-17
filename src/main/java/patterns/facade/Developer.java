package patterns.facade;

    public class Developer {
        public void doJobBeforeDeadline(BugTracker bugTracker) {
            if (bugTracker.isActiveSprint()) {
                System.out.println("Решение проблем");
            } else {
                System.out.println("Разработчик спит");
            }
        }
    }
