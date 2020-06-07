package Object;

public class TimeTable {

    private String day, time, room;

    public TimeTable(String day, String time, String room){
        this.day = day;
        this.time = time;
        this.room = room;
    }

    public String getDay() {
        return day;
    }

    public String getRoom() {
        return room;
    }

    public String getTime() {
        return time;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
