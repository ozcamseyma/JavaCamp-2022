import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        // farkli tipler ile calismamizi saglayan bir class
        // tip güvenligini icin generic yapilari kullaniriz

        MyList<String> sehirler = new MyList<>();
        sehirler.add("Ankara");

        //sehirler.add(1); 1 degeri T türündeki String datatipli olmadigi icin hata verir

        // Generic Yapisi
        MyList<Customer>  customers = new MyList<>();
        customers.add(new Customer());









    }
}