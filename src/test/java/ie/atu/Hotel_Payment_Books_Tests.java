package ie.atu;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Hotel_Payment_Books_Tests
{
    Hotel_Payment_Books myHotel_Payment_Books;
    @BeforeEach
    void setUp()
    {
        myHotel_Payment_Books = new Hotel_Payment_Books(30,100,30,"JAVA");
    }
    @Test
    void TestLength_of_Stay()
    {
        myHotel_Payment_Books.setLength_of_Stay(30);
        assertEquals(30, myHotel_Payment_Books.getLength_of_Stay());
    }
    @Test
    void testLength_of_StayFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myHotel_Payment_Books.setLength_of_Stay(0);});
        assertEquals("You can only stay at the hotel 30 days at a time", exMessage.getMessage());
    }
    @Test
    void TestRoom_Rate()
    {
        myHotel_Payment_Books.setRoom_Rate(100);
        assertEquals(100, myHotel_Payment_Books.getRoom_Rate());
    }
    @Test
    void testRoom_RateFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myHotel_Payment_Books.setRoom_Rate(0);});
        assertEquals("The standard rate of a room is 100", exMessage.getMessage());
    }
    @Test
    void TestTax_Rate()
    {
        myHotel_Payment_Books.setTax_Rate(30);
        assertEquals(30, myHotel_Payment_Books.getTax_Rate());
    }
    @Test
    void testTax_RateFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myHotel_Payment_Books.setTax_Rate(0);});
        assertEquals("The Tax goes up depending on the number of days you stay", exMessage.getMessage());
    }
    @Test
    void TestDiscount_Code()
    {
        myHotel_Payment_Books.setDiscount_Code("JAVA");
        assertEquals("JAVA", myHotel_Payment_Books.getDiscount_Code());
    }
    @Test
    void testDiscount_CodeFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myHotel_Payment_Books.setDiscount_Code("12345");});
        assertEquals("Invalid Discount code try again", exMessage.getMessage());
    }
    @AfterEach
    void tearDown()
    {

    }
}
