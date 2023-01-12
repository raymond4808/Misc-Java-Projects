public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String myString= "This is a string";
        System.out.println(myString);
        myString = myString + ", plus more of the string";
        System.out.println(myString);
        myString = myString + " \u00A92022";
        System.out.println(myString);

        String numberString = "230.5";
        numberString= numberString + "0.5";
        System.out.println(numberString); //Strings only do text and doesn't perform math calculations


    }
}