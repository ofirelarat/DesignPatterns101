package ex03;

public class CarProxy implements ICarProxyFuncs {
    private CarController controller;

    public CarProxy(Car car) {
        this.controller = new CarController(car);
    }


    @Override
    public void showFuel() {
        this.controller.showFuel();
    }

    @Override
    public void showLoc() {
        this.controller.showLoc();
    }
}
