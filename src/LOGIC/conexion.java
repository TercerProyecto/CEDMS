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
    public void agregarConexion(String document){
        String filePath = document;
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document documento = dBuilder.parse(xmlFile);
            documento.getDocumentElement().normalize();            
            agregar(documento);
            documento.getDocumentElement().normalize();
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(documento);
            StreamResult result = new StreamResult(new File("/home/jairo/NetBeansProjects/CEDMS/src/XML/grafo.xml"));
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);
        }
        catch (SAXException | ParserConfigurationException | IOException | TransformerException e1) {
            e1.printStackTrace();
        }
    }
    
    private void agregar(Document docto) {
        NodeList disp = docto.getElementsByTagName("dispositivos");
        Element emp = null;        
        for(int i=0; i<disp.getLength();i++){
            emp = (Element) disp.item(i);
            Element dispElement = docto.createElement("dispositivo");
            dispElement.setAttribute("source", "source");
            dispElement.setAttribute("target", "target");
            dispElement.setAttribute("precio", "precio");
            emp.appendChild(dispElement);
        }
    }
    
        
                
    
    public void agregardispositivo(String id, String tipo, String puerto){
        String filePath = "/home/jairo/NetBeansProjects/CEDMS/src/XML/grafo.xml";
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document document = dBuilder.parse(xmlFile);
            document.getDocumentElement().normalize();            
            agregarElemento(document, id, tipo, puerto);
            document.getDocumentElement().normalize();
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("/home/jairo/NetBeansProjects/CEDMS/src/XML/grafo.xml"));
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);
        }
        catch (SAXException | ParserConfigurationException | IOException | TransformerException e1) {
            e1.printStackTrace();
        }
    }
    private void agregarElemento(Document docto, String id, String tipo, String puerto) {
        NodeList disp = docto.getElementsByTagName("conexiones");
        Element emp = null;        
        for(int i=0; i<disp.getLength();i++){
            emp = (Element) disp.item(i);
            Element dispElement = docto.createElement("conexion");
            dispElement.setAttribute("id", id);
            dispElement.setAttribute("tipo", tipo);
            dispElement.setAttribute("puerto", puerto);
            emp.appendChild(dispElement);
        }
    }
    public void Buscar(String docto, String name){
        try {
            Document archivo = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(docto);
            XPath newXPath = XPathFactory.newInstance().newXPath();
            Element listaEstudiantes = (Element) newXPath.evaluate("//connection[name='"+name+"']", archivo, XPathConstants.NODE);
            
                NamedNodeMap attributes = listaEstudiantes.getAttributes();
                NodeList childNodes = listaEstudiantes.getChildNodes();
                System.out.println("Find Student by name: "+name);
                
            
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);    
        }
    }
}