package ex07;

public class Colleague {
    private Mediator mediator;

    protected String userName;

    public Colleague(Mediator mediator, String userName) {
        this.mediator = mediator;
        this.userName = userName;
        this.mediator.addColleague(this);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void sendBroadcast(String s){
        System.out.println(this.userName + ", send message to all");
        this.mediator.sendBroadcastMessage(this.userName, s);
    }

    public void sendToUser(String user, String s){
        System.out.println(this.userName + ", you send message to user");
        this.mediator.sendMessage(this.userName, user, s);
    }

    public void receivedMessage(String fromUser, String s){
        System.out.println(this.userName + ", you got message from: " + fromUser + ", the message is: " + s);
    }
}
