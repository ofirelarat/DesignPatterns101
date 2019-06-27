package ex08;

public abstract class GymTrain {

    public void totalGymRutin(){
        System.out.println("Start a train:");
        changeCloths();
        drinkWater();
        exercise();
        takeAShower();
    }

    private void changeCloths(){
        System.out.println("change cloths");
    }
    private void drinkWater(){
        System.out.println("drink water");
    }
    protected abstract void exercise();
    private void takeAShower(){
        System.out.println("take a shower");
    }
}
