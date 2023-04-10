package StructuralPattern.Composite;

import java.util.ArrayList;

public class Picture implements Component{
    private ArrayList<Component> list = new ArrayList<>();
    @Override
    public void draw() {
        for (Component g : list){
            g.draw();
        }
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public Component getChild(int x) {
        return list.get(x);
    }
}
