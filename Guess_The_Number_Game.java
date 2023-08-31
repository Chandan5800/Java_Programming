// Guess The number game....................................


import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int noOfGuesses = 0;
    public int inputNumber;
    public int getNoOfGuesses(){
        return noOfGuesses;
    }

    public void setNoOfGuesses(){
        this.noOfGuesses=noOfGuesses;
    }

     Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput(){
        System.out.println("Enter Your Number:");
        Scanner s = new Scanner(System.in);
        inputNumber = s.nextInt();

    }

    boolean isCorrectNumber(){
        noOfGuesses ++;
        if(inputNumber == number){
            System.out.println("Congratulation You Win This Match!!!🤩🤩");
            System.out.format("Your Guess is Right!!, The Number was%d\n You guessed it in %d Attempt",number,noOfGuesses);
        }
        if (inputNumber == number){
            return true;
        }
        else if(inputNumber < number){
            System.out.println("Too Less.....");
        } else if (inputNumber > number) {
            System.out.println("Too High....");
        }
        return false;
    }

}
public class Guess_The_Number_Game {
    public static void main(String[] args) {

        Game g = new Game();
        boolean b = false;
        while (b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);
        }
    }
}
