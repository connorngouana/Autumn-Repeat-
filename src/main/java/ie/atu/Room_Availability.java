package ie.atu;
import java.util.Random;
import java.util.Scanner;

public class Room_Availability
{
    public static void main(String[] args)
    {
        Random room = new Random();
        Scanner scanner = new Scanner(System.in);

        int myroomInt1 = room.nextInt(1000);
        int myroomInt2 = room.nextInt(1000);

        System.out.println("Rooms Available: " + myroomInt1 + " and " +myroomInt2);
        System.out.println("Pick which room you would like to reside in: ");

        int pick_room = scanner.nextInt();

        if(pick_room == 1)
        {
            System.out.println("You Picked to stay in: " + myroomInt1);
        }
        else if (pick_room == 2)
        {
            System.out.println("You Picked to stay in: " + myroomInt2);
        }
        else
        {
            System.out.println("Not a valid Room is Booked pick one of the available rooms");
        }

        scanner.close();


    }

}


