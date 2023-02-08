import java.util.Calendar;

public class Person {

    private String firstName;
    private String lastName;
    private String ID;
    private String title;
    private int YOB;

    static private int age = 1;



    public Person(String firstName, String lastName, String ID, String title, int YOB, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
        this.age = age;
    }

    public Person(String firstName, String lastName, String ID, String title, int YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
        this.age = Integer.parseInt(this.getAge());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public String formalName(String title, String fullName) {
        return title + " " + fullName(firstName, lastName);
    }

    public static void setAge(int year){
        Person.age = age;
    }

    public String getAge() {
        Calendar now = Calendar.getInstance();
        int age = now.get(Calendar.YEAR) - YOB;
        if (now.get(Calendar.DAY_OF_YEAR) < YOB) {
            age--;
        }
        return Integer.toString(age);
    }

    public String toCSVDataRecord(String ID, String firstName, String lastName, String title, int YOB) {
        return firstName + "," + lastName + "," + ID + "," + title + "," + YOB;
    }

}
