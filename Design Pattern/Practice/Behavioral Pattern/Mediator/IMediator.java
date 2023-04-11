package BehaviouralPattern.Mediator;

public interface IMediator {
    public void add(User user);

    public void notifying(String message, User user);
}
