package ex07;

public interface Mediator {
    void addColleague(Colleague c);
    void sendMessage(String sender, String receiver,String messsage);
    void sendBroadcastMessage(String sender, String messsage);
}
