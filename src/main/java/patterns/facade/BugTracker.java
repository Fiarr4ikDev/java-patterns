package patterns.facade;

    /**
     * Класс с полем {@link BugTracker#activeSprint} которое меняется с помощью методов {@link BugTracker#startSprint()} и {@link BugTracker#finishSpring()}.
     */
    public class BugTracker {
        private boolean activeSprint;
        public boolean isActiveSprint() {
            return activeSprint;
        }

        public void startSprint() {
            System.out.println("В работе");
            activeSprint = true;
        }

        public void finishSpring() {
            System.out.println("Неактивен");
            activeSprint = false;
        }
    }
