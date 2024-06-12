package patterns.builder;

    /**
    * Класс строитель для "билда" информации о продукте и создания экземпляра класса
    */
    public class ShopAdmin {
        private ProductBuilder builder;

        public void setBuilder(ProductBuilder builder) {
            this.builder = builder;
        }

        Product buildProduct() {
            builder.createProduct();
            builder.buildName();
            builder.buildType();
            builder.buildPrice();

            return builder.getProduct();
        }
    }
