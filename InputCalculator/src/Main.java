import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage(){
        int numbersOfValue=0;
        int sum=0;
        long average=0;
        Scanner scanner = new Scanner(System.in);


        while(true) {
            boolean isInt = scanner.hasNextInt();


            if(isInt) {
                int number = scanner.nextInt();
                sum = sum + number;
                numbersOfValue++;
                average = sum/numbersOfValue;
                System.out.println("SUM = " + sum + " AVG = " + average);


            }else {
                System.out.println("SUM = " + sum + " AVG = " + average);
                scanner.close();
                break;
            }


        }
    }
}
