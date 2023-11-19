public class GearLocking implements Product {
    private String productName;


    public GearLocking(String productName) {
        this.productName = productName;
    }


    public String getProductName() {
        return productName;
    }


    public void produce() {
        System.out.println("Producing Gear Locking System");
    }
}
