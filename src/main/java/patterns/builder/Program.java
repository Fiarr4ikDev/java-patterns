package patterns.builder;

    /**
    * <h1> Паттерн программирования : Строитель </h1>
    * <p> Автор: Денис Дементьев </p>
    * <p> Назначение класса : </p>
    * Класс который создаёт экземпляр класса {@link ShopAdmin}, который нужен для полного "билда" продукта и создания его экземпляра.
    * С помощью метода {@link ShopAdmin#setBuilder(ProductBuilder)} устанавливается нужный "билдер" для конкретного продукта.
    * Создаётся экземпляр класса {@link Product} который берёт все значения из "билдера" {@link MilkProductBuilder} и выводится информация о продукте.
    */
    public final class Program {
        private Program() {
        }

        public static void main(String[] args) {
            ShopAdmin shopAdmin = new ShopAdmin();

            shopAdmin.setBuilder(new MilkProductBuilder());
            Product product = shopAdmin.buildProduct();

            System.out.println(product);
        }
    }
