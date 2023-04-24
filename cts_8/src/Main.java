import adapter.JsonParser;
import adapter.XmlParser;
import adapter.XmlToJsonAdapter;
import facade.ShapeMaker;
import facade2.DealerAuto;

public class Main {
    public static void main(String[] args) {

        XmlParser xmlParser = new XmlParser();
        JsonParser jsonParser = new XmlToJsonAdapter(xmlParser);
        jsonParser.parseJson("STRING");

        XmlParser xmlParser2 = new XmlParser();
        JsonParser jsonParser2 = new XmlToJsonAdapter(xmlParser2);
        jsonParser2.parseJson("STRING");

        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

        DealerAuto dealerAuto=new DealerAuto();
        System.out.println(dealerAuto.descriereMasinaFamilie());
    }
}