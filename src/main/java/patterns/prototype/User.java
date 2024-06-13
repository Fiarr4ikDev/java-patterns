package patterns.prototype;

    /**
    * Класс пользователя с полями:
    * <p> {@link User#id} - уникальный идентификатор пользователя. </p>
    * <p> {@link User#name} - имя пользователя. </p>
    * <p> {@link User#genderType} - пол пользователя. </p>
    * <p> {@link User#age} - возраст пользователя. </p>
    * Метод {@link User#copy()} нужен для создания копии созданного экземпляра класса.
    */
    public class User implements Copyable {
        private int id;
        private String name;
        private GenderType genderType;
        private int age;

        public User(int id, String name, GenderType genderType, int age) {
            this.id = id;
            this.name = name;
            this.genderType = genderType;
            this.age = age;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public GenderType getGenderType() {
            return genderType;
        }

        public void setGenderType(GenderType genderType) {
            this.genderType = genderType;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", genderType=" + genderType +
                    ", age=" + age +
                    '}';
        }

        @Override
        public Object copy() {
            User userCopy = new User(id, name, genderType, age);
            return userCopy;
        }
    }
