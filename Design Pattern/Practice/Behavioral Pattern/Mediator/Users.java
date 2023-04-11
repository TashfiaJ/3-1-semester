package BehaviouralPattern.Mediator;

public class Users extends User{
     public Users(IMediator mediator, String id, String username)
     {
         super(mediator, id, username);
     }

    @Override
    public void send(String message, User user) {
        System.out.print(getUsername()+" has  send this message: ");
         getMediator().notifying(message, user);

    }
    public void receive(String message) {
        System.out.println(getUsername()+" has received the message: " + message);
    }
}
