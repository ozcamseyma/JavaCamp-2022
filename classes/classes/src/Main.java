public class Main {
    public static void main(String[] args) {

        /*
        1) Class lar reference types tir.
        2) Bellekte Stack ve Heap alanlari vardir.
        3) Stack te : CustomerManager customerManager degiskenini tutar.
        4) Heap te : new CustomerManager() nesnesini tutar.
         */

        // Bir Class in Cagrimi:

        // Bir Class in kullanilabilmesi icin onun newlenmis olmasi gerekir.
        CustomerManager customerManager = new CustomerManager();
        // Class adi           // clas turunde bir isim

        CustomerManager customerManager2 = new CustomerManager();

        customerManager = customerManager2;
        // customerManager reference number = customerManager2 reference number

        // Artik stackte tutulan customerManager in heap teki karsiligi da customerManager2 de tutulmus oluyor.
        // GC BELLEKTEN SİLER JAVA DA : ÇÖPÇÜ =d
        customerManager.add();
        customerManager.remove();
        customerManager.update();

        // value
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2= sayi1;
        sayi1=30;
        System.out.println(sayi2);

        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);

        // diziler reference tiptir.




    }
}