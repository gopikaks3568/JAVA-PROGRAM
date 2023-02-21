public class method {
    public static void main(String[] args) {
        boolean gameover = true;
        int score = 800;
        int levelcompleted = 5;
        int bonus = 100;
        int highscore = calculatescore(gameover, score, levelcompleted, bonus);
        System.out.println("The highscore is "+highscore);
        score=10000;
        levelcompleted=8;
        bonus=200;
    
        System.out.println("The next highscore is "+calculatescore(gameover, highscore, levelcompleted, bonus));
       calculatescore(gameover,score, levelcompleted, bonus);
    }
    public static int calculatescore(boolean gameover,int score,int levelcompleted,int bonus) {
  
        int finalscore = score;
        if (gameover) {
            finalscore += (levelcompleted * bonus);
            finalscore+=1000;
            
        }
        return finalscore; 
    }
}
