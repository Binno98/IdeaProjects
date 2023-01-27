import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int sum=0;
int count=1;
        Scanner scanner = new Scanner(System.in);



        while(count!=11) {

            System.out.println("Enter number# "+count+":");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();
                sum=sum+number;
                count++;
            }else {
                System.out.println("Invalid Value");
            }
            scanner.nextLine();

        }
        System.out.println("sum="+sum);
        scanner.close();

    }


}
