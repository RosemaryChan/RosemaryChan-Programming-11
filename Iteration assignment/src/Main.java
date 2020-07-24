import java.util.Scanner;

public class    Main
{
    public static void main(String args[]) {
        int x = 1;
        int pchoice = 0;//the value assigned to the player's choice according
        int cscore = 0; //the score for how many times the computer wins (not in the loop so that it wouldn't be reset every time)
        int pscore = 0;//the score for how many times the computer wins(^)
        Scanner scanner = new Scanner(System.in);//importing a scanner so that it could be used later for user input
        System.out.println("Choose rock, paper, or scissors. 'r' for rock, 'p' for paper and 's' for scissor \ntype'E' to exit the game");
        while(x > 0) //Since x=1, the loop would repeat forever untill
        {
            String pname = "";// name is used for assigning the whole name for the player's choice
            String cname = "";// Giving a name to the random numbers generated
            System.out.println("Losses:" + cscore + "  Wins:" + pscore + "\nPlayer Choice:");
            int cchoice = (int) (Math.random() * 3);// Computer would randomly generate three numbers
            if (cchoice == 0)//assigning names for each of these possible numbers so that afterwards it prints out names insdead of numbers.
            {
                cname += "Rock"; //Assigning the name 'Rock' if the computer generates 0
            }
            if (cchoice == 1)
            {
                cname += "Paper";//Assigning the name 'Paper' if the computer generates 1
            }
            if (cchoice == 2)
            {
                cname += "Scissor";//Assigning the name 'Scissor' if the computer generates 1
            }
            char player = scanner.next().charAt(0);//User input, I had to go online for this, trying to make this work was a bit of a struggle
            if(player =='E')
            {
                break;//The loop would end if the player enters"E"
            }
            if (player == 'r' || player == 'p' || player == 's')//grouping for valid input
            {
                if (player == 'r')//according to player's choice, giving player's choice a value, and also assigning the whole name to the"pname" variable
                {
                    pchoice += 0;
                    pname += "Rock"; //Assigning the name 'Rock' if the player chose 'r'
                }
                if (player == 'p')
                {
                    pchoice += 1;
                    pname += "Paper";//Assigning the name 'Paper' if the player chose 'p'
                }
                if (player == 's')
                {
                    pchoice += 2;
                    pname += "Scissor";//Assigning the name 'Scissor' if the player chose 's'
                }
                if (pchoice > cchoice)  // Comparing user & computer's choices
                {
                    if (pchoice == 2 && cchoice == 0) // the player would win except for whenthe player chose scissor & computer chose rock
                    {
                        System.out.println("You Lose!");
                        cscore += 1;//Plus one for computer score
                    } else {
                        System.out.println("You Win!");
                        pscore +=1;//Plus one for Player score
                    }
                } else if (pchoice < cchoice)// the player would lose except for whenthe player chose rock & computer chose scissor
                {
                    if (cchoice == 2 && pchoice == 0)
                    {
                        System.out.println("You Win!");
                        pscore += 1;//Plus one for Player score
                    } else {
                        System.out.println("You Lose!");
                        cscore += 1;//Plus one for computer score
                    }
                } else if (cchoice == pchoice)//If player & computer chose that same thing, outputs "draw"
                {
                    System.out.println("Draw!");
                }
                System.out.println("Computer Choice: " + cname + "      Player Choice: " + pname);
            }
            else // grouping for every other possible inputs, which are invalid
            {
                System.out.println("Invalid solution please try again");
            }
            System.out.println("******************************************");
            //I think this is a bit too long, and maybe some parts of it could be shortened, but I couldn't figure out how.
        }


    }

}