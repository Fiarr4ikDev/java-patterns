package patterns.builder;

    /**
    * Класс строитель наследующийся от {@link ProductBuilder} который переопределяет методы и создаёт экземпляр класса {@link Product}
    */
    public class SocksProductBuilder extends ProductBuilder {
        @Override
        void buildName() {
            getProduct().setName("Ультра крутые носки 8000 в 1");
        }

        @Override
        void buildType() {
            getProduct().setProductType(ProductType.CLOTHES);
        }

        @Override
        void buildPrice() {
            getProduct().setPrice(100);
        }
    }
