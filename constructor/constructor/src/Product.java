public class Product {

    /*
    public Product() {
        // Parametresiz constructor
        System.out.println("Yapıcı blok çalıştı");
    }
    */

    public Product(int id, String name, String description, double price, int stockAmount, String colour, String code) {

        System.out.println("Yapıcı blok çalıştı");

        this.Id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.colour = colour;
        this.code = code;

    } // parametreli constructor

    public Product(){
        // Overloading : asiri yukleme oluyor.
    }

    int Id;
    String name;
    String description;
    double price;
    int stockAmount;
    String colour;
    String code;

    // getter
    public int getId() {
        return Id;
    }

    // setter
    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
