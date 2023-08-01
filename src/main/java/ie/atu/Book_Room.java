package ie.atu;
import java.util.Random;
import java.util.Scanner;
public class Book_Room
{
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int myRandomInt1 = random.nextInt(1000);
        int myRandomInt2 = random.nextInt(1000);

        System.out.println("Rooms Available: " + myRandomInt1 + " and " +myRandomInt2);


        int choice = scanner.nextInt();
        System.out.println("Pick which room you would like to reside in");
        if(choice == 1)
        {
            System.out.println("You Picked to stay in: " + myRandomInt1);
        }
        else if (choice == 2)
        {
            System.out.println("You Picked to stay in: " + myRandomInt2);
        }
        else
        {
            System.out.println("Not a valid Room is Booked pick one of the available rooms");
        }

        scanner.close();


    }

}


