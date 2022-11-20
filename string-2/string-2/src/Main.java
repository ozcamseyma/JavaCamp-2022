public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel.";

        System.out.println(mesaj);

        System.out.println(mesaj.replace(' ','=')); // degistirmek

        String  yeniMesaj = mesaj.replace(' ','=');
        System.out.println(yeniMesaj);

        System.out.println(mesaj.substring(2,5)); // bir metinden parca alma sistemi

        // split : karakter dizisini parcalamaya yarar.

        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase()); // kucuk harfe cevirme islemi
        System.out.println(mesaj.toUpperCase()); // buyuk harfe cevirme islemi

        System.out.println(mesaj.trim()); // basindaki ve sonundaki bosluklari atma sistemi



    }
}