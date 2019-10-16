package mastering.repetition;

public class Wall {
    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        setHeight(height);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width>=0) {
            this.width = width;
        }else{
            this.width=0;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height>=0) {
            this.height = height;
        }else{
            this.height=0;
        }
    }
    public double getArea(){
        return this.height*this.width;
    }
}
