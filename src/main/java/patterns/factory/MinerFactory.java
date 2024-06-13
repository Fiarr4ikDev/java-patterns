package patterns.factory;

    public class MinerFactory implements EmployeeFactory {
        @Override
        public Employee createEmployee() {
            return new Miner();
        }

    }

