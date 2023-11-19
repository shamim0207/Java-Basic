public class CentralLocking implements Product {
    private String productName;


    public CentralLocking(String productName) {
        this.productName = productName;
    }


    public String getProductName() {
        return productName;
    }


    public void produce() {

        System.out.println("Producing Central Locking System");
    }

}
