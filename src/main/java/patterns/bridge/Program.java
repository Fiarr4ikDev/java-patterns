package patterns.bridge;

    /**
     * Абстрактный класс который имеет едиственный метод {@link Program#developProgram()}
     */
    public abstract class Program {
        protected Developer developer;

        protected Program(Developer developer) {
            this.developer = developer;
        }

        public abstract void developProgram();
    }
