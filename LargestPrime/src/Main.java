public class Main {
    public static void main(String[] args) {

        System.out.println(getLargestPrime(1));
    }




    public static int getLargestPrime(int number) {
        int divisor = 1;

        if (number < 1) {
            return -1;
        }

        while (number != 1){

            if (number % divisor == 0) {
                number = number / divisor;
                System.out.println("number:"+number);
                System.out.println("divisor:"+divisor);
            }
            divisor++;
        }
        divisor--;

        for(int i=2;i<divisor;i++){
            if (divisor%i==0){
                return -1;
            }
        }

        return divisor;
    }

}
