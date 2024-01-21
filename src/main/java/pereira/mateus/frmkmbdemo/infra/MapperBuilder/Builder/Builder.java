package pereira.mateus.frmkmbdemo.infra.MapperBuilder.Builder;

 
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import pereira.mateus.frmkmbdemo.infra.MapperBuilder.maps.Converter.IConverter;
import pereira.mateus.frmkmbdemo.infra.MapperBuilder.maps.Converter.LibraryConverter;
import pereira.mateus.frmkmbdemo.infra.MapperBuilder.maps.LibraryMap;

import java.io.File;
import java.io.FileOutputStream;
import org.jdom2.filter.Filters;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;

@NoArgsConstructor
public class Builder {

    public static final String SRC_MAIN_RESOURCES_MAPPER_LIBRARY_XML = "src/main/resources/mapper/library.xml";
    public static final String SRC_MAIN_RESOURCES_MAPPER_LIBRARY_2_XML = "src/main/resources/mapper/library2.xml";


    public static void createBuilder() {

        final IConverter<LibraryMap> converter = new LibraryConverter();
        final LibraryMap libraryMap = converter.convert();
        final Document document = getDocument();

        outerLoop:
        for (LibraryMap.Map map : libraryMap.maps()) {

            for(LibraryMap.FetchMap fetchMap : map.fetchMap()) {

                Element element = getElementById(document, fetchMap.id());
                if(element ==null)
                    continue outerLoop;

                element.setText(BuilderTemplate.select(fetchMap));

            }
        }

        //save document
        saveXml(document);
    }

    @SneakyThrows
    private static Document getDocument()    {
        return new SAXBuilder().build(new File( SRC_MAIN_RESOURCES_MAPPER_LIBRARY_XML));
    }

    @SneakyThrows
    private static void saveXml(Document document)   {
        XMLOutputter xmlOutputter = new XMLOutputter(Format.getPrettyFormat());
        xmlOutputter.output(document, new FileOutputStream( SRC_MAIN_RESOURCES_MAPPER_LIBRARY_2_XML));
    }

    public static Element getElementById(Document document, String targetId) {
        // Create XPath expression
        XPathFactory xPathFactory = XPathFactory.instance();
        XPathExpression<Element> expr = xPathFactory.compile(STR."//*[@id='\{targetId}']", Filters.element());

        // Execute XPath expression
        return expr.evaluateFirst(document);
    }

}
