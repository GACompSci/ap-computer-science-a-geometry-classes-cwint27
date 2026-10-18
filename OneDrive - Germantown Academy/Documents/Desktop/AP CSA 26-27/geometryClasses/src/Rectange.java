public class Rectange {
    private Point topLeft;
    private int length;
    private int width;

    public Rectange(Point topLeftPoint, int lengthValue, int widthValue){
        topLeft = topLeftPoint;
        length = lengthValue;
        width = widthValue;
   }

    public double getArea(){
        return MathTools.round(length*width, 2);
   }
}
