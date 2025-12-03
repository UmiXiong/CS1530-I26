public class Label implements Component {
  private final String text;

  public Label(String text) {
    this.text = text;
  }

  @Override
  public void draw(String indent) {
    System.out.println(indent + "[Label] \"" + text + "\"");
  }
}