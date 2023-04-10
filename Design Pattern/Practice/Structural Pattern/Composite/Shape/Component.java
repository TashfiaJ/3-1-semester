package StructuralPattern.Composite;

public interface Component {
    void draw();
    //add
    void add(Component component);
    //remove
    void remove(Component component);
    Component getChild(int x);
}
