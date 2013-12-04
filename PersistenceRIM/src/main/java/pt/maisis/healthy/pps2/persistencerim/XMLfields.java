/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.maisis.healthy.pps2.persistencerim;

import healthy.Archetype;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;

/**
 * classe para leitura do campo body e escrita no campo data do arquétipo Peso
 *
 * @author Carlos Cardoso <carlos.cardoso@maisis.pt>
 */
public class XMLfields {

    private Document xmlData; 
    private Document xmlBody;

    /**
     * *
     *
     * @param archetypeResponse
     * @return Document
     */
    public Document setXMLfields(Archetype archetypeResponse) {
        try {
            //ler o body do arquétipo
            xmlBody = DocumentHelper.parseText(archetypeResponse.getBody());
            //unidades do peso definidas no body - lista 1
            //descomentar as listas 
//            List<Node> nodes = xmlBody.selectNodes("//ns:attribute/ns:item/@units");
//            List<String> units = new ArrayList<>(0);
//            for (Node node : nodes) {
//                String nodeValue = node.getStringValue();
//                units.add(nodeValue.toString());
//            }
            //lista 2
//            List<Element> nodesList = xmlBody.selectNodes("//ns:attribute[@id='at0009']/ns:property/codeList");
//            List<String> fields = new ArrayList<>(0);
//            for (Element node : nodesList) {
//                String nodeData = node.getStringValue();
//                fields.add(nodeData.toString());
//            }

            //escrever no campo data Peso
            xmlData = DocumentHelper.parseText(archetypeResponse.getData());
            //ns:at0004/ns:units  - peso registado
            // exemplo do uso do XPath para selecionar um nó
//            Node peso = xmlData.selectSingleNode("//ns:at0004/ns:magnitude");
            
            //ns:at0004/ns:units  - unidades de peso que vem da lista1

            //ns:at0024/ns:value - 1 comentario
            
            //ns:at0025/ns:value - segundo comentario

            //ns:at0009/ns:definingCode/ns:codeString - lista 2

            
            return xmlData; //retorno do Document preenchido
        } catch (DocumentException ex) {
            Logger.getLogger(XMLfields.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Document getXmlData() {
        return xmlData;
    }
}
