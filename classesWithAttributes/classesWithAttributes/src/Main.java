public class Main {
    public static void main(String[] args) {


        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        product.setColour("Sarı");
        product.setCode("LS52");

       // System.out.println(product.name); get ve set ten once alinan product.name

        ProductManager productManager = new ProductManager();
        productManager.add(product); // objeyi cagiriyoruz.

        System.out.println(product.getId()); // OKUMA



    }
}