package patterns.strategy;

    /**
     * Класс {@link Developer} нужен для определения самого разработчика с методом {@link Developer#executeActivity()} для выполнения деятельности,
     * и метод {@link Developer#setActivity(Activity)} для установки нового экземпляра активности.
     */
    public class Developer {
        private Activity activity;

        public void setActivity(Activity activity) {
            this.activity = activity;
        }

        public void executeActivity() {
            activity.justDoIt();
        }
    }
