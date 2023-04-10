package StructuralPattern.Composite;

public class Main {
    public static void main(String[] args) {
        Component square = new Square();
        Picture component = new Picture();
        Component triangle = new Triangle();

        component.add(square);
        component.add(triangle);

        component.draw();
    }
}
