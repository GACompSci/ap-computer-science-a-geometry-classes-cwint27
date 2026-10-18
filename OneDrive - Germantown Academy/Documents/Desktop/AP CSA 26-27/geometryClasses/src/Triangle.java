public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point pointA, Point pointB, Point pointC){
        a = pointA;
        b = pointB;
        c = pointC;
    }

    public double getArea(){
        return Math.abs(MathTools.round(0.5 * (MathTools.distance(a, b)) * (Math.sin((Math.atan(MathTools.slope(a, c))-Math.atan(MathTools.slope(a, b))))*MathTools.distance(a, c)), 2));
    }
}
