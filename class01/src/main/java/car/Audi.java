package car;

/**
 * @author ZEXIN HUANG
 * @version 1.0
 * @date 2020-05-05 12:14
 */

public class Audi  implements  Car{


    public void start() {
       System.out.println("audi.start");
    }

    public void turnLeft() {
        System.out.println("audi.turnLeft");

    }

    public void turnright() {
        System.out.println("audi.turnRight");

    }

    public void stop() {
        System.out.println("audi.stop");

    }
}
