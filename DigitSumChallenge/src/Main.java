public class Main {
    public static void main(String[] args)
    {
        System.out.println("the sum of the digits in number is " +sumDigits(999) );
    }
    public static int sumDigits (int number)
    {
        if (number <10)
        {
            return -1;
        }
        int sum=0;
        while (number >0) //for this while loop its using the remainder of 10 as significant number to add the digits together
        {
            int digit = number %10;
            sum+=digit;
            number /=10; //drops least insignificant digit so loop digits will stop?
        }
        return sum; //returns all the sums of the loops together into one final variable
    }
}