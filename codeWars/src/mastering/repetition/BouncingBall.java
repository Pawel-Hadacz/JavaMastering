package mastering.repetition;

public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {

        int cout = 1;
        if(h>0 && (bounce > 0 && bounce < 1) && window < h){
            h=h*bounce;
            while(h>window){
                h=h*bounce;
                cout= cout + 2;
            }
        }
        else {
            return -1;
        }
        return cout;
    }
}
