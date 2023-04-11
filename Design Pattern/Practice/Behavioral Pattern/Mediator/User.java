package BehaviouralPattern.Mediator;

import java.util.PrimitiveIterator;

public abstract class User {

    private IMediator mediator;
    private String id, username;
    public User(IMediator mediator, String id, String username)
    {
        this.mediator=mediator;
        this.id=id;
        this.username=username;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public IMediator getMediator() {
        return mediator;
    }

    public abstract void send(String message, User user);
    public abstract void receive(String message);
}
