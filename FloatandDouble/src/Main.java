public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        float myMinFloat= Float.MIN_VALUE;
        float myMaxFloat= Float.MAX_VALUE;
        System.out.println("My Min Float Value= "+ myMinFloat);
        System.out.println("My Min Float Value= "+ myMaxFloat);

        double myMindouble= Double.MIN_VALUE;
        double myMaxdouble= Double.MAX_VALUE;
        System.out.println("My Min double Value= "+ myMindouble);
        System.out.println("My Max double Value= "+ myMaxdouble);

        int myIntValue= 5/3;
        float myFloatValue= (5f/3f);
        double myDoubleValue= (5.00d/3.00d);
        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        double myPoundValue= 135d;
        double myKiloConversion= 0.45359237d;
        double myPoundtoKilo= (myPoundValue*myKiloConversion);
        System.out.println("My Weight (lb) converted to kilo = "+ myPoundtoKilo);

    }
}