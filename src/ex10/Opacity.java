package ex10;

public class Opacity extends WindowHandler {
    @Override
    public void handle() {
        System.out.println("do opacity");

        if(this.next != null) {
            this.next.handle();
        }
    }
}
