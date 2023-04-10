package StructuralPattern.Composite;

public class Main {
    public static void main(String[] args) {
        Component square = new Square();
        Picture composite = new Picture();
        Component triangle = new Triangle();

        composite.add(square);
        composite.add(triangle);

        composite.draw();
    }
}
