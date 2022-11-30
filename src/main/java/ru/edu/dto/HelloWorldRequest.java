package ru.edu.dto;

import javax.xml.bind.annotation.XmlRootElement;

// name должно соответствовать @PayloadRoot(localPart) из MyWsEndpoint
@XmlRootElement(name = "helloWorldRequest")
public class HelloWorldRequest {

}
