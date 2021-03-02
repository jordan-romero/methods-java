public class App {
    public static void main(String[] args) {
        boolean gameOver = false; 
        
       int highScore = calculateScore(gameOver, 800, 5, 100);

        int position = calculateHighScore(highScore);
       
       highScore = calculateScore(gameOver, 10000, 8, 200);

       position = calculateHighScore(highScore);

       displayHighScorePosition("Jordan", position); 

        
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) { 

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus); 
            return finalScore; 
        }
        return -1; 
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the highscore table.");
    }

    public static int calculateHighScore(int highScore) {
       if (highScore > 1000) {
           return 1; 
       } else if (highScore > 500 && highScore < 1000) {
           return 2; 
       } else if (highScore > 100 && highScore < 500) {
           return 3;
       } else {
           return 4; 
       }
    }
}
