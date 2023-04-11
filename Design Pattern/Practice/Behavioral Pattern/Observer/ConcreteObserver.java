import java.security.PublicKey;

public class ConcreteObserver implements Observer{
    String name;
    Subject subject;
    public ConcreteObserver( String name){
        super();
        this.name=name;
    }
    @Override
    public void update() {
        System.out.println(name+" Video has been uploaded - "+subject.title);
    }

    public void subscribe(Subject subject){
        this.subject=subject;
    }
}
