public class Main {
    public static void main(String[] args) {
//        int switchValue= 5;
//        switch (switchValue)
//        {
//            case 1:
//                System.out.println("value was 1");
//                break;
//
//            case 2:
//                System.out.println("value was 2");
//                break;
//            case 3: case 4: case 5:
//            System.out.println("was either 3, 4, 5");
//            System.out.println(" It was actually "+ switchValue);
//            break;
//
//            default:
//                System.out.println("was not 1 or 2");
        char charValue= 'F';
        switch (charValue)
        {
            case 'A': case 'B':case 'C':case 'D':case 'E':
                System.out.println("The char was "+ charValue);
                break;
            default:
                System.out.println(" Char Values A, B, C, D, E not found");
                break;
        }

        }
    }
