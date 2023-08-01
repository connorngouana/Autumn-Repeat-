package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class Hotel_User_Info_Test
{
    Hotel_User_Info myHotel_User_Info;
    @BeforeEach
    void setUp()
    {
        myHotel_User_Info = new Hotel_User_Info("Mr","Connor","0873493493", "G00381988",21);

    }
    @Test
    void TestTitle()
    {
        myHotel_User_Info.setTitle("mr");
        assertEquals("mr", myHotel_User_Info.getTitle());
    }
    @Test
    void testTitleFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myHotel_User_Info.setTitle("mister");});
        assertEquals("This is not a valid title, title must be mr, ms and mrs", exMessage.getMessage());
    }
    @Test
    void TestName()
    {
        myHotel_User_Info.setName("Connor");
        assertEquals("Connor", myHotel_User_Info.getName());
    }
    @Test
    void testNameFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myHotel_User_Info.setName("co");});
        assertEquals("This is not a valid name, name must have minimum 3 characters", exMessage.getMessage());
    }
    @Test
    void TestAge()
    {
        myHotel_User_Info.setAge(21);
        assertEquals(21, myHotel_User_Info.getAge());
    }

    @Test
    void testAgeFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myHotel_User_Info.setAge(15);});
        assertEquals("This is not a valid age, you must be 16 plus", exMessage.getMessage());
    }
    @Test
    void TestPhone()
    {
        myHotel_User_Info.setPhone("0873493493");
        assertEquals("0873493493", myHotel_User_Info.getPhone());
    }
    @Test
    void testPhoneFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myHotel_User_Info.setPhone("087");});
        assertEquals("This is not a valid number, number must have 7 digits", exMessage.getMessage());
    }
    @Test
    void TestId()
    {
        myHotel_User_Info.setId("G003819888");
        assertEquals("G003819888", myHotel_User_Info.getId());
    }
    @Test
    void testIdFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {myHotel_User_Info.setId("G00386");});
        assertEquals("This is not a valid Id, Id must have minimum 10 digits", exMessage.getMessage());
    }

    @AfterEach
    void tearDown()
    {

    }
}
