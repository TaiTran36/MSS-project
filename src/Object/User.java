package Object;

import Model.Authenticate;
import ObjInterface.UserInterface;

public class User implements UserInterface{

    private String name, code, birthDay, job ,name_class;
    private int age, permission;

    public User(){

    }

    public User(String name, String code, String birthDay, int age, String job, String name_class){
        this.name = name;
        this.code = code;
        this.birthDay = birthDay;
        this.age = age;
        this.job = job;
        this.name_class = name_class;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPermission() {
        return permission;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName_class() {
        return name_class;
    }

    public void setName_class(String name_class) {
        this.name_class = name_class;
    }

    public int login(String code, String password) {
        int auth = new Authenticate().checkAccount(code, password);
        if(auth == 1){
            return 1;
        }
        if(auth <= 0){
            return -1;
        }
        return 0;
    }
}
