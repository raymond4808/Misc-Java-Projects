public class Main {

    public static boolean isLeapYear(int year)// follow the flow of boolean if statement flows
    {
        if (year > 1 && year <= 9999)// if year meets criteria flows down to the next if filter statement
        {
            if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)// if it passes this if statement its a valid leap year, if not it goes back OUT to false and not valid leap year
            {
                System.out.println("Valid Year");
                return true;
            }
         }
        System.out.println("Not Valid Year");
        return false;
    }




    public static void main(String[] args) {
    isLeapYear(1999);
    isLeapYear(-1200);
    isLeapYear(4);
    }

}
