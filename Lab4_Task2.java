import java.util.Scanner;

public class Lab4_Task2 {

    public static void main(String[] args) {

    while(GuessTheWord.Score < 10){

        System.out.println("Your score is " + GuessTheWord.Score);
        GuessTheWord.LevelOne(args);
    }

    GuessTheWordLevelTwo.LevelTwo();

    }

}


    class GuessTheWord{

    public static int Score;

    public static void LevelOne (String [] words){
        Scanner scn = new Scanner(System.in);
        System.out.println("Guess The Word (Hint: Start with W)  : ");
        String input = scn.next();


        if(words[0].equals(input)){
            Score = Score-1;
        } else if (words[1].equals(input)) {
            Score += 5;
        } else if (words[2].equals(input)) {
            Score += 1;
        }


    }


}

    class GuessTheWordLevelTwo{
     public static void LevelTwo (){

            System.out.println("You are Now at Level 2 !!!");

            GuessTheWord.Score += 10;

            System.out.println("Your Score is + "+GuessTheWord.Score);

        }

}