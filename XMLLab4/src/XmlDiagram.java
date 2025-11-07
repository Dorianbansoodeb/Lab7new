// ===== File: XmlDiagram.java =====
public class XmlDiagram {
    private Element root;

    public XmlDiagram(Element root) { this.root = root; }

    public Element getRoot() { return root; }
    public void setRoot(Element root) { this.root = root; }

    public String toXml() {
        return root == null ? "" : root.toXml();
    }
}