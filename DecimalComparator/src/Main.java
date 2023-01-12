public class Main {
    public static boolean areEqualByThreeDecimalPlaces (double doubleOne, double doubleTwo)
    {
        int doubleOneCheck= ((int)(1000*doubleOne));
        int doubleTwoCheck= ((int)(1000*doubleTwo));

        if (doubleOneCheck==doubleTwoCheck)
             {
            System.out.println("true");
            return true;
             }
        System.out.println("false");
        return false;

    }





    public static void main(String[] args) {
    areEqualByThreeDecimalPlaces(3.110, 3.110);
    areEqualByThreeDecimalPlaces(3.1756, 3.1757);
    }
}