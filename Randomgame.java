import java.util.Random;
import java.util.Scanner;
public class Randomguess{
    public static void main(String args[]){
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int max =7;
        int a;
        do
        {
            int Secretno = r.nextInt(100);
            System.out.println("Guess a number between 1 to 100");
            for( a=0;a< max; a++)
            {
                int guess =s.nextInt();
                if( guess == Secretno){
                    System.out.println("Congratulation, You guessed the correct number");
                }
                else if( guess > Secretno){
                    System.out.println("your guess is too High, Try again");
                }
                else{
                    System.out.println("Your guess is too low ,Try again");
                }    
            }
             if(a>max){
                    System.out.println("Sorry, You have reached the maximum number of attempts");
                    System.out.println("the Secret number was:"+Secretno);
                }    
            System.out.println("Do you want to play again:? (Y/N)");
            s.nextLine();
            char again=s.nextLine().charAt(0);
            if( again!='Y' && again!='y'){
                break;
            }
        }while (true);
        System.out.println("Game over. Thanks for playing!");
        s.close();
    }
}
