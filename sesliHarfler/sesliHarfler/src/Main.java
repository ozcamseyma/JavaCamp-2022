public class Main {
    public static void main(String[] args) {


        // Kalın ve İnce Ses Harf Kontrolü

        char harf = 'E';


        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
        }



    }
}