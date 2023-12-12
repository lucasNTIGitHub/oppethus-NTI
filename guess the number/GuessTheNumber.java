import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);

        // get a random number from 0 to 9
        int randomNumber = (int) (Math.random() * 10);

        boolean playing = true;
        while (playing) {
            // ask to guess the number
            System.out.println("Guess the number:");

            // get the users guess
            int usersGuess = input.nextInt();

            // compare the random number with the users guess
            if (randomNumber < usersGuess) {
                System.out.println("The number is smaller then " + usersGuess);
            } else if (randomNumber > usersGuess) {
                System.out.println("The number is bigger then " + usersGuess);
            } else {
                System.out.println("You guessed correctly! The number is " + randomNumber);
                playing = false;
            }
        }
        // close the scanner
        input.close();
    }
}