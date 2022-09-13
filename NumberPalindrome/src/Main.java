public class Main {
    public static void main(String[] args) {

        boolean esito=isPalindrome(12321);
        if(esito)
        {System.out.println("the number is palindrome");}
    }


    public static boolean isPalindrome(int number){

        int reverse=0;

        while (number>0) {
            int lastDigit = number % 10;
            System.out.println("last digit: " + lastDigit);
            reverse = lastDigit + reverse;
            System.out.println("reverse 1: " + reverse);
            if(reverse==number){
                return true;
            }
            reverse = reverse * 10;
            System.out.println("reverse 2: " + reverse);
            number=number/10;
        }
        return false;
    }
}
