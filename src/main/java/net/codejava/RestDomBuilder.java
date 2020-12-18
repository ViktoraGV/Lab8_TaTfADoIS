package net.codejava;

import net.codejava.Restaurant;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class RestDomBuilder {

    private DocumentBuilder documentBuilder;
    private Document document;

    public RestDomBuilder(String nameFile) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            documentBuilder = factory.newDocumentBuilder();
            File file = new File("C:\\Users\\VLADOS\\Desktop\\Calculator\\src\\main\\resourcesd\\"+ nameFile);
            document = documentBuilder.parse(file.getAbsoluteFile());
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public List<Restaurant> getData() {

        List<Restaurant> resttsList = new ArrayList<>();
        List<Restaurant> restsList = new ArrayList<Restaurant>();

        Element element = document.getDocumentElement();

        NodeList rests = element.getElementsByTagName("restaurant");


        for (int i = 0; i < rests.getLength(); i++) {
            Element restElement = (Element) rests.item(i);
            Restaurant restaurant = new Restaurant() ;
            restaurant = buildRestObject(restElement);
            restsList.add(restaurant);

        }


        return restsList;
    }

    private Restaurant buildRestObject(Element element) {





        int id = Integer.parseInt(element.getAttribute("id"));
        //restaurant.setId(id);

        String name = getElementTextContent(element, "name");
       // System.out.println(name.equals("san"));
      //  restaurant.setName(name);

        String street = getElementTextContent(element, "street");
     //   restaurant.setStreet(street);

        String cuisine = getElementTextContent(element, "cuisine");
    //    restaurant.setCuisine(cuisine);
       // System.out.println(name.equals("Мясо"));
        int hall = Integer.parseInt(getElementTextContent(element, "hall"));
  //      restaurant.setHall(hall);


        Double price = Double.parseDouble(getElementTextContent(element, "price"));
    //    restaurant.setPrice(price);
        String nameDish = getElementTextContent(element, "nameDish");
     //   restaurant.setNameDish(nameDish);
        Restaurant restaurant = new Restaurant(id,name,nameDish,price,street,hall,cuisine);
        return restaurant;
    }

    private static String getElementTextContent(Element element, String elementName) {
        NodeList nodeList = element.getElementsByTagName(elementName);
        Node node = nodeList.item(0);


        return node.getTextContent();
    }

}
