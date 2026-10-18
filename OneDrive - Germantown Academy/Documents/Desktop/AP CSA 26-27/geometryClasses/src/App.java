public class App {
    public static void main(String[] args) throws Exception {
        // Create your objects and call their method here
        Point a = new Point(MathTools.randint(1, 10), MathTools.randint(1, 10));
        Point b = new Point(MathTools.randint(1, 10), MathTools.randint(1, 10));
        Point c = new Point(MathTools.randint(1, 10), MathTools.randint(1, 10));

        System.out.println(a.getX());
        System.out.println(a.getY());
        System.out.println(b.getX());
        System.out.println(b.getY());
        System.out.println(c.getX());
        System.out.println(c.getY());

        Circle d = new Circle(MathTools.randint(1, 10), a);
        System.out.println(d.getArea());
        System.out.println(d.getRadius());

        Rectange e = new Rectange(a, MathTools.randint(1, 10), MathTools.randint(1, 10));
        System.out.println(e.getArea());

        Triangle tri = new Triangle(a, b, c);
        System.out.println(tri.getArea());
    }

}
