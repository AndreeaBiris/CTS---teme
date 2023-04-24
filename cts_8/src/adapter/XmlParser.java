package adapter;

public class XmlParser {

    private XmlParser xmlParser;
    public XmlParser(XmlParser xmlParser) {
        this.xmlParser = xmlParser;
    }
    public XmlParser() { }
    public void parseXml(String xml){
        System.out.println("\nXML parsat " + xml);
    }
}