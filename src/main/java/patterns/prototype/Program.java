package patterns.prototype;

    /**
    * <h1> Паттерн программирования : Прототип </h1>
    * <p> Автор: Денис Дементьев </p>
    * <p> Назначение паттерна : </p>
    * <p> Создаётся экземпляр класса {@link User}. </p>
    * <p> Создаётся экземпляр класса {@link UserFactory} который принимает в себя выше созданный обьект класса {@link User}. </p>
    * <p> Затем создаётся новый обьект класса (прототип) который клонирует все свойства обьекта класса {@link User}. </p>
    */
    public final class Program {
        private Program() {
        }

        public static void main(String[] args) {
            User user = new User(1, "Denis", GenderType.MALE, 20);
            System.out.println(user);
            UserFactory factory = new UserFactory(user);
            User userClone = factory.cloneUser();
            System.out.println(userClone);
        }
    }

