package patterns.factory;

    public class LumberjackFactory implements EmployeeFactory {
        @Override
        public Employee createEmployee() {
            return new Lumberjack();
        }

    }

