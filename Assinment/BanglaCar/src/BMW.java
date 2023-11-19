public class BMW extends Car {

    public BMW(Product product, String carType) {
        super(product, carType);
    }


    public void assemble() {
        System.out.println("Assembling " + product.getProductName() + " for " + carType);
    }


    public void produceProduct() {

        product.produce();

        System.out.println("Modifying product " + product.getProductName() + " according to " + carType);
    }
}
