import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("il numero:");
        int number=scanner.nextInt();
        scanner.nextLine();
        System.out.println(number);
        System.out.println("il nome:");
        String name=scanner.nextLine();
        System.out.println(name);



        scanner.close();



    }


}
