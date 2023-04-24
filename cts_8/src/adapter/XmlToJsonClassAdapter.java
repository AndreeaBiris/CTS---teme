package adapter;

public class XmlToJsonClassAdapter extends XmlParser implements JsonParser{

    public XmlToJsonClassAdapter(XmlParser xmlParser){
        super(xmlParser);
    }
    @Override
    public void parseJson(String json) {
        String xml = convertJsonToXml(json);
        super.parseXml(xml);
    }

    private String convertJsonToXml(String json) {
        return "\n" + json + " convertit din json in xml";
    }
}