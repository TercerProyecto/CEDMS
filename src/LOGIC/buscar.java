/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LOGIC;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

/**
 *
 * @author jairo
 */
public class buscar {
    
    public void Buscar(String name){    
        try {
            Document archivo = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("/home/jairo/NetBeansProjects/CEDMS/src/XML/solicitudConnection.xml");
            XPath newXPath = XPathFactory.newInstance().newXPath();
            NodeList listaEstudiantes = (NodeList) newXPath.evaluate("//connection", archivo, XPathConstants.NODESET);
            for(int i=0; i<listaEstudiantes.getLength();i++){
                NamedNodeMap attributes = listaEstudiantes.item(i).getAttributes();
                NodeList childNodes = listaEstudiantes.item(i).getChildNodes();
                System.out.println("Student number: "+attributes.item(1).getTextContent());
                //System.out.println("RollNumber: "+ attributes.item(0).getTextContent()+"\tName: "+childNodes.item(1).getTextContent()+"\tAddress: "+childNodes.item(3).getTextContent()+"\tAge: "+childNodes.item(5).getTextContent());
                System.out.println("--------------------------------\n");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);    
        }
    }
    
}
