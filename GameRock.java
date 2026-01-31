
import java.util.Random;
import java.util.Scanner;

public class GameRock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 for rock ,2 for scissor,3 for paper");
        int user = sc.nextInt();
        Random rand = new Random();
        switch (user) {
            case 1:
                System.out.println("you entered rock ");
                break;
            case 2:
                System.out.println("you entered scissor");
                break;
            case 3:
                System.out.println("you entered paper ");
                break;
            default:
                System.out.println("wrong entry");
                return;
        }
        int bot = rand.nextInt(3) + 1;
        if (bot == 1) {
            System.out.println("bot entered rock");
        } else if (bot == 2) {
            System.out.println("bot entered scissor");
        } else {
            System.out.println("bot entered paper");
        }
        if (bot == user) {
            System.out.println("match is drawn");
        } else if (user == 1 && bot == 2 || user == 2 && bot == 3 || user == 3 && bot == 1) {
            System.out.println("user win");
        } else {
            System.out.println("bot win");
        }
    }
}
