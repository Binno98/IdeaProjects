public class Main {
    public static void main(String[] args) {
       boolean result=isPerfectNumber(6);
        System.out.println(result);
    }

    public static boolean isPerfectNumber(int number) {
        int n=number-1;
        int total=0;

        if (number < 1) {
            return false;
        }


        while(n>=1){

            if(number%n==0){
                total=total+n;
            }
            n--;
        }


        if(total==number){
            return true;
        }else return false;

    }

    }



