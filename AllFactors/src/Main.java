public class Main {

    public static void main(String[] args) {
        printFactors(6);
    }



    public static void printFactors(int number) {
        int value = 1;

        if (number<1) {
            System.out.println("Invalid Value");
        }

        while (value <=number) {
            if (number % value == 0) {
                System.out.println(value);
                value++;
            }else value++;

        }
    }
}
