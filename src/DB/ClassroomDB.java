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
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.File;


public class ClassroomDB {
    private LinkedList<Classroom> classrooms =null;
    private Classroom classroom;
    public ClassroomDB(){
//        this.classroom = classroom;
    }

    public static void addClassroom(Classroom clr){
    	try {
    		String filepath = "src/DB/classroom.fxml";
    		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
    		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
    		Document doc = docBuilder.parse(filepath);
    		
    		Element classrooms = doc.getDocumentElement();
    		
    		Element classroom = doc.createElement("classroom");
    		
    		Element name = doc.createElement("name");
    		name.appendChild(doc.createTextNode(clr.getName()));
    		
    		Element code = doc.createElement("code");
    		code.appendChild(doc.createTextNode(clr.getCode()));
    		
    		Element semester = doc.createElement("semester");
    		semester.appendChild(doc.createTextNode(clr.getSemester()));
    		
    		Element scholastic = doc.createElement("scholastic");
    		scholastic.appendChild(doc.createTextNode(clr.getScholastic()));
    		
    		Element timetable1 = doc.createElement("timetable");
    		Element day1 = doc.createElement("day");
    		day1.appendChild(doc.createTextNode(clr.getTimetables().get(0).getDay()));
    		
    		Element time1 = doc.createElement("time");
    		time1.appendChild(doc.createTextNode(clr.getTimetables().get(0).getTime()));
    		
    		Element room1 = doc.createElement("room");
    		room1.appendChild(doc.createTextNode(clr.getTimetables().get(0).getRoom()));
    		
    		timetable1.appendChild(day1);
    		timetable1.appendChild(time1);
    		timetable1.appendChild(room1);
    		
    		Element timetable2 = doc.createElement("timetable");
    		Element day2 = doc.createElement("day");
    		day2.appendChild(doc.createTextNode(clr.getTimetables().get(0).getDay()));
    		
    		Element time2 = doc.createElement("time");
    		time2.appendChild(doc.createTextNode(clr.getTimetables().get(0).getTime()));
    		
    		Element room2 = doc.createElement("room");
    		room2.appendChild(doc.createTextNode(clr.getTimetables().get(0).getRoom()));
    		
    		timetable2.appendChild(day2);
    		timetable2.appendChild(time2);
    		timetable2.appendChild(room2);
    		
    		Element quantity = doc.createElement("quantity");
    		quantity.appendChild(doc.createTextNode(String.valueOf(clr.getQuantity())));
    		
    		classroom.appendChild(name);
    		classroom.appendChild(code);
    		classroom.appendChild(semester);
    		classroom.appendChild(scholastic);
    		classroom.appendChild(timetable1);
    		classroom.appendChild(timetable2);
    		classroom.appendChild(quantity);

    		
    		classrooms.appendChild(classroom);
    		
    		
    		TransformerFactory transformerFactory = TransformerFactory.newInstance();
    		Transformer transformer = transformerFactory.newTransformer();
    		DOMSource source = new DOMSource(doc);
    		StreamResult result = new StreamResult(new File(filepath));
    		transformer.transform(source, result);

    		
    	}catch (ParserConfigurationException pce) {
    		pce.printStackTrace();
 	   } catch (IOException ioe) {
 		ioe.printStackTrace();
 	   } catch (SAXException sae) {
 		sae.printStackTrace();
 	   } catch (TransformerConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (TransformerException e) {
		// TODO Auto-generated catch block
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
                Classroom c = new Classroom(classroom.getElementsByTagName("name").item(0).getTextContent(), classroom.getElementsByTagName("code").item(0).getTextContent(), classroom.getElementsByTagName("semester").item(0).getTextContent(),classroom.getElementsByTagName("scholastic").item(0).getTextContent(), ListTimeTable);
                c.setQuantity(Integer.parseInt(classroom.getElementsByTagName("quantity").item(0).getTextContent()));
                ListClassrooms.add(c);
            }
        }
        return ListClassrooms;
    }
}
