package patterns.factory;

/**
 * Класс Program является содержит метод main для демонстрации работы паттерна "Фабрика".
 * <p>
 * Автор: Денис Дементьев
 * Паттерн: Фабрика
 * </p>
 */
public final class Program {

    /**
     * Приватный конструктор предотвращает создание экземпляров этого класса.
     */
    private Program() {
    }

    /**
     * Метод main запускает программу, создавая экземпляр Employee в зависимости от указанной роли.
     *
     * @param args аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        EmployeeFactory employeeFactory = createEmployeeFactory("miner");
        Employee employee = employeeFactory.createEmployee();

        employee.work();
    }

    /**
     * Создает фабрику для создания сотрудников в зависимости от указанной роли.
     *
     * @param role роль сотрудника (например, "miner" или "lumberjack").
     * @return фабрика для создания соответствующего сотрудника.
     * @throws RuntimeException если указанная роль недействительна.
     */
    static EmployeeFactory createEmployeeFactory(String role) {
        if (role.equalsIgnoreCase("miner")) {
            return new MinerFactory();
        } else if (role.equalsIgnoreCase("lumberjack")) {
            return new LumberjackFactory();
        } else {
            throw new RuntimeException(role + " is not a valid employee");
        }
    }

}

