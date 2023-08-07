package ie.atu;

public class BankDetails
{
    public String Name;
    public String CardNumber;
    public String ExpiredNumber;
    public String Cvv;

    public  BankDetails (String name, String cardNumber, String expiredNumber, String cvv)
    {
        this.Name = name;
        this.CardNumber = cardNumber;
        this.ExpiredNumber = expiredNumber;
        this.Cvv = cvv;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        if(name.length() >= 3)
        {
            Name = name;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid name, name must have minimum 3 characters");
        }
    }

    public String getCardNumber()
    {
        return CardNumber;
    }

    public void setCardNumber(String cardNumber)
    {
        if(cardNumber.length() == 16)
        {
            CardNumber = cardNumber;
        }
        else
        {
            throw new IllegalArgumentException("Card Number mus be 16 digits");
        }
    }

    public String getExpiredNumber()
    {
        return ExpiredNumber;
    }

    public void setExpiredNumber(String expiredNumber)
    {
        if(expiredNumber.length() <=5)
        {
            ExpiredNumber = expiredNumber;
        }
        else
        {
            throw new IllegalArgumentException("Enter the correct expiration data ??/??");
        }
    }

    public String getCvv()
    {
        return Cvv;
    }

    public void setCvv(String cvv)
    {
        if(cvv.length() == 3)
        {
            Cvv = cvv;
        }
        else
        {
            throw new IllegalArgumentException("The CVV code entered was  invalid");
        }
    }
}
