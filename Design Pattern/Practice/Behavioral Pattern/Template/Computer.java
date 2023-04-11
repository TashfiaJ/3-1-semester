public abstract class Computer {

    public final void makeComputer(){
        collectComponents();
        assembleComponents();
        installOs();
        startComputer();
        System.out.println("Computer is on.");
    }

    public void collectComponents(){
        System.out.println("Ram, CPU and fan is collected.");
    }

    public void startComputer(){
        System.out.println("Computer is booting.");
    }

    public abstract void assembleComponents();
    public abstract void installOs();


}
