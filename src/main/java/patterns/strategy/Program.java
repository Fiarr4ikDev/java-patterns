package patterns.strategy;

/**
 * <h1> Паттерн программирования : Стратегия </h1>
 * <p> Автор: Денис Дементьев </p>
 * <p> Назначение паттерна : </p>
 * Паттерн нужен для определения семейств алгоритмов, их инкапсуляции и взаимозаменяемости.
 */
    public final class Program {
        private Program() {
        }

        public static void main(String[] args) {
            Developer developer = new Developer();
            developer.setActivity(new Codding());
            developer.executeActivity();
        }
    }
