public class Main {
    public static void main(String[] args) {

        ConcreteObserver observer1 = new ConcreteObserver("Labu");
        ConcreteObserver observer2 = new ConcreteObserver("babu");
        ConcreteObserver observer3 = new ConcreteObserver("tabu");
        ConcreteObserver observer4 = new ConcreteObserver("kabu");

        Subject subject1 = new Subject();

        subject1.register(observer1);
        subject1.register(observer2);
        subject1.register(observer3);
        subject1.register(observer4);

        observer1.subscribe(subject1);
        observer2.subscribe(subject1);
        observer3.subscribe(subject1);
        observer4.subscribe(subject1);

        subject1.upload("How to run?");
        subject1.notifyObserver();

        subject1.unregister(observer2);
        subject1.upload("How to jump?");
        subject1.notifyObserver();



    }
}
