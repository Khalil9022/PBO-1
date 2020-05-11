
import java.util.Scanner;

public class coba
{
    public static void main(String[] args)
    {
        System.out.println("Enter your name:");
        Scanner scan = new Scanner(System.in);
        String name = "";
        name += scan.nextLine();
        
        System.out.println("Enter password : ");
        int password = scan.nextInt();
        // Can also be done like
        // String name=scan.next();
        // name+=scan.nextLine();

        // They Both Work as same

        System.out.println("Your name is :" + name);
    }
}
