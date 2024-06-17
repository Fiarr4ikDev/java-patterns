package patterns.facade;

    /**
     * <h1> Паттерн программирования : Фасад </h1>
     * <p> Автор: Денис Дементьев </p>
     * <p> Назначение паттерна : </p>
     * Создание унифицированного интерфейса вместо набора интерфейсов.
     * Фасад определяет интерфейс высокого уровня для упрощения работы.
     */
    public final class Program {
        private Program() {
        }

        public static void main(String[] args) {
            WorkFlow workFlow = new WorkFlow();
            workFlow.solveProblems();
        }
    }
