package BehaviouralPattern.Mediator;

import java.util.HashMap;
import java.util.Map;

public class ConcreteMediator implements IMediator{

    private Map<String, User> userlist = new HashMap<>();
    @Override
    public void add(User user) {
        this.userlist.put(user.getId(), user);
    }

    @Override
    public void notifying(String message, User user) {
        System.out.println(message + "to "+ user.getUsername());
        user.receive(message);
    }
}
