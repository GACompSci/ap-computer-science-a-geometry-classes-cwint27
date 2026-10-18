public class App {
    public static void main(String[] args) throws Exception {
        // Create your objects and call their method here
        Point a = new Point(MathTools.randint(1, 10), MathTools.randint(1, 10));
        Circle d = new Circle(MathTools.randint(1, 10), a);
        System.out.println(d.getArea());
        System.out.println(d.getRadius());

        Rectange e = new Rectange(a, MathTools.randint(1, 10), MathTools.randint(1, 10));
        System.out.println(e.getArea());
    }

}
