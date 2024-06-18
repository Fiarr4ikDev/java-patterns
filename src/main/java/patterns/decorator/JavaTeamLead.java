package patterns.decorator;

    /**
     * Класс разработчика расширяющий класс декоратор {@link DeveloperDecorator} для добавления ролей разработчику без сложной логики.
     */
    public class JavaTeamLead extends DeveloperDecorator {

        public JavaTeamLead(Developer developer) {
            super(developer);
        }

        public String sendWeekReport() {
            return "Send week report to customer. ";
        }

        @Override
        public String makeJob() {
            return super.makeJob() + sendWeekReport();
        }
    }
