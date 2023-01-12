public class Main {
    public static void main(String[] args) {
        int checkCounter = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0))
            {
                checkCounter++;
                sum += i;
                System.out.println("Found Number " + i);
            }
            if (checkCounter == 5)
            {
                break;
            }


        }
    }
}