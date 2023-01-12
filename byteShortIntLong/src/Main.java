public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        byte myMinByteValue= Byte.MIN_VALUE;
        byte myMaxByteValue= Byte.MAX_VALUE;
        System.out.println("Byte Min Value =" + myMinByteValue);
        System.out.println("Byte Max Value =" + myMaxByteValue);

        short myMinShortValue= Short.MIN_VALUE;
        short myMaxShortValue= Short.MAX_VALUE;
        System.out.println("Short Min Value=" + myMinShortValue);
        System.out.println("Short Max Value=" + myMaxShortValue);

        int myMinIntValue= Integer.MIN_VALUE;
        int myMaxIntValue= Integer.MAX_VALUE;
        System.out.println("Integer Min Value ="+ myMinIntValue);
        System.out.println("Integer Max Values =" + myMaxIntValue);

        long myMinLongValue= Long.MIN_VALUE;
        long myMaxLongValue= Long.MAX_VALUE;
        System.out.println("Long Min Value=" + myMinLongValue);
        System.out.println("Long Max Value=" + myMaxLongValue);

        long myLongValue= 21474836471L;
        System.out.println(myLongValue);

        short bigShortLiteralValue= 32767;

        int myTotal= (myMinIntValue/2); //Broad casting
        byte myNewByteValue= (byte)(myMinByteValue/2); //narrow casting (Java uses integer by default so must specify if narrow casting)
        short myNewShortValue= (short) (myMinShortValue/2);

        //challenge PPT28

        byte myChallengeByte= 111;
        short myChallengeShort= 11111;
        int myChallengeInt= 111111;
        long myChallengeLong= (50000L+ (10L*(myChallengeByte+myChallengeShort+myChallengeInt)));
        short myShortTotal= (short) (50000+ (10*(myChallengeByte+myChallengeShort+myChallengeInt)));
        System.out.println(myChallengeLong);
        System.out.println(myShortTotal);
    }
}
