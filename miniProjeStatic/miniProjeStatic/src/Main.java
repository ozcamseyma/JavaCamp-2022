public class Main {
    public static void main(String[] args) {

        /*
              *** Static ler direk class ismi ile cagrilir. Cagrildiginda bellekte olusturulur.
              * Yapici bloklar newlendiginde calisir.
        */

        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.price = 10;
        product.name = "Mouse";
        productManager.add(product);





    }
}