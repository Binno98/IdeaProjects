public class Main {
    public static void main(String[] args) {


        boolean result = canPack(2,7,18);
        System.out.println(result);
    }


    public static boolean canPack(int bigCount, int smallCount, int goal){
        

            for(int i = 0;i<=bigCount;i++){

                for(int c=0;c<=smallCount;c++){
                    System.out.println("valore i:"+i+", valore c:"+c);
                    if((i*5)+c==goal){
                        return true;
                    }
                }
            }

            return false;


    }





}
