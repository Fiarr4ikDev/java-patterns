package patterns.bridge;

     /**
     * <h1> Паттерн программирования : Строитель </h1>
     * <p> Автор: Денис Дементьев </p>
     * <p> Назначение класса : </p>
     * Массив Program[] содержит программы и их разработчиков.
      * Дальше операнд for перебирает все программы и вызывает метод developProgram() для разработки программ.
     */
    public final class ProgramCreator {
        private ProgramCreator() {
        }

        public static void main(String[] args) {
            Program[] programs = {
                    new BankSystem(new JavaDeveloper()),
                    new StockExchange(new CppDeveloper())
            };

            for (Program program: programs) {
                program.developProgram();
            }
        }
    }
