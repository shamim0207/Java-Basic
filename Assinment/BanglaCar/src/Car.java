public abstract class Car {
    protected Product product;
    protected String carType;

    public Car(Product product, String carType) {
        this.product = product;
        this.carType = carType;
    }

    public void printDetails() {
        System.out.println("Car Type: " + carType);
        System.out.println("Product Name: " + product.getProductName());
    }


    public abstract void assemble();
    public abstract void produceProduct();
}
