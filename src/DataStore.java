/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
import java.util.ArrayList;
public class DataStore {
        public static ArrayList<Car> cars = new ArrayList<>();
    public static ArrayList<Booking> bookings = new ArrayList<>();

    static {
        cars.add(new Car("1", "Toyota Corolla", true));
        cars.add(new Car("2", "Honda Civic", false));
        cars.add(new Car("3", "Suzuki Alto", true));
    }
    
}
