package ex10;

public class ColorsBorder extends WindowHandler {
    @Override
    public void handle() {
        System.out.println("Colored borders");

        if(this.next != null) {
            this.next.handle();
        }
    }
}
