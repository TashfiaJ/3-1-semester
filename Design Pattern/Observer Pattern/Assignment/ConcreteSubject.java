import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class ConcreteSubject extends Subject {
    private Path file;

    public ConcreteSubject(Path file) {
        this.file = file;
    }

    public void watchFile() throws IOException, InterruptedException {

        WatchService watchService
                = FileSystems.getDefault().newWatchService();

        Path path = Paths.get(file.toUri());

        path.register(
                watchService,
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_DELETE,
                StandardWatchEventKinds.ENTRY_MODIFY);

        WatchKey key;
        while ((key = watchService.take()) != null) {
            for (WatchEvent<?> event : key.pollEvents()) {
                String message="Event kind:" + event.kind()
                        + ". File affected: " + event.context() + ".";
                notifyObservers(message);
            }
            key.reset();
        }

    }
}
