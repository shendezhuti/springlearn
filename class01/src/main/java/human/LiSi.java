package human;


import car.Car;

/**
 * @author ZEXIN HUANG
 * @version 1.0
 * @date 2020-05-05 15:18
 */
public class LiSi extends  HumenWithCar{

    public LiSi(Car car) {
        super(car);
    }

    public void goHome() {
        car.start();
        car.stop();
    }
}
