public interface XmlNode {
    String toXml(int indent);
    default String toXml() { return toXml(0); }
}