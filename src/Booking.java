/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class Booking {
    private final String CustomerName;
    private final String CarName;

    // Constructor
    public Booking(String customerName, String carName) {
        this.CustomerName = customerName;
        this.CarName = carName;
    }

    // Getter for customer name
    public String getCustomerName() {
        return CustomerName;
    }

    // Getter for car name
    public String getCarName() {
        return CarName;
    }
}

