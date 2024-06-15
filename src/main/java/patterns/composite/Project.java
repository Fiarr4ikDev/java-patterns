package patterns.composite;

    /**
     * <h1> Паттерн программирования : Строитель </h1>
     * <p> Автор: Денис Дементьев </p>
     * <p> Назначение класса : </p>
     * В команду добавляется три разработчика и вызывается метод {@link Team#writeCode()}
     */
    public final class Project {
        private Project() {
        }

        public static void main(String[] args) {
            Team team = new Team();

            Developer firstJavaDev = new JavaDeveloper();
            Developer secondJavaDev = new JavaDeveloper();
            Developer firstCppDev = new CppDeveloper();

            team.addDeveloper(firstJavaDev);
            team.addDeveloper(secondJavaDev);
            team.addDeveloper(firstCppDev);

            team.writeCode();
        }
    }
