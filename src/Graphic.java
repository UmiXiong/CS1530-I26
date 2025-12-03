public class Graphic {

//  this module used to show the interface in terminal
  public static void main(String[] args) {
    Panel root = new Panel("RootPanel");
    root.add(new Label("My Application"));

    Panel topBar = new Panel("TopBar");
    topBar.add(new Button("Login"));
    topBar.add(new Button("Signup"));
    root.add(topBar);

    Panel content = new Panel("Content");
    content.add(new Label("Welcome to the app!"));

    Panel form = new Panel("Form");
    form.add(new Label("Username"));
    form.add(new Button("Submit"));

    content.add(form);
    root.add(content);

    // Draw the whole structure to console
    root.draw();
  }
}