package ex10;

public class WindowHandler {
    protected WindowHandler next;

    public WindowHandler() {
    }

    public void setNext(WindowHandler next){
        this.next = next;
    }

    public void handle(){
        System.out.println("basic window");

        if(this.next != null) {
            this.next.handle();
        }
    };
}
