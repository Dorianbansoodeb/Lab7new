final class TextNode implements XmlNode {
    private final String text;

    public TextNode(String text) {
        this.text = text == null ? "" : text;
    }

    @Override
    public String toXml(int indent) {
        return escape(text);
    }

    private static String escape(String s) {
        return s.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;");
    }
}