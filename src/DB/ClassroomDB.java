package DB;

import Object.Classroom;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.stream.Stream;

import Object.TimeTable;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerFactory;

import java.io.File;


public class ClassroomDB {
    private LinkedList<Classroom> classrooms =null;
    private Classroom classroom;
    public ClassroomDB(){
//        this.classroom = classroom;
    }

    public void addClassroom(Classroom clr){
    	File f = new File("src/DB/classroom.fxml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder buider = null;
        try {
            buider = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        Document doc = null;
        try {
            doc = buider.parse(f);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static LinkedList<Classroom> getListClass() {
        LinkedList<Classroom> ListClassrooms = new LinkedList<Classroom>();

        File f = new File("src/DB/classroom.fxml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder buider = null;
        try {
            buider = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        Document doc = null;
        try {
            doc = buider.parse(f);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Element classrooms = doc.getDocumentElement();

        NodeList studentList = classrooms.getElementsByTagName("classroom");
        for (int i = 0; i < studentList.getLength(); i++) {
            Node node = studentList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element classroom = (Element) node;
                NodeList timetables = classroom.getElementsByTagName("timetable");
                LinkedList<TimeTable> ListTimeTable = new LinkedList<TimeTable>();
                for (int j = 0; j < timetables.getLength(); j++) {
                    Node nodeTimetable = timetables.item(j);
                    if (nodeTimetable.getNodeType() == Node.ELEMENT_NODE) {
                        Element timet = (Element) nodeTimetable;
                        TimeTable t = new TimeTable(timet.getElementsByTagName("day").item(0).getTextContent(), timet.getElementsByTagName("time").item(0).getTextContent(), timet.getElementsByTagName("room").item(0).getTextContent());
                        ListTimeTable.add(t);
                    }
                }
                Classroom c = new Classroom(classroom.getElementsByTagName("name").item(0).getTextContent(), classroom.getElementsByTagName("code").item(0).getTextContent(), classroom.getElementsByTagName("semester").item(0).getTextContent(),classroom.getElementsByTagName("scholastic").item(0).getTextContent(), Integer.parseInt(classroom.getElementsByTagName("quantity").item(0).getTextContent()), ListTimeTable);
                ListClassrooms.add(c);
            }
        }
        return ListClassrooms;
    }
}
