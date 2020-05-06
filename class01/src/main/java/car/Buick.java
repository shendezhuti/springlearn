package car;

/**
 * @author ZEXIN HUANG
 * @version 1.0
 * @date 2020-05-05 12:24
 */
public class Buick implements  Car{
    public void start() {
        System.out.println("buick.start");
    }

    public void turnLeft() {
        System.out.println("buick.turnLeft");
    }

    public void turnright() {
        System.out.println("buick.turnRight");
    }

    public void stop() {
        System.out.println("buick.stop");
    }
}
