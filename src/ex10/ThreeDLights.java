package ex10;

public class ThreeDLights extends WindowHandler {
    @Override
    public void handle() {
        System.out.println("3D lights");

        if(this.next != null) {
            this.next.handle();
        }
    }
}
