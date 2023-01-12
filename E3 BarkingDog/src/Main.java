public class Main {

    public static boolean shouldWakeUp (boolean barking,int hourOfTheDay)
    {

        if (barking==false || hourOfTheDay>7 && hourOfTheDay <23 || hourOfTheDay <0 || hourOfTheDay >23) //allows placement of boolean and int variable conditions
        {
            System.out.println("Don't Need To Wake Up");
            return false;
        }

        {
            System.out.println("wake up");
        }
        return true;

    }

    public static void main(String[] args)
    {
        shouldWakeUp(true,0);
        shouldWakeUp(true, 12);
    }
}