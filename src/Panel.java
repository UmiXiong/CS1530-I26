import java.util.ArrayList;
import java.util.List;

public class Panel implements Component {
  private final String name;
  private final List<Component> children = new ArrayList<>();

  public Panel(String name) {
    this.name = name;
  }

  @Override
  public void draw(String indent) {
    System.out.println(indent + "[Panel] " + name + " {");
    String childIndent = indent + "  ";
    for (Component c : children) {
      c.draw(childIndent);
    }
    System.out.println(indent + "}");
  }

  @Override
  public void add(Component component) {
    children.add(component);
  }

  @Override
  public void remove(Component component) {
    children.remove(component);
  }

  // optional helper to access children (not required for the assignment)
  public List<Component> getChildren() {
    return new ArrayList<>(children);
  }
}