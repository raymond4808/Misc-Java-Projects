public class SpeedConverter {
    //    public static int numberToResultConvert (int number){
//        if (number > 0) {
//            System.out.println("Positive");
//        } else if (number <0){
//            System.out.println("Negative");
//        } else if (number ==0) {
//            System.out.println("Zero");
//        }
//        return -1;
//
//    }

    public static long toMilesPerHour (double kilometersPerHour)
    {
        if (kilometersPerHour <0)
        {
        return -1;
        }
        return Math.round(kilometersPerHour / 1.609);

    }

    public static void printConversion (double kilometersPerHour)
    {
            if (kilometersPerHour<0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour+ " km/h = " + milesPerHour + " mi/h");
        }


    }

}