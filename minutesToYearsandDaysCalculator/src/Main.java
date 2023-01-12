public class Main {
    public static void printYearsAndDays(long XX)
    {
        if (XX<0)
        {
            System.out.println("Invalid Value");
        }
        else {//if using void; use else instead of return
            long hours = (XX / 60);
            long days = (hours / 24);
            long YY = (days / 365);
            long ZZ = (days % 365);

            System.out.println(XX + " min = " + YY + " y and " + ZZ + " d");
        }
    }
    public static void main(String[] args)
    {

    }
}