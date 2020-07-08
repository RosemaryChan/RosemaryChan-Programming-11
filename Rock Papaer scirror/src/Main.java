import java.util.Scanner;

public class    Main
{
    public static void main(String args[]) {
        int pchoice = 0;//the value assigned to the player's choice according
        String pname = "";// name is used for assigning the whole name for the player's choice
        String cname = "";// Giving a name to the random numbers generated
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose rock, paper, or scissors. 'r' for rock, 'p' for paper and 's' for scissor");
        int cchoice = (int) (Math.random() * 3);// Computer would radomly generat three numbers
        if (cchoice == 0) {  //assigning names for each of these possible numbers so that afterwards it prints out names insdead of numbers.
            cname += "rock";
        }
        if (cchoice == 1) {
            cname += "paper";
        }
        if (cchoice == 2) {
            cname += "scissor";
        }
        char player = scanner.next().charAt(0);//User input, I had to go online for this, trying to make this work was a bit of a struggle
        if (player == 'r' || player == 'p' || player == 's') {//grouping for valid input
            if (player == 'r') {// according to player's choice, giving i a value, and also assigning to thole name to the"name" variable
                pchoice += 0;
                pname += "rock";
            }
            if (player == 'p') {
                pchoice += 1;
                pname += "paper";
            }
            if (player == 's') {
                pchoice += 2;
                pname += "scissor";
            }
            if (pchoice > cchoice) { // Comparing user & computer's choices
                if (pchoice == 2 && cchoice == 0) {// the player would win except for whenthe player chose scissor & computer chose rock
                    System.out.println("You lost");
                } else {
                    System.out.println("You won");
                }
            } else if (cchoice < pchoice) {// the player would lose except for whenthe player chose rock & computer chose scissor
                if (cchoice == 2 && pchoice == 0) {
                    System.out.println("You won");
                } else {
                    System.out.println("You lost");
                }
            } else if (cchoice == pchoice) {
                System.out.println("It's a tie");
            }
            System.out.println("The computer chose:  " + cname + "      The player chose:  " + pname);
        } else {// grouping for every other possible inputs, which are invalid
            System.out.println("Invalid solution please try again");
        }//I think this is a bit too long, and maybe some parts of it could be shortened, but I couldn't figure out how.

    }

}