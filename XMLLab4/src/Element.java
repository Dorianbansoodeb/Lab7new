// ===== File: Element.java =====
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Element implements XmlNode {
    private final String name;
    private final List<XmlNode> children = new ArrayList<>();

    public Element(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Element name required");
        this.name = name;
    }

    public Element add(XmlNode child) {
        if (child != null) children.add(child);
        return this;
    }

    public String getName() { return name; }
    public List<XmlNode> getChildren() { return Collections.unmodifiableList(children); }

    @Override
    public String toXml(int indent) {
        String ind = "  ".repeat(Math.max(0, indent));

        // Self-closing element
        if (children.isEmpty()) {
            return ind + "<" + name + "/>\n";
        }

        // Single text child -> compact <tag>text</tag>
        if (children.size() == 1 && children.get(0) instanceof TextNode) {
            return ind + "<" + name + ">" + children.get(0).toXml(0) + "</" + name + ">\n";
        }

        // Nested children (pretty-printed)
        StringBuilder sb = new StringBuilder();
        sb.append(ind).append("<").append(name).append(">\n");
        for (XmlNode c : children) {
            sb.append((c instanceof Element) ? c.toXml(indent + 1)
                    : ind + "  " + c.toXml(0) + "\n");
        }
        sb.append(ind).append("</").append(name).append(">\n");
        return sb.toString();
    }
}