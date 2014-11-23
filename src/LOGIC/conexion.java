/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LOGIC;

import java.io.File;
import java.io.IOException; 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult; 
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author jairo
 */
public class conexion {
    
    public conexion(){
        
    }
    public void conectar(Document documento){
        
                
    }
    public void agregardispositivo(String id, String tipo, String puerto){
        String filePath = "/home/jairo/NetBeansProjects/CEDMS/src/XML/grafo.xml";
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            
            agregarElemento(doc, id, tipo, puerto);
             
            //write the updated document to file or console
            doc.getDocumentElement().normalize();
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("/home/jairo/NetBeansProjects/CEDMS/src/XML/grafo.xml"));
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);
            System.out.println("XML file updated successfully");
             
        } catch (SAXException | ParserConfigurationException | IOException | TransformerException e1) {
            e1.printStackTrace();
        }
        
    }
    private static void agregarElemento(Document docto, String id, String tipo, String puerto) {
        NodeList disp = docto.getElementsByTagName("dispositivos");
        Element emp = null;
        
        for(int i=0; i<disp.getLength();i++){
            emp = (Element) disp.item(i);
            Element salaryElement = docto.createElement("dispositivo");
            salaryElement.setAttribute("id", id);
            salaryElement.setAttribute("tipo", tipo);
            salaryElement.setAttribute("puerto", puerto);
            emp.appendChild(salaryElement);
        }
    }
    
    
}
