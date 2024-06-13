package patterns.singleton;

/**
 * Пример класса одиночки с созданием одного экземпляра класса, который предоставляет глобальную точку доступа к этому экземпляру
 */
    public final class ShopCart {
        /**
         * Приватный экземпляр класса {@link ShopCart}.
         */
        private static ShopCart shopCart;
        /**
         * Приватная переменная {@link ShopCart#cart} содержит список товаров.
         */
        private static String cart = "Это корзина для товаров. \n\n";

        /**
         * Публичный метод который открывает поток и даёт доступ к корзине.
         * Возвращает экзамеляр класса {@link ShopCart} если он пустой.
         */
        public static synchronized ShopCart getShopCart() {
            if (shopCart == null) {
                shopCart = new ShopCart();
            }
            return shopCart;
        }

        /**
         * Приватный конструктор предотвращает создание экземпляров этого класса.
         */
        private ShopCart() {
        }

        /**
         * Публичный метод для добавления предметов в корзину
         * @param item  наименование предмета для добавления
         */
        public void addCartItems(String item) {
            cart += item + "\n";
        }

        /**
         * Публичный метод для отображения всех предметов в корзине
         */
        public void showCartItems() {
            System.out.println(cart);
        }

    }
