import java.io.File;
import java.util.Date;

public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    public void update(Subject subject) {
        File file = ((ConcreteSubject) subject).getFile();
        Date lastModified = new Date(file.lastModified());
        System.out.println(name + ": " + file.getName() + " was modified on " + lastModified);
    }
}

