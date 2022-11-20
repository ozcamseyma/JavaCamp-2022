public class Main {
    public static void main(String[] args) {

        Product product = new Product(1,"Laptop","Macbook",15000,5,"Gri","523");

        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Macbook");
        product.setPrice(15000);
        product.setStockAmount(5);
        product.setColour("Gri");
        product.setCode("523");

        System.out.println(product.getName());

        ProductManager productManager = new ProductManager();
        productManager.add();


    }
}