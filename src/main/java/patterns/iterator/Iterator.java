package patterns.iterator;

    /**
     * Интерфейс итератор с двумя методами.
     * @author Денис Дементьев
     */
    public interface Iterator {
        /**
         * {@link Iterator#hasNext()} для проверки если ли ещё элемент в коллекции.
         * @return true если можно двигаться дальше.
         */
        boolean hasNext();

        /**
         * {@link Iterator#next()} для движения коллеции дальше.
         * @return инкрементированный индекс коллекции.
         */
        Object next();
    }
