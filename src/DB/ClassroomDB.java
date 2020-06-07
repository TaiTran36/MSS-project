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
import java.io.File;


public class ClassroomDB {
    private LinkedList<Classroom> classrooms =null;
    private Classroom classroom;
    public ClassroomDB(){
//        this.classroom = classroom;
    }

    public void createClassroom(String name, String code, String semester, String scholastic, int quantity, String [][] timeTables){

        LinkedList<TimeTable> timeTables1 = null;
        TimeTable timeTable1 = new TimeTable(timeTables[0][0], timeTables[0][1], timeTables[0][2]);
        TimeTable timeTable2 = new TimeTable(timeTables[1][0], timeTables[1][1], timeTables[1][2]);
        timeTables1.add(timeTable1);
        timeTables1.add(timeTable2);

        Classroom classroom = new Classroom(name, code, semester, scholastic, quantity, timeTables1);
        classrooms.add(classroom);

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
