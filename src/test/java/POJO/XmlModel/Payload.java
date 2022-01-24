package POJO.XmlModel;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Payload")
public class Payload {
    @JacksonXmlProperty(localName = "Status")
    public String Status;
    @JacksonXmlProperty(localName = "Message")
    public String Message;
    @JacksonXmlProperty(localName = "EventType")
    public String EventType;
    @JacksonXmlProperty(localName = "records")
    public records records;
}
