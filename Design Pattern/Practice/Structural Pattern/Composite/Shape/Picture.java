package StructuralPattern.Composite;

import java.util.ArrayList;

public class Picture implements Component{
    private ArrayList<Component> list = new ArrayList<Component>();
    @Override
    public void draw() {
        for (Component g : list){
            g.draw();
        }
    }

    public void add(Component component) {
        list.add(component);
    }
    public void remove(Component component) {
        list.remove(component);
    }

    public Component getChild(int x) {
        return list.get(x);
    }
}
