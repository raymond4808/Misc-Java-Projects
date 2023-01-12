public class Main {
//    public static int calculateScore (String playerName, int score)
//    {
//        System.out.println("Player "+ playerName+ " scored "+score +" points");
//        return score*1000;
//    }
//    public static int calculateScore (int score)
//    {
//        System.out.println("Player unknown scored "+score +" points");
//        return score*1000;
//    }
//    public static int calculateScore ()
//    {
//        System.out.println("Player unknown scored "+"no points");
//        return 0;
//    }


    public static void main(String[] args)
    {
////        int newScore= calculateScore("ur mum",500 );
////        System.out.println("New score is "+ newScore);
////        int newerScore= calculateScore(501);
////        System.out.println("New score is "+ newerScore);
////        int newscore =calculateScore();
////        System.out.println("New score is no score");
//
        double centimeters= calcFeetAndInchesToCentimeters(3,3);{
            if (centimeters <.00)
            {
                System.out.println("invalid numbers");

            }

     }
            calcFeetAndInchesToCentimeters(99);

    }
    public static double calcFeetAndInchesToCentimeters (double feet, double inches)
    {
        if (feet >=0 && (inches >=0 && inches <=12)) {

            double convFeetToInches = (feet * 12);
            {
                double inchesToCentimeters= ((convFeetToInches*2.54)+(inches*2.54));
                double totalCentimeters= (inchesToCentimeters);
                System.out.println(feet +" feet plus "+ inches + " inches is equal to "+ totalCentimeters + " cms");
                return totalCentimeters;
            }

        }
    return -1;
    }
    public static double calcFeetAndInchesToCentimeters (double inches)
    {
        if (inches >=0)
        {double feet = (inches/12);
            double remainingInches= ((inches%12));
            System.out.println(inches +" inches is equal to "+ feet +" feet and "+ remainingInches + "inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);

        }
        return -1;
    }
}