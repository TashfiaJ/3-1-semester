public class Government {
    private static Government instance;

    private Government() {};

    public static synchronized Government getInstance() {
        if(instance==null)
        instance = new Government();
        return instance;
    }
}   
