package Start;
import TEXTpackage.*;
import java.util.*;

/**
*The Start class represents the beginning of the game where the user has a list of
*options they can choose from that involve playing the game and viewing the rules
*The user will select an option based on their input
*This is how the game will begin
*/

public class Start {

	private static Scanner user_input;
	private static GameConfiguration game;

	public static void main(String[] args) {

        user_input = new Scanner(System.in);
        int selection, players;

        System.out.println("Sushi GO!");
        System.out.println("1) Player vs Player");
        System.out.println("2) Player vs AI");
        System.out.print("Please Choose One of the Options: ");
        while (!user_input.hasNextInt()) {
            String input = user_input.next();
            System.out.printf("\"%s\" is not a valid number.\n", input);
        }

        selection = user_input.nextInt();

        if (selection == 1 || selection == 2) {
            do {
                System.out.print("Enter the number of players between 2-4: ");
                while (!user_input.hasNextInt()) {
                    String input = user_input.next();
                    System.out.printf("\"%s\" is not a valid number.\n", input);
                }
                players = user_input.nextInt();
            }
            while (players < 2 || players > 4);


            game = new GameConfiguration(selection, players);
            game.play();
        } else {
            System.out.println("You did not choose 1) Player vs Player or 2) Player vs AI. Please reload the program and try again");
        }
    }

}
