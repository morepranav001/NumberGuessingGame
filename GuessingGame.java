import java.util.Random;
import java.util.Scanner;
public class GuessingGame
{
public static void main(String argsp[])
{
Random rand  = new Random();
int numbertoGuess = rand.nextInt(100);
int numberOfTries = 0;
Scanner input = new Scanner(System.in);
int guess;
boolean win = false;
while (win==false)
{
System.out.println("Guess a number between 1 to 100");
guess = input.nextInt();
numberOfTries++;
if(guess == numbertoGuess)
{
win= true;
}
else if (guess<numbertoGuess)
{
System.out.println("Your guess number is too low");
}
else if (guess>numbertoGuess)
{
System.out.println("Your guess number is too high");
}
}
System.out.println("You win!");
System.out.println("The number was :"+numbertoGuess);
System.out.println("It took you "+numberOfTries+"tries");
}
}