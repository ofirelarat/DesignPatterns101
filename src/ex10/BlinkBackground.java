package ex10;

public class BlinkBackground extends WindowHandler {
    @Override
    public void handle() {
        System.out.println("Do blinking background");

        if(this.next != null) {
            this.next.handle();
        }
    }
}
