public class Main {
    public static double area (double radius)
    {
        if (radius < -1.0)
        {
            return -1.0;
        }
        double areaCircle = (Math.PI*radius*radius);
        return areaCircle;

    }
    public static double area (double X, double Y)
    {
        if (X<0 || Y <0)
        {
            return -1.0;
        }
        double areaOfRectangle= (X*Y);
        return areaOfRectangle;
    }
    public static void main(String[] args)
    {

    }
}