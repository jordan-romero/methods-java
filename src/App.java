public class App {
    public static void main(String[] args) {
        boolean gameOver = true; 
       int score = 4000; 
       int levelCompleted = 5; 
       int bonus = 100; 

        
       calculateScore(true, score, levelCompleted, bonus);
        score = 10000; 
        levelCompleted = 8; 
        bonus = 200; 
       calculateScore(true, score, levelCompleted, bonus);
        
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) { 

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus); 
            System.out.println("Your final score was " + finalScore);
        }
    }
}
