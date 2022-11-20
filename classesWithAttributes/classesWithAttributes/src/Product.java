public class Product {

    // Her yerden erisilebilir bir class
    // private sadece tanimlandigi blok icerisinde calisir : özel
    // private : public class Product ta calisir.

    // Ürüne ait bilgileri tuttuk.

    // attribute | field

    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String colour;
    private String code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    /*
    public String getCode() {
        //return code;
        return this.substring(0,1) +1;
        // bu sekilde code u kullanicinin yazmasini engelliyoruz.
        // sadece get kullanarak
     }
     */

    public void setCode(String code) {
        this.code = code;
    }

    /*
    // getter
    public int getId() {
        return _id;
    } // bu sekilde id okuyabilir. get ile yazamaz.

    // setter
    public void setId(int id) {
        _id = id;
    } // bu sekilde id degistirilmis olur.
    */


}
