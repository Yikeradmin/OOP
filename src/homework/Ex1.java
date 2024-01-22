package homework;

import homework.entry.Vehicle;

/**
 * @author: CoolPro
 * @Desc:
 * @create: 2024-01-22 16:41
 **/

public class Ex1 {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle();
        car1.setSize(10);
        car1.setSpeed(10);

        Vehicle car2 = new Vehicle(100,5);

        car1.move();
        car2.move();
    }
}
