public class Main {
    public static void main(String[] args) {

        int result=getGreatestCommonDivisor(81,153);
        System.out.println(result);
    }

    public static int getGreatestCommonDivisor(int first,int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int greatestCommon = 0;
        int divisor=1;
        int biggest;

        if(first>second){
            biggest=first;
        }else biggest=second;


        while(divisor<biggest){

            if(first%divisor==0&&divisor>greatestCommon&&second%divisor==0) {
                greatestCommon = divisor;
            }else divisor++;

        }
        return greatestCommon;

    }
}
