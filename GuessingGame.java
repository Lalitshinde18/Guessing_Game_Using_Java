import java.util.Scanner;

public class GuessingGame {
    
    int random ;
    GuessingGame (){
     random = (int) Math.ceil(Math.random() * 100);
        
    }
    // method
    /**
     * 
     * @param guessNumber the number that player guessed 
     * @return 
     * - Negative if the guessed number is smaller
     * - 0 if the guessed number is correct.
     * - positive if the guessed number is higher. 
     */
    int guess(int guessNumber){
        
        return guessNumber - random;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessingGame game = new GuessingGame();
        System.out.println("Welcome to the Guessing number . Guess the number between 1-100 ");
        
        int guess;
        int result;
        do{
            System.out.println("Guess the number:");
            guess = input.nextInt();
            result = game.guess(guess);
            if (result == 0) {
                System.out.println("Congrats, your guess is correct");
            }else if (result < 0) {
                System.out.println("Please guess Higher");
            } else {
                System.out.println("Plese guess Lower");
            }

            
        }while(result  != 0);



    }

}
