import java.util.Scanner;

public class    Main
{
    public static void main(String args[]) {
        int pchoice = 0;//Variable to assign players a number according to their choice.
        String pname = "";//Variable for the whole name according to player's choice; ex: player chose 'p' then this would be paper
        String cname = "";// Variable for the name assigning to the computer generated number
        Scanner scanner = new Scanner(System.in);//importing a scanner so that it could be used later for user input
        System.out.println("Choose rock, paper, or scissors. 'r' for rock, 'p' for paper and 's' for scissor");//printing out the line in bracket
        int cchoice = (int) (Math.random() * 3);// Computer would randomly generate three numbers
        if (cchoice == 0) {  //assigning names for each of these possible numbers so that afterwards it prints out names insdead of numbers.
            cname += "Rock";
        }
        if (cchoice == 1) {
            cname += "Paper";
        }
        if (cchoice == 2) {
            cname += "Scissor";
        }
        char player = scanner.next().charAt(0);//User input, I had to go online for this, trying to make this work was a bit of a struggle
        if (player == 'r' || player == 'p' || player == 's') {//grouping for valid input
            if (player == 'r') {// according to player's choice, giving player's choice a value, and also assigning the whole name to the"name" variable
                pchoice += 0;
                pname += "Rock";
            }
            if (player == 'p') {
                pchoice += 1;
                pname += "Paper";
            }
            if (player == 's') {
                pchoice += 2;
                pname += "Scissor";
            }
            if (pchoice > cchoice) { // Comparing user & computer's choices
                if (pchoice == 2 && cchoice == 0) {// the player would win except for when the player chose scissor & computer chose rock
                    System.out.println("You Lose!");
                } else {
                    System.out.println("You Win!");
                }
            } else if (pchoice < cchoice) {// the player would lose except for when the player chose rock & computer chose scissor
                if (cchoice == 2 && pchoice == 0) {
                    System.out.println("You Win!");
                } else {
                    System.out.println("You Lost!");
                }
            } else if (cchoice == pchoice) {
                System.out.println("Draw!");
            }
            System.out.println("The computer chose:  " + cname + "      The player chose:  " + pname);
        } else {// grouping for every other possible input, which are invalid
            System.out.println("Invalid solution please try again");
        }//I think this is a bit too long, and maybe some parts of it could be shortened, but I could not figure out how.

    }

}

