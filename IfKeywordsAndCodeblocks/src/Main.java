public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;

//    if (score <5000 && score >1000){
//        System.out.println("score is less than 5000 but not less than 1000");}
//    else if (score >1000) {
//            System.out.println("Your score was greater than 1000");
//        }
//    else{
//        System.out.println("ggs no re, got less than 1K");
        if (gameOver == true) {
            int finalscore = (score + (levelComplete * bonus+1000));
            System.out.println("The final score was " + finalscore);
        }

//    boolean cGameOver= true;
//    int cScore=10000;
//    int cLevelComplete=8;
//    int cBonus=200;
//    if (cGameOver==true){
//        int cFinalScore= (cScore+ (cLevelComplete*cBonus));
//        System.out.println("The challenge final score was "+ cFinalScore);}

        score = 10000;
        levelComplete = 8;
        bonus = 200;
        if (gameOver == true) {
            int finalscore = (score + (levelComplete * bonus));
            System.out.println("The final score was " + finalscore);
        }
    }
}
