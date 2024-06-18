package patterns.decorator;

    /**
     * Главный класс для реализации паттерна декоратор позволяющий создавать новые роли разработчиков без использования сложной логики.
     */
    public class DeveloperDecorator implements Developer {
        private Developer developer;

        public DeveloperDecorator(Developer developer) {
            this.developer = developer;
        }

        @Override
        public String makeJob() {
            return developer.makeJob();
        }
    }
