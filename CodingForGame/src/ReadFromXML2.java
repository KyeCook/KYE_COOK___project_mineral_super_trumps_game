/**
 * Created by ACfan on 2/10/2016.
 */
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;


public class ReadFromXML2 {
    public static void main(String[]args){

        try {
            File inputFile = new File("MstCards_151021.plist");
            DocumentBuilderFactory dbFactory
                    = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :"
                    + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("dict");
            System.out.println("----------------------------");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :"
                        + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
//                    System.out.println("Student roll no : "
//                            + eElement.getAttribute("rollno"));

                    if(eElement.getElementsByTagName("key").item(temp).getTextContent().equals("play")){
//                        System.out.println("Awesome");

                        System.out.println("Card Type : "
                                + eElement
                                .getElementsByTagName("key")
                                .item(4)
                                .getTextContent());

                        System.out.println("Card Title : "
                                + eElement
                                .getElementsByTagName("string")
                                .item(2)
                                .getTextContent());

                        System.out.println("Chemistry : "
                                + eElement
                                .getElementsByTagName("string")
                                .item(3)
                                .getTextContent());

                        System.out.println("Classification : "
                                + eElement
                                .getElementsByTagName("string")
                                .item(4)
                                .getTextContent());

                        System.out.println("Crystal System : "
                                + eElement
                                .getElementsByTagName("string")
                                .item(5)
                                .getTextContent());

                        System.out.println("Occurrence : "
                                + "\n\t" + eElement
                                .getElementsByTagName("string")
                                .item(6)
                                .getTextContent()+ "\n\t" + eElement
                                .getElementsByTagName("string")
                                .item(7)
                                .getTextContent()+ "\n\t" + eElement
                                .getElementsByTagName("string")
                                .item(8)
                                .getTextContent());

                        System.out.println("Hardness : "
                                + eElement
                                .getElementsByTagName("string")
                                .item(9)
                                .getTextContent());

                        System.out.println("Specific Gravity : "
                                + eElement
                                .getElementsByTagName("string")
                                .item(10)
                                .getTextContent());

                        System.out.println("Cleavage : "
                                + eElement
                                .getElementsByTagName("string")
                                .item(11)
                                .getTextContent());

                        System.out.println("Crustal Abundance : "
                                + eElement
                                .getElementsByTagName("string")
                                .item(12)
                                .getTextContent());

                        System.out.println("Economic Value : "
                                + eElement
                                .getElementsByTagName("string")
                                .item(13)
                                .getTextContent());

                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
