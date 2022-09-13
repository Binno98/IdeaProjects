public class Main {
    public static void main(String[] args) {

        int result=getEvenDigitSum(123456789);
        System.out.println("la somma è: "+result);
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;

        if (number > 0) {
            while (number > 0) {
                if ((number % 10) % 2 == 0) {
                    sum = (number % 10) + sum;
                    number = number / 10;
                }
                number = number / 10;
            }
            return sum;
        }
        return -1;
    }

}
