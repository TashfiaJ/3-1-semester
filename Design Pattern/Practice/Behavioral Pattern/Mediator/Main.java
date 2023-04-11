package BehaviouralPattern.Mediator;

public class Main {

    public static void main(String[] args) {
        IMediator mediator = new ConcreteMediator();

        User user1 = new Users(mediator, "1", "Tashfia");
        User user2 = new Users(mediator, "2", "Tamanna");
        User user3 = new Users(mediator, "3", "Hridi");
        User user4 = new Users(mediator, "4", "Nujhat");

        mediator.add(user1);
        mediator.add(user2);
        mediator.add(user3);
        mediator.add(user4);

        user1.send("Hello!", user2);
        user3.send("ki obostha?", user1);
    }



}
