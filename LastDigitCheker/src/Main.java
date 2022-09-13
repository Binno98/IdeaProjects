public class Main {
    public static void main(String[] args) {
        boolean result=hasSameLastDigit(9,99,999);
        System.out.println(result);

    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        int lastDigit1, lastDigit2, lastDigit3;

        if (isValid(num1) || isValid(num2) || isValid(num3)) {
            lastDigit1 = num1 % 10;
            lastDigit2 = num2 % 10;
            lastDigit3 = num3 % 10;

            System.out.println(lastDigit1);
            System.out.println(lastDigit2);
            System.out.println(lastDigit3);

            if (lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3) {
                return true;
            } else return false;
        }else return false;
    }






            public static boolean isValid(int number){
                if(number>=10&&number<=1000){
                return true;
                }else
                    return false;
            }

        }









