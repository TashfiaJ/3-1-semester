import java.util.Scanner;

public class Main {

    public static Application configureApplication() {
        Application application;
        Creator creator;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Level(1/2):");
        String input = sc.nextLine();
        if (input.equals("Level 1")) {
            creator = new Level1Creator();
        } else if(input.equals("Level 2")) {
            creator = new Level2Creator();
        }
        else{
           return null;
        }
        application = new Application(creator);
        return application;
    }

    public static void main(String[] args) {

            Application app = configureApplication();
           if(app!=null) {
               app.playGame();
           }
           else{
               System.out.println("No such level available.");
           }

    }
}
