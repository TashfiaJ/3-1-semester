import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("file.txt");
        ConcreteSubject subject = new ConcreteSubject(file);
        ConcreteObserver observer1 = new ConcreteObserver("Observer 1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2");
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        Thread thread = new Thread(() -> {
            subject.watchFile();
        });
        thread.start();

        // simulate file changes
        Thread thread2 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(5000); // wait for 5 seconds
                    file.createNewFile();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        thread2.start();
    }
}
