package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankDetails_Test
{
    BankDetails myBankDetails;

    @BeforeEach
    void setUp()
    {
        myBankDetails = new  BankDetails("Connor","1234512345123451","08/24","963");
    }
    @Test
    void TestName()
    {
        myBankDetails.setName("Connor");
        assertEquals("Connor", myBankDetails.getName());
    }
    @Test
    void testNameFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {myBankDetails.setName("Co");});
        assertEquals("This is not a valid name, name must have minimum 3 characters", exMessage.getMessage());
    }
    @Test
    void TestCardNumber()
    {
        myBankDetails.setName("1234512345123451");
        assertEquals("1234512345123451", myBankDetails.getCardNumber());
    }
    @Test
    void testCardNumberFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myBankDetails.setCardNumber("12345");});
        assertEquals("Card Number mus be 16 digits", exMessage.getMessage());
    }
    @Test
    void TestExpiredNumber()
    {
        myBankDetails.setName("08/24");
        assertEquals("08/24", myBankDetails.getExpiredNumber());
    }
    @Test
    void testExpiredNumberFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myBankDetails.setExpiredNumber("12/2002");});
        assertEquals("Enter the correct expiration data ??/??", exMessage.getMessage());
    }
    @Test
    void TestCvvNumber()
    {
        myBankDetails.setName("963");
        assertEquals("963", myBankDetails.getCvv());
    }
    @Test
    void testCvvFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myBankDetails.setCvv("2002");});
        assertEquals("The CVV code entered was  invalid", exMessage.getMessage());
    }
    @AfterEach
    void tearDown()
    {

    }
}
