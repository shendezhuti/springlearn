package human;

import car.Car;

/**
 * @author ZEXIN HUANG
 * @version 1.0
 * @date 2020-05-05 15:16
 */
public abstract  class HumenWithCar implements Humen {
    protected Car car;

    public HumenWithCar(Car car){
        this.car=car;
    }

    public abstract  void goHome();
}
