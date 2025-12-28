/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookingTest {

    @Test
    public void testGetCustomerName() {
        Booking booking = new Booking("Ali", "Civic");
        assertEquals("Ali", booking.getCustomerName());
    }

    @Test
    public void testGetCarName() {
        Booking booking = new Booking("Ali", "Civic");
        assertEquals("Civic", booking.getCarName());
    }
}
