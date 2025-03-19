package DomashnayaZadaniya.Persson;

public class Persson {
    private String lastName;
    private String firstName;
    private int age;
    private String faculty;
    private String department;

    public Persson(){}

    public Persson(String lastName, String firsName, int age, String faculty, String department) {
        this.lastName = lastName;
        this.firstName = firsName;
        if (age > 0) {
            this.age = age;
        }
        this.faculty = faculty;
        this.department = department;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString() {
        return lastName + " "  + firstName + ";" + "\nAge: " + age + ";" + "\nFaculty: " + faculty + ";" + "\nDepartment: " + department + ";";
    }
}

