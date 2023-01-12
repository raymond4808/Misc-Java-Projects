public class Main {
    public static void main(String[] args) {

        hasEqualSum(1,1, 2);
        hasEqualSum(1,1,1);
    }
    public static boolean hasEqualSum (int firstPara, int secondPara, int thirdPara)
    {
      if (firstPara+secondPara == thirdPara)
      {
          {
              System.out.println("The sum of the parameters are equal to each other");
          }
          return true;
      }
        System.out.println("Sums don't add up to each other");
    return false;


    }
}