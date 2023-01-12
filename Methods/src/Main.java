public class Main {
    public static void main(String[] args)
    {

//        {
//            int highScore = calculateScore(true, 800, 5, 100);
//            System.out.println("High score was " + highScore);
//
//            highScore = calculateScore(true, 10000, 8, 200);
//            System.out.println("High score was " + highScore);
//        }

        int highScorePosition=(calculateHighScorePosition(1500));//inputs number into second method to give position
        displayHighScorePosition("Bob", highScorePosition);//gets return number based on player score and inputs value to output string
        highScorePosition=(calculateHighScorePosition(900));
        displayHighScorePosition("Bob1", highScorePosition);
        highScorePosition=(calculateHighScorePosition(499));
        displayHighScorePosition("Bob2", highScorePosition);
        highScorePosition=(calculateHighScorePosition(80));
        displayHighScorePosition("Bob3", highScorePosition);
    }



    public static void displayHighScorePosition (String playerName, int highScorePosition)//one method slide 49
    {
        System.out.println(playerName +" managed to get position "+ highScorePosition +" on the highscore table");
    }

    public static int calculateHighScorePosition (int playerScore)//second method slide 49
    {
        if (playerScore>=1000)
        {
            return 1;
        }
        else if (playerScore >=500 )
        {
            return 2;
        }
        else if (playerScore >=100 )
        {
            return 3;
        }
        else return 4;
    }

//    public static int calculateScore (boolean gameOver, int score, int levelComplete, int bonus) {
//
//        if (gameOver == true) {
//            int finalScore = (score + (levelComplete * bonus+1000));
//            return finalScore;}
//
//        else return -1;
//    }
}
