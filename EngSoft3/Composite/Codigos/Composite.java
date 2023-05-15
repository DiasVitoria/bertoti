import java.util.List;

public class Composite {

    private List<Component> children;

    public void addChildren(Component c){
        children.add(c);
    }

    public void execute(){
        observers.stream().forEach((k) -> {
            k.execute();
        });
    }
}