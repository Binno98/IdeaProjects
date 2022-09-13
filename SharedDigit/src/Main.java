public class Main {
    public static void main(String[] args) {
        boolean result=hasSharedDigit(345,123);
        System.out.println(result);
    }

    public static boolean hasSharedDigit(int numb1,int numb2){
        int valueOfConfront1,valueOfConfront2;

        while(numb1>0){
            valueOfConfront1=numb1%10;
            valueOfConfront2=numb2%10;
            System.out.println("primo valore: "+valueOfConfront1+", secondo valore: "+valueOfConfront2);
            if(valueOfConfront1==valueOfConfront2){
                return true;
            }
            numb1=numb1/10;
        }

        while(numb2>0){
            valueOfConfront1=numb1%10;
            valueOfConfront2=numb2%10;
            if(valueOfConfront1==valueOfConfront2){
                return true;
            }
            numb2=numb2/10;
        }
        return false;
    }
}
