package Object;

import java.util.LinkedList;

public class Classroom {

    private String name, code, semester, scholastic;
    private int quantity = 0;
    private LinkedList<TimeTable> timetables;
    public Classroom(String name, String code, String semester, String scholastic, LinkedList<TimeTable> timeTables){
        this.name = name;
        this.code = code;
        this.semester = semester;
        this.scholastic = scholastic;
        this.quantity = quantity;
        this.timetables = timeTables;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getScholastic() {
        return scholastic;
    }

    public void setScholastic(String scholastic) {
        this.scholastic = scholastic;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LinkedList<TimeTable> getTimetables() {
        return timetables;
    }

    public void setTimetables(LinkedList<TimeTable> timetables) {
        this.timetables = timetables;
    }
}
