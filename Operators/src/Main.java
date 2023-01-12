public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int result = 1 + 2;// 3
        System.out.println(result);
        int previousresult = result; // 3=3
        System.out.println("previous results = " + previousresult);
        result = result - 1; //3-1
        System.out.println("3-1 = " + result);// based on line 8 result
        System.out.println("previous results = " + previousresult); //value of previous result is based on line 6 where result then =3

        result = result * 10; //2*10
        System.out.println("2*10 = " + result);

        result = result / 5; // line 12 result (20) / 5
        System.out.println("20/5 = " + result);

        result = result % 3; //remainder of 4/3, should be 1
        System.out.println("Remainder of 4/3 = " + result);

        //result= result (line 18 result)=1
        result++; //result+1=2
        System.out.println("1+1 = " + result);

        result--;
        System.out.println("2-1 = " + result);

        //result= result +2
        result += 2; // 1+2=3
        System.out.println("1+2 = " + result);

        //result = result *10;
        result *= 10;
        System.out.println("3*10 = " + result);

        //result = result/3
        result /= 3;
        System.out.println("30/3 = " + result);

        //result = result-2
        result -= 2;
        System.out.println("10-2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("and im green");
        }
        if (isAlien == true)
            System.out.println("It is an alien!");

        int topScore = 100;
        if (topScore <= 100)
            System.out.println("You Got the Highest Score");
        if (topScore != 100)
            System.out.println("You Didn't get the top score");

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore <= 100)) { // && is AND so BOTH statements in parenthesis must be true
            System.out.println("You scored second, you loser!");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) { // || is OR so EITHER statements in parenthesis have to be true
            System.out.println("U basically got second score");
        }

        int newValue = 50;// one = is assignment
        if (newValue == 50) {// two = is equals to, == is used with if/booleans statements
            System.out.println("This is not Error");
        }

        boolean isCar = false;// one = is assignment
        if (isCar) {// two = is equals to, == is used with if/booleans statements
            System.out.println("This is not supposed to happen");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar=true");
        }

        int ageOfClient = 21;
        boolean legalAgeClient = (ageOfClient) < 21 ? true : false;
        if (legalAgeClient)
            System.out.println("You are not of legal age");
        if (!legalAgeClient)
            System.out.println("You are of legal age");
//Operator challenge video 40
        double myFirstDouble= 20.00;
        double mySecondDouble= 80.00;
        double myOpChallengeThree= ((myFirstDouble+mySecondDouble)*100);
        System.out.println(myOpChallengeThree);

        double myRemainder= (myOpChallengeThree%40.00d);
        boolean myRemainderVerify = (myRemainder ==0)? true:false;
        System.out.println("The resulting remainder is "+myRemainder);
        if (myRemainderVerify)
            System.out.println("My remainder does equal 0");
        if (!myRemainderVerify)
            System.out.println("Got some remainder that wasn't zero");

    }



    }
