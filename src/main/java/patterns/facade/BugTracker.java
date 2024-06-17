package patterns.facade;

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
