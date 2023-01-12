public class Main {
    public static void printMegaBytesAndKiloBytes (int kilobytes)
    {

        if (kilobytes <0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            int megabytes = (kilobytes / 1024);
            int remainder = (kilobytes % 1024);
            System.out.println(kilobytes + " KB = " + megabytes + " MB and " + remainder + " KB");
        }

    }

    public static void main(String[] args)
    {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-10);
    }



}

