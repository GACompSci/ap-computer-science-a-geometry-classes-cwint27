public class Circle {
    private int radius;
    private Point center;

    public Circle(int radiusvalue, Point centerpoint){
        radius = radiusvalue;
        center = centerpoint;
    }

    public double getRadius(){
        return MathTools.round(radius, 2);
    }

    public double getArea(){
        return MathTools.round((Math.PI * Math.pow(radius, 2)), 2);
    }   
}

