package ie.atu;
import java.util.Scanner;


public class Booking_a_Room
{
    public static void main(String[] args) {

        System.out.println("Welcome to Connor's Sanctuary");

        Scanner room = new Scanner(System.in);
        System.out.println("Head over to Room availability to find a room");
        System.out.println("What room have you been given?");
        int room_given = room.nextInt();
        System.out.println("Good choice here are the keys to room " + room_given);


        System.out.println("How long will you be staying here: ");
        Scanner length_of_stay = new Scanner(System.in);
        int length_of_stay_room = length_of_stay.nextInt();
        while (true) {

            if (length_of_stay_room > 0 && length_of_stay_room <= 30) {
                System.out.println("OH Nice! you will be staying for " + length_of_stay_room + " days");

            } else {
                System.out.println("You can only stay at the hotel 30 days at a time!");
            }
            break;
        }


        System.out.println("We will calculate your total amount for your stay plus tax!");

        double room_rate = 100;
        double tax_rate = 0.05;
        double room_tax = 0;
        int night_staying;
        double total = 0;
        double room_idk = 0;
        for (night_staying = 1; night_staying <= length_of_stay_room; night_staying++) {
            room_tax = room_rate * (tax_rate * night_staying);

            room_idk = (room_tax + room_rate) * night_staying;
            System.out.println("Your total for " + night_staying + " nights plus tax is " + room_idk);
        }
        total =  room_idk ;
        System.out.println("Your total is " + total);


        System.out.println("Do you have a discount code?");
        Scanner Discount = new Scanner(System.in);
        String discount = Discount.nextLine();
        if (discount.length() == 4)
        {
            int dis = 20;
            double discalc = 100 - dis;
            double discount_price = (discalc*total)/100;
            System.out.println("You have entered the discount code " + discount + " Your discounted total is " + discount_price);
        } else {
            System.out.println("Invalid discount code");
            System.out.println("Your Total will remain at " + total);
        }
        Discount.close();


    }
}