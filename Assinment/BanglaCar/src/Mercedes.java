public class Mercedes extends Car {

    public Mercedes(Product product, String carType) {
        super(product, carType);
    }

    @Override
    public void assemble() {
        System.out.println("Assembling " + product.getProductName() + " for " + carType);
    }

    @Override
    public void produceProduct() {

        product.produce();

        System.out.println("Modifying product " + product.getProductName() + " according to " + carType);
    }
}
