import java.util.Scanner;

public class GuessTheNumberNotDone {
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);

        // get a random number from 0 to 9
        int randomNumber = (int) (Math.random() * 10);

        boolean playing = true;
        while (playing) {
            // ask to guess the number
            System.out.println(TODO);

            // get the users guess
            int usersGuess = TODO;

            // compare the random number with the users guess
            if (TODO) {
                System.out.println(TODO);
            } else if (TODO) {
                System.out.println(TODO);
            } else {
                System.out.println(TODO);
                playing = TODO;
            }
        }
        // close the scanner
        input.close();
    }
}