public class Circle {
    private int radius;
    private Point center;

    public Circle(int radiusvalue, Point centerpoint){
        radius = radiusvalue;
        center = centerpoint;
    }

    public int getRadius(){
        return radius;
    }

    public double getArea(){
        return MathTools.round((Math.PI * Math.pow(radius, 2)), 2);
    }   
}

