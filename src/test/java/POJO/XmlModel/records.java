package POJO.XmlModel;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.List;

@JacksonXmlRootElement(localName = "records")
public class records {
    @JacksonXmlProperty(localName = "record")
    public List<record> record;
}
