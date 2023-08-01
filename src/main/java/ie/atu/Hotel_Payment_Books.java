package ie.atu;

public class Hotel_Payment_Books
{
    public int Length_of_Stay;
    public int Room_Rate;
    public int Tax_Rate;
    public int Discount_Rate;

    public Hotel_Payment_Books(int length_of_Stay, int room_Rate, int tax_Rate, int discount_Rate)
    {
        this.Length_of_Stay = length_of_Stay;
        this.Room_Rate = room_Rate;
        this.Tax_Rate = tax_Rate;
        this.Discount_Rate = discount_Rate;
    }
}
