public class Main {
    public static void main(String[] args)
    {
        for (double i=8.0; i>1; i--) {
            System.out.println(calculateInterest(10000.0, i));
        }// have to place sout into for loop with method inorder to run variable i loop
        int count =0;
        for (int i=10; i<50; i++)
        {
            if (isPrime(i))
            {
                count++;
                System.out.println("Number" + i + " is a prime number");
                if (count ==5)
                {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }
    public static double calculateInterest(double amount, double interestRate)
    {
        return (amount*(interestRate/100));
    }

    public static boolean isPrime (int n)
    {
        if (n==1)
        {
            return false;
        }
        for (int i=2; i<=n/2; i++)
        {
            if (n%i==0)
            {
                return false;
            }
        }
        return true;
    }

}
