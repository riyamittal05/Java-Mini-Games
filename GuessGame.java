//Create a Class game ,which allows a user to play "Guess the Number " game once

import java.util.Random;
import java.util.Scanner;

class Guess {

    int number;
    int guessNumber;
    int noOfGuess = 0;

    public Guess() {
        Random rand = new Random();
        number = rand.nextInt(100) + 1;

    }

    public void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you guess ");
        guessNumber = sc.nextInt();
        noOfGuess += 1;
    }

    public boolean isCorrectNumber() {
        if (guessNumber == number) {
            System.out.println("correct guess");
            System.out.println("you guess the answer in " + noOfGuess + " times");
            return true;

        } else if (guessNumber > number) {
            System.out.println("your number is large enter small number ");
            return false;
        } else {
            System.out.println("your number is small enter large number than this");
            return false;
        }
    }
}

public class GuessGame {

    public static void main(String[] args) {

        Guess player = new Guess();
        System.out.println("Game Start");
        System.out.println("Choose number between 1 to 100 ");
        player.userInput();
        while (!player.isCorrectNumber()) {
            System.out.println("guess the number again ");
            player.userInput();
        }
    }
}
