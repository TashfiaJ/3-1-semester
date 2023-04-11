public class Laptop extends Computer{
    @Override
    public void assembleComponents() {
        System.out.println("Adding all collected components with SSD.");
    }

    @Override
    public void installOs() {
        System.out.println("Installing windows.");
    }
}
