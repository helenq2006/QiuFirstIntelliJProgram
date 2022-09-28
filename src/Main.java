import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How are you?");
        String mood = scan.nextLine();
        System.out.println("You're " + mood + " ? That's fine I guess...");

    }
}
