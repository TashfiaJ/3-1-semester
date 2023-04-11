public class Desktop extends Computer{
    @Override
    public void assembleComponents() {
        System.out.println("Adding all collected components with graphics card.");
    }

    @Override
    public void installOs() {
        System.out.println("Installing ubuntu.");
    }
}
