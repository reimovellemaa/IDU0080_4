//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.14 at 07:40:30 PM EEST 
//


package ee.ttu.web.main.soap;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ee.ttu.web.delivery_info package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ee.ttu.web.delivery_info
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDeliveryInfo }
     * 
     */
    public GetDeliveryInfo createGetDeliveryInfo() {
        return new GetDeliveryInfo();
    }

    /**
     * Create an instance of {@link GetDeliveryInfoResponse }
     * 
     */
    public GetDeliveryInfoResponse createGetDeliveryInfoResponse() {
        return new GetDeliveryInfoResponse();
    }

}
