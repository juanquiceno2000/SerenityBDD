package POJO.XmlModel;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "ActionItemContent")
public class ActionItemContent {
    @JacksonXmlProperty(localName = "SequentialIdentifier")
    public int SequentialIdentifier;
    @JacksonXmlProperty(localName = "ActionItemCategory")
    public String ActionItemCategory;
    @JacksonXmlProperty(localName = "ActionItemStudyCategory")
    public String ActionItemStudyCategory;
}
