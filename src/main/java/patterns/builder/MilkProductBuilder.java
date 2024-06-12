package patterns.builder;

    /**
    * Класс строитель наследующийся от {@link ProductBuilder} который переопределяет методы и создаёт экземпляр класса {@link Product}
    */
    public class MilkProductBuilder extends ProductBuilder {
        @Override
        void buildName() {
            getProduct().setName("Mega Milk3000");
        }

        @Override
        void buildType() {
            getProduct().setProductType(ProductType.FOOD);
        }

        @Override
        void buildPrice() {
            getProduct().setPrice(10);
        }
    }
