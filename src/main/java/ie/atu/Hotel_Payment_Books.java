package ie.atu;

public class Hotel_Payment_Books
{
    public int Length_of_Stay;
    public int Room_Rate;
    public double Tax_Rate;
    public String Discount_Code;

    public Hotel_Payment_Books(int length_of_Stay, int room_Rate, double tax_Rate, String discount_Code)
    {
        this.Length_of_Stay = length_of_Stay;
        this.Room_Rate = room_Rate;
        this.Tax_Rate = tax_Rate;
        this.Discount_Code = discount_Code;
    }

    public int getLength_of_Stay()
    {
        return Length_of_Stay;
    }

    public void setLength_of_Stay(int length_of_Stay)
    {
        if (length_of_Stay > 0 && length_of_Stay <= 30)
        {
            Length_of_Stay = length_of_Stay;
        }
        else
        {
            throw new IllegalArgumentException("You can only stay at the hotel 30 days at a time");
        }
    }
    public int getRoom_Rate()
    {
        return Room_Rate;
    }

    public void setRoom_Rate(int room_Rate)
    {
        if (room_Rate == 100)
        {
            this.Room_Rate = room_Rate;
        }
        else
        {
            throw new IllegalArgumentException("The standard rate of a room is 100");
        }
    }

    public double getTax_Rate()
    {
        return Tax_Rate;
    }

    public void setTax_Rate(int length_of_Stay)
    {
        if ( Tax_Rate == length_of_Stay  )
        {
            this.Tax_Rate = length_of_Stay;
        }
        else
        {
            throw new IllegalArgumentException("The Tax goes up depending on the number of days you stay");
        }
    }

    public String getDiscount_Code()
    {
        return Discount_Code;
    }

    public void setDiscount_Code(String discount_Code)
    {
        if (discount_Code.length() == 4)
        {
            Discount_Code = discount_Code;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Discount code try again");
        }
    }

}

