import java.util.Random;
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args)
    {
        int count = 1, z=0;
    Random a = new Random();
    int n = a.nextInt(100);
    Scanner x = new Scanner(System.in);
        for(int m=0; m<10; m++)
        {
        System.out.println("Enter Your Guess");
        int b = x.nextInt();
        if(b<=100)
        {
        if(b==n)
        {
        System.out.println("Correct");
        z++;
        break;
        }
        else if(b>n)
        System.out.println("Too high");
        else 
        System.out.println("Too low");
        }
        else
        System.out.println("Out of Bounds");
        count++;
        }
        x.close();
        if(z>0)
        System.out.println("The changes taken to correctly guess the number was" +count+"/10");
        else
        System.out.println("The number couldn't be guessed correctly");
    }
}
