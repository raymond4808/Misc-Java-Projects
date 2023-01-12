public class Main {
    public static void main(String[] args)
    {
getDaysInMonth(3, 2000);
    }
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

    public static int getDaysInMonth (int month, int year)
    {
        if (month <1 || month > 12 || year <1 || year >9999)
        {
            return -1;
            if (month ==1|| month== 3|| month==5|| month==7 || month==8 || month==10|| month==12)
            {
                return 30;
            }
            if (month==9 || month==4 || month== 6|| month== 11)
            {
                return 31;
            }
            if (month == 2)
            {
                return 28;
            }
            if (month ==2 && isLeapYear(year))
            {
                return 29;
            }
        }


    }// incomplete problem; didnt use cases to solve assignment
}