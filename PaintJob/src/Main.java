public class Main {
    public static void main(String[] args) {
getBucketCount(0.75,0.75,0.5,0);
    }

    public static int getBucketCount(double width/*larghezza*/,double height,double areaPerBucket,int extraBuckets){
        if(width<=0||height<=0||areaPerBucket<=0||extraBuckets<0){
            return -1;
        }

        double area=width*height;
        int bucketsNeeded = (int) Math.ceil(area/areaPerBucket);
        bucketsNeeded=bucketsNeeded-extraBuckets;
        System.out.println(bucketsNeeded);

        return bucketsNeeded;


    }


    public static int getBucketCount(double width,double height,double areaPerBucket){
        int numberOfBuckets;
        if(width<=0||height<=0||areaPerBucket<=0){
            return -1;
        }

        double area=width*height;
        int bucketsNeeded = (int) Math.ceil(area/areaPerBucket);
        return bucketsNeeded;


    }


    public static int getBucketCount(double area,double areaPerBucket){
        if(area<=0||areaPerBucket<=0){
            return -1;
        }


        int bucketsNeeded = (int) Math.ceil(area/areaPerBucket);
        return bucketsNeeded;


    }
}
