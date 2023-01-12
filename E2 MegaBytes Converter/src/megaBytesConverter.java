public class megaBytesConverter {
    public static void printMegaByteAndKiloBytes (int kilobytes)
    {

        int megabytes = (kilobytes/1024);
        int remainder = (kilobytes%1024);
        System.out.println(kilobytes+"KB = "+ megabytes+" MB and "+remainder+" KB");

        if (kilobytes <0)
        {
            System.out.println("Invalid Value");
        }
    }

}

