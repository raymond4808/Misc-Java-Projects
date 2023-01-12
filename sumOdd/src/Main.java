public class Main {
    public static void main(String[] args)
    {
sumOdd(1, 100);
    }
    public static boolean isOdd (int number)
    {
        if (number <= 0 || number%2 ==0)
        {
            return false;
        }
        return true;
    }


    public static int sumOdd (int start, int end)
    {
        int sum=0;
        if ((end < start)|| start <0 || end <0)
        {
            return -1;
        }

        for (int i=start;i<=end ; i++) //for loop format (start,end, increments)
        {
            if (isOdd(i))
            {
                sum+=i;
            }

        }
        System.out.println(sum);
        return sum;


    }
}