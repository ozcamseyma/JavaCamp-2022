public class Main {
    public static void main(String[] args) {

        // double[] myList = new double[4];

        double[] myList = {1.2, 1.3, 4.3, 5.6};

        for (double number : myList) {
            System.out.println(number);
        }

        System.out.println("==================================");

        // Dizilerin Toplami - En Buyuk Sayi

        double[] MyList = {2.2, 2.3, 5, 3, 5.5};
        double total = 0;
        double max = MyList[0];
        for (double numbers : MyList) {
            if (max < numbers){
                max = numbers;
            }
            total = total + numbers;
            System.out.println(numbers);
        }

        System.out.println("Toplam: " + total);
        System.out.println("En Büyük: " + max);




    }
}