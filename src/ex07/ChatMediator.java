package ex07;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator{
    List<Colleague> colleagueList = new ArrayList<>();

    @Override
    public void addColleague(Colleague c) {
        colleagueList.add(c);
    }

    @Override
    public void sendMessage(String sender, String receiver, String messsage) {
        for (Colleague c: colleagueList) {
            if(c.getUserName().equals(receiver)){
                c.receivedMessage(sender, messsage);
            }
        }
    }

    @Override
    public void sendBroadcastMessage(String sender, String messsage) {
        for (Colleague c: colleagueList) {
            if(!c.getUserName().equals(sender))
                c.receivedMessage(sender, messsage);
        }
    }
}
