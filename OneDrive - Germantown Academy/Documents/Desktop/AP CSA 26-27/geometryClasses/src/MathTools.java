public class MathTools {
    //Create the static MathTools methods in this file
    public static int randint(int min, int max){
        return (int) (Math.random()*(max-min+1) + min);
    }
    public static double round(double num, int places){
        int mult = (int) (Math.pow(10, places));
        double rounded = ((int) ((num * mult) + 0.5));
        return (double) rounded / mult;
        }
    
    public static double distance(Point a, Point b){
        return Math.sqrt(Math.pow((double) (b.getY()-a.getY()), 2.0)  + Math.pow((double)(b.getX()-a.getX()), 2.0));
    }
    public static double slope(Point a, Point b){
        return (double) (b.getY()-a.getY())/(b.getX()-a.getX());
    }
}
