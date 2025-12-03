public interface Component {
  // draw with indentation so the tree structure is visible on console
  void draw(String indent);

  // convenience default method to start drawing from root
  default void draw() {
    draw("");
  }

  // optional composite operations: leaves can inherit UnsupportedOperationException
  default void add(Component component) {
    throw new UnsupportedOperationException("add not supported");
  }

  default void remove(Component component) {
    throw new UnsupportedOperationException("remove not supported");
  }
}