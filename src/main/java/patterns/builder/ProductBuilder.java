package patterns.builder;

    /**
    * Абстрактный класс имеющий метод {@link ProductBuilder#createProduct()} для создания экземпляра продукта.
    * <p> Методы {@link ProductBuilder#buildName()},{@link ProductBuilder#buildType()},{@link ProductBuilder#buildPrice()} для "построения" и переопределения. </p>
    */
    public abstract class ProductBuilder {
        private Product product;

        void createProduct() {
            product = new Product();
        }

        abstract void buildName();

        abstract void buildType();

        abstract void buildPrice();

        Product getProduct() {
            return product;
        }
    }

