package ex03;

public class CarController extends Car{
    private Car car;

    public CarController(Car car) {
        this.car = car;
    }

    @Override
    public void startDrive() {
        this.car.startDrive();
    }

    @Override
    public void endDrive() {
        this.car.endDrive();
    }

    @Override
    public void increaseSpeed() {
        this.car.increaseSpeed();
    }

    @Override
    public void decreaseSpeed() {
        this.car.decreaseSpeed();
    }

    @Override
    public void turnLeft() {
        this.car.turnLeft();
    }

    @Override
    public void turnRight() {
        this.car.turnRight();
    }

    @Override
    public void showFuel() {
        this.car.showFuel();
    }

    @Override
    public void showLoc() {
        this.car.showLoc();
    }
}
