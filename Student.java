package studentend;

public class Student {
    private String name = "join";
    private String classes = "C02";
    public Student(){
    }
    private void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    private void setClasses(String classes){
        this.classes=classes;
    }
    public String getClasses(){
        return classes;
    }
}
