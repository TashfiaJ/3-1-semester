import java.io.File;

public class ConcreteSubject extends Subject {
    private File file;

    public ConcreteSubject(File file) {
        this.file = file;
    }

    public void watchFile() {
        while (true) {
            if (file.exists()) {
                notifyObservers();
            }
            try {
                Thread.sleep(1000); // wait for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public File getFile() {
        return file;
    }
}
