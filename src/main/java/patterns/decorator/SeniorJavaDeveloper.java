package patterns.decorator;

/**
 * Класс разработчика расширяющий класс декоратор {@link DeveloperDecorator} для добавления ролей разработчику без сложной логики.
 */
    public class SeniorJavaDeveloper extends DeveloperDecorator {

        public SeniorJavaDeveloper(Developer developer) {
            super(developer);
        }

        public String makeCodeReview() {
            return "Make code review. ";
        }

        @Override
        public String makeJob() {
            return super.makeJob() + makeCodeReview();
        }
    }
