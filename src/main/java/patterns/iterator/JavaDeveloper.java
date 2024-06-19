package patterns.iterator;

    /**
     * Класс разработчика с итератором навыков расширяющий интерфейс {@link Collection}.
     */
    public class JavaDeveloper implements Collection {
        private String name;
        private String[] skills;
        /**
         * {@link Collection#getIterator()} для получения класса итератора.
         * @return новый экземпляр класса итератора.
         */
        @Override
        public Iterator getIterator() {
            return new SkillIterator();
        }

        public JavaDeveloper(String name, String[] skills) {
            this.name = name;
            this.skills = skills;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String[] getSkills() {
            return skills;
        }

        public void setSkills(String[] skills) {
            this.skills = skills;
        }

        private final class  SkillIterator implements Iterator {
            private int index;

            /**
             * {@link Iterator#hasNext()} для проверки если ли ещё элемент в коллекции.
             * @return true если можно двигаться дальше.
             */
            @Override
            public boolean hasNext() {
                if (index < skills.length) {
                    return true;
                }
                return false;
            }

            /**
             * {@link Iterator#next()} для движения коллеции дальше.
             * @return инкрементированный индекс коллекции.
             */
            @Override
            public Object next() {
                return skills[index++];
            }
        }
    }
