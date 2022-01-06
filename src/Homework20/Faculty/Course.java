package Homework20.Faculty;

public class Course {
    private String name;
    private String CreationData;
    private String ID;
    private String FullNameTeacher;

    public Course(String name, String creationData, String ID, String fullNameTeacher) {
        this.name = name;
        CreationData = creationData;
        this.ID = ID;
        FullNameTeacher = fullNameTeacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreationData() {
        return CreationData;
    }

    public void setCreationData(String creationData) {
            this.CreationData = creationData;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
            this.ID = ID;
    }

    public String getFullNameTeacher() {
        return FullNameTeacher;
    }

    public void setFullNameTeacher(String fullNameTeacher) {
        this.FullNameTeacher = fullNameTeacher;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s\n" +
                "Дата создание: %s\n" +
                "ID : %s\n" +
                "ФИО препоподователя: %s\n",name,CreationData,ID,FullNameTeacher);
    }
}
