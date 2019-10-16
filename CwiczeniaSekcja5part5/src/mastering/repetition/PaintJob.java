package mastering.repetition;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if((width >0 && height >0 && areaPerBucket>0 ) && (extraBuckets >=0)){
            int numberOfBuckets = (getBucketCount(width,height,areaPerBucket))-extraBuckets;
            return numberOfBuckets;
        }else{
            return -1;
        }
    }
    public static int getBucketCount(double width,double height, double areaPerBucket){
        if(width > 0 && height > 0 && areaPerBucket >0){
            double area = width*height;
            int numberOfBuckets = getBucketCount(area,areaPerBucket);
            return numberOfBuckets;
        }else{
            return -1;
        }
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area > 0 && areaPerBucket > 0){
            int numberOfBuckets = (int)(Math.ceil((area/areaPerBucket)));
            return numberOfBuckets;
        }else{
            return -1;
        }
    }

}
