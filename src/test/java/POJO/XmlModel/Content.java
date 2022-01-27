package POJO.XmlModel;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Content")
public class Content {
    @JacksonXmlProperty(localName = "ActionItemContent")
    public ActionItemContent ActionItemContent;
}
