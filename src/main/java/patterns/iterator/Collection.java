package patterns.iterator;

    /**
     * Интерфейс коллеции с одним методом
     */
    public interface Collection {
        /**
         * {@link Collection#getIterator()} для получения класса итератора.
         * @return новый экземпляр класса итератора.
         */
        Iterator getIterator();
    }
