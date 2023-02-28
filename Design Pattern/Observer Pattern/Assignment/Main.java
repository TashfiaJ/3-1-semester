import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.*;
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Path path = Paths.get("src/File");
        ConcreteSubject subject = new ConcreteSubject(path);
        ConcreteObserver observer1 = new ConcreteObserver("Observer 1");
        subject.registerObserver(observer1);
        subject.watchFile();

    }
}
