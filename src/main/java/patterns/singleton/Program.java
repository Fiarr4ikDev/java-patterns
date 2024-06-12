package patterns.singleton;

/**
 * Класс Program является содержит метод main для демонстрации работы паттерна "Одиночка".
 * <p>
 * Автор: Денис Дементьев
 * Паттерн: Одиночка
 * </p>
 */
    public final class Program {
        /**
        * Приватный конструктор предотвращает создание экземпляров этого класса.
        */
        private Program() {
        }

    /**
     * В методе main используется статичный класс {@link ShopCart}
     * а так же его метод {@link ShopCart#getShopCart()} для добавления продуктов в корзину.
     * Метод {@link ShopCart#showCartItems()} выводит список всех продуктов.
     */
    public static void main(String[] args) {
            ShopCart.getShopCart().addCartItems("Banana");
            ShopCart.getShopCart().addCartItems("Potato");
            ShopCart.getShopCart().addCartItems("MacBook M6");

            ShopCart.getShopCart().showCartItems();
        }

    }
