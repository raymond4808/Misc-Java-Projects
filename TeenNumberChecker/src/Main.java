public class Main {
    public static void main(String[] args) {
        hasTeen(13, 21,21);
        hasTeen(1, 13, 3);
        hasTeen(1, 1, 1);
    }
    public static boolean hasTeen (int checkOne, int checkTwo, int checkThree)
    {
        return isTeen(checkOne) || isTeen(checkTwo) || isTeen(checkThree);

    }
    public static boolean isTeen(int age) {
        return (age >= 13 && age <= 19);
    }





}