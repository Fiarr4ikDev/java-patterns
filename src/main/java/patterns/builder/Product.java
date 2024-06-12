package patterns.builder;

    /**
    * Класс {@link Product} который содержит поля:
    * <p> {@link Product#name} - наименование продукта. </p>
    * <p> {@link Product#name} - наименование продукта. </p>
    * <p> {@link Product#productType} - перечисление {@link ProductType} для типа продукта. </p>
    * <p> {@link Product#price} - цена продукта. </p>
    * Сеттеры {@link Product#setName(String)} ,
    * {@link Product#setProductType(ProductType)} ,
    * {@link Product#setPrice(int)}
    * нужны для установки значений классом билдером определённого продукта.
    * <p> Метод {@link Product#toString()} нужен для вывода информации о продукте в строке. </p>
    */
    public class Product {
        private String name;
        private ProductType productType;
        private int price;

        public void setName(String name) {
            this.name = name;
        }

        public void setProductType(ProductType productType) {
            this.productType = productType;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", productType=" + productType +
                    ", price=" + price +
                    '}';
        }
    }
