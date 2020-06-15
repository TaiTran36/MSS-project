package DB;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import javax.lang.model.type.NoType;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import Object.Classroom;
import Object.Course;
import Object.Student;
import Object.TimeTable;

public class StudentDB {

    public StudentDB(){
//      this.classroom = classroom;
  }
    
    
    public static void addStudent(Student stu, String code_root){
    	try {
    		String filepath = "src/DB/student.fxml";
    		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
    		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
    		Document doc = docBuilder.parse(filepath);
    		
    		Element students = doc.getDocumentElement();

            NodeList studentList = students.getElementsByTagName("student");
            int countStd = 0;
            for (int i = 0; i < studentList.getLength(); i++) {
                Node node = studentList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element student = (Element) node;
                    String s = student.getAttributes().getNamedItem("id").getTextContent();
                    if(s.equals(stu.getCode())) {
                    	countStd++;
                    	NodeList courseList = student.getElementsByTagName("course");
                    	int countRoom =0;
                    	for (int j = 0; j < courseList.getLength(); j++) {
                            Node nodeCourse = courseList.item(j);
                            if (nodeCourse.getNodeType() == Node.ELEMENT_NODE) {
                                Element room = (Element) nodeCourse;
                                if(room.getElementsByTagName("code_room").item(0).getTextContent().equals(code_root)){
                                	countRoom++;
                                	return;
                                }
                            }
                    	}
                    	if(countRoom == 0) {
                    		Element course = doc.createElement("course");
                    		
                    		Element code_room = doc.createElement("code_room");
                    		code_room.appendChild(doc.createTextNode(code_root));
                    		
                    		Element score = doc.createElement("score");
                    		score.appendChild(doc.createTextNode(String.valueOf(stu.getRoom().get(0).getScore())));
                    		
                    		Element numOfAbsences = doc.createElement("numOfAbsences");
                    		numOfAbsences.appendChild(doc.createTextNode(String.valueOf(stu.getRoom().get(0).getNumOfAbsences())));
                    		
                    		Element scoreAttendance = doc.createElement("scoreAttendance");
                    		scoreAttendance.appendChild(doc.createTextNode(String.valueOf(stu.getRoom().get(0).getScoreAttendance())));
                    		
                    		Element scoreMidTerm = doc.createElement("scoreMidTerm");
                    		scoreMidTerm.appendChild(doc.createTextNode(String.valueOf(stu.getRoom().get(0).getScoreMidTerm())));
                    		
                    		Element scoreEndTerm = doc.createElement("scoreEndTerm");
                    		scoreEndTerm.appendChild(doc.createTextNode(String.valueOf(stu.getRoom().get(0).getScoreEndTerm())));
                    		
                    		course.appendChild(code_room);
                    		course.appendChild(score);
                    		course.appendChild(numOfAbsences);
                    		course.appendChild(scoreAttendance);
                    		course.appendChild(scoreMidTerm);
                    		course.appendChild(scoreEndTerm);
                    		
                    		student.appendChild(course);
                    		
                    	}
                    }
                }
            }
            if(countStd ==0) {
            	Element student = doc.createElement("student");
            	org.w3c.dom.Attr attr1 = doc.createAttribute("id");
                attr1.setValue(stu.getCode());
                student.setAttributeNode(attr1);
                
                Element name = doc.createElement("name");
                name.appendChild(doc.createTextNode(stu.getName()));
        		
        		Element code = doc.createElement("code");
        		code.appendChild(doc.createTextNode(stu.getCode()));
        		
        		Element dateOfBirth = doc.createElement("dateOfBirth");
        		dateOfBirth.appendChild(doc.createTextNode(stu.getDateOfBirth()));
        		
        		Element address = doc.createElement("address");
        		address.appendChild(doc.createTextNode(stu.getAddress()));
                
                
                Element course = doc.createElement("course");
        		
        		Element code_room = doc.createElement("code_room");
        		code_room.appendChild(doc.createTextNode(code_root));
        		
        		Element score = doc.createElement("score");
        		score.appendChild(doc.createTextNode(String.valueOf(stu.getRoom().get(0).getScore())));
        		
        		Element numOfAbsences = doc.createElement("numOfAbsences");
        		numOfAbsences.appendChild(doc.createTextNode(String.valueOf(stu.getRoom().get(0).getNumOfAbsences())));
        		
        		Element scoreAttendance = doc.createElement("scoreAttendance");
        		scoreAttendance.appendChild(doc.createTextNode(String.valueOf(stu.getRoom().get(0).getScoreAttendance())));
        		
        		Element scoreMidTerm = doc.createElement("scoreMidTerm");
        		scoreMidTerm.appendChild(doc.createTextNode(String.valueOf(stu.getRoom().get(0).getScoreMidTerm())));
        		
        		Element scoreEndTerm = doc.createElement("scoreEndTerm");
        		scoreEndTerm.appendChild(doc.createTextNode(String.valueOf(stu.getRoom().get(0).getScoreEndTerm())));
        		
        		
        		student.appendChild(name);
        		student.appendChild(code);
        		student.appendChild(dateOfBirth);
        		student.appendChild(address);
        		course.appendChild(code_room);
        		course.appendChild(score);
        		course.appendChild(numOfAbsences);
        		course.appendChild(scoreAttendance);
        		course.appendChild(scoreMidTerm);
        		course.appendChild(scoreEndTerm);
        		
        		student.appendChild(course);
                
            	students.appendChild(student);
            }
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
    
    public static void deleteStudent(String id, String code_root) {
    	try {
    		String filepath = "src/DB/student.fxml";
    		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
    		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
    		Document doc = docBuilder.parse(filepath);
    		
    		Element students = doc.getDocumentElement();

            NodeList studentList = students.getElementsByTagName("student");
            
            for (int i = 0; i < studentList.getLength(); i++) {
                Node node = studentList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element student = (Element) node;
                    String s = student.getAttributes().getNamedItem("id").getTextContent();
                    if(s.equals(id)) {
                    	NodeList courseList = student.getElementsByTagName("course");
                    	int countRoom = 0;
                    	if(courseList.getLength() > 1) {
                    		for (int j = 0; j < courseList.getLength(); j++) {
                                Node nodeCourse = courseList.item(j);
                                if (nodeCourse.getNodeType() == Node.ELEMENT_NODE) {
                                    Element room = (Element) nodeCourse;
                                    if(room.getElementsByTagName("code_room").item(0).getTextContent().equals(code_root)){
                                    	student.removeChild(room);
                                    }
                                }
                        	}
                    	}else {
                    		students.removeChild(student);
                    	}
                    	
                    }
                }
            }
            

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
    
    public void attendanceStudent(String code_stu, String code_root, int att) {
    	try {
    		String filepath = "src/DB/student.fxml";
    		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
    		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
    		Document doc = docBuilder.parse(filepath);
    		
    		Element students = doc.getDocumentElement();
            NodeList studentList = students.getElementsByTagName("student");
            for (int i = 0; i < studentList.getLength(); i++) {
                Node node = studentList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element student = (Element) node;
                    String s = student.getAttributes().getNamedItem("id").getTextContent();
                    if(s.equals(code_stu)) {
                    	NodeList courseList = student.getElementsByTagName("course");
                    	for (int j = 0; j < courseList.getLength(); j++) {
                            Node nodeCourse = courseList.item(j);
                            if (nodeCourse.getNodeType() == Node.ELEMENT_NODE) {
                                Element room = (Element) nodeCourse;
                                if(room.getElementsByTagName("code_room").item(0).getTextContent().equals(code_root)){
                                	
                                	int num = Integer.valueOf(room.getElementsByTagName("numOfAbsences").item(0).getTextContent());
                                	room.getElementsByTagName("numOfAbsences").item(0).setTextContent(String.valueOf(num+1));
                                }
                            }
                    	}
                    }
                }
            }
            

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
    
    public static void editStudent(Student stu, String code_root) {
    	try {
    		String filepath = "src/DB/student.fxml";
    		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
    		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
    		Document doc = docBuilder.parse(filepath);
    		
    		Element students = doc.getDocumentElement();

            NodeList studentList = students.getElementsByTagName("student");
            for (int i = 0; i < studentList.getLength(); i++) {
                Node node = studentList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element student = (Element) node;
                    String s = student.getAttributes().getNamedItem("id").getTextContent();
                    if(s.equals(stu.getCode())) {
                    	NodeList courseList = student.getElementsByTagName("course");
                    	for (int j = 0; j < courseList.getLength(); j++) {
                            Node nodeCourse = courseList.item(j);
                            if (nodeCourse.getNodeType() == Node.ELEMENT_NODE) {
                                Element room = (Element) nodeCourse;
                                if(room.getElementsByTagName("code_room").item(0).getTextContent().equals(code_root)){
                                	room.getElementsByTagName("numOfAbsences").item(0).setTextContent(String.valueOf(stu.getRoom().get(0).getNumOfAbsences()));
                                	room.getElementsByTagName("scoreAttendance").item(0).setTextContent(String.valueOf(stu.getRoom().get(0).getNumOfAbsences()));
                                	room.getElementsByTagName("scoreMidTerm").item(0).setTextContent(String.valueOf(stu.getRoom().get(0).getNumOfAbsences()));
                                	room.getElementsByTagName("scoreEndTerm").item(0).setTextContent(String.valueOf(stu.getRoom().get(0).getNumOfAbsences()));
                                }
                            }
                    	}
                    }
                }
            }
            

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
    
    public static LinkedList<Student> getListClass(String code_root) {
    	LinkedList<Student> stdOfCourse = new LinkedList<>();//tree
        File f = new File("src/DB/student.fxml");

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

        Element students = doc.getDocumentElement();

        NodeList studentList = students.getElementsByTagName("student");
        for (int i = 0; i < studentList.getLength(); i++) {
            Node node = studentList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element student = (Element) node;
                NodeList courseList = student.getElementsByTagName("course");
                LinkedList<Course> courses = new LinkedList<Course>();
                LinkedList<String >code_rooms = new LinkedList<>();
                for (int j = 0; j < courseList.getLength(); j++) {
                    Node nodeCourse = courseList.item(j);
                    if (nodeCourse.getNodeType() == Node.ELEMENT_NODE) {
                        Element room = (Element) nodeCourse;
                        code_rooms.add(room.getElementsByTagName("code_room").item(0).getTextContent());
                        Course c = new Course(Double.parseDouble(room.getElementsByTagName("score").item(0).getTextContent()), Integer.parseInt(room.getElementsByTagName("numOfAbsences").item(0).getTextContent()), Double.parseDouble(room.getElementsByTagName("scoreAttendance").item(0).getTextContent()), Double.parseDouble(room.getElementsByTagName("scoreMidTerm").item(0).getTextContent()), Double.parseDouble(room.getElementsByTagName("scoreEndTerm").item(0).getTextContent()));
                        courses.add(c);
                    }
                }
                if(code_rooms.contains(code_root)) {
                	LinkedList<String> cr = new LinkedList<String>();
                	cr.add(code_root);
                	stdOfCourse.add(new Student(student.getElementsByTagName("name").item(0).getTextContent(),student.getElementsByTagName("code").item(0).getTextContent(),student.getElementsByTagName("dateOfBirth").item(0).getTextContent(),student.getElementsByTagName("address").item(0).getTextContent(), courses ));
                }
            }
        }
        return stdOfCourse;
    }
}
