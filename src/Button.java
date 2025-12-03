public class Button implements Component {
  private final String text;

  public Button(String text) {
    this.text = text;
  }

  @Override
  public void draw(String indent) {
    System.out.println(indent + "[Button] \"" + text + "\"");
  }
}