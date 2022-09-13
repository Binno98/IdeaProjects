public class Main {
    public static void main(String[] args) {
        int result=sumFirstAndLastDigit(23485762);
        System.out.println("number sum is: "+result);
    }

    public static int sumFirstAndLastDigit(int number){
        int sum;
        int first=number%10;
        int last;

        while(number>0){
            number=number/10;
            System.out.println("number after /10: "+number);
            if(number<=9){
                last=number;
                sum=last+first;
                return sum;
            }

        }
        return -1;
    }

}
