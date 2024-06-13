package patterns.prototype;

    /**
    * Класс фабрика с методом
    * <p> {@link UserFactory#cloneUser()} для создания копии экземпляра. </p>
    */
    public class UserFactory {
        private User user;

        public UserFactory(User user) {
            this.user = user;
        }

        User cloneUser() {
            return (User) user.copy();
        }
    }

