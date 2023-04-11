import java.util.ArrayList;
import java.util.List;

public class Subject {
    String title;
    List<Observer> observerList = new ArrayList<>();
    public void register(Observer observer){
        observerList.add(observer);
    }

    public void unregister(Observer observer){
        observerList.remove(observer);
    }
    public void notifyObserver(){
        for(Observer observer1: observerList){
            observer1.update();
        }
    }

    public void upload(String title){
        this.title=title;
        System.out.println(title +" : Video has been uploaded");
    }
}
