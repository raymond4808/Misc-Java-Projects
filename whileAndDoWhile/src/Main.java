public class Main {
    public static void main(String[] args) {
//       int count =0;
//        while (count != 5)
//        {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//
//        count =0;
//        while (true)
//        {
//            if (count==6)
//            {
//                break;
//            }
//            System.out.println("count value is " + count);
//            count++;
//        }
//
//        count=0;
//        do {
//            System.out.println("count value is " + count);
//            count++;
//            if (count >100)
//            {
//                break;
//            }
//        } while (count !=6);
        int totalEvenNumber=0;
        int number =4;
        int finishNumber =20;
        while (number <= finishNumber)
        {
            number++;
            if (!isEvenNumber(number))
            {
                continue;
            }

            totalEvenNumber++;

            System.out.println("even number "+ number+ " with total even numbers found "+ totalEvenNumber);

            if (totalEvenNumber >=5)
            {
                break;
            }

        }
    }

    public static boolean isEvenNumber (int n)
    {
    if (n==0 || n%2!=0)
    {
        return false;
    }
    return true;
    }

}