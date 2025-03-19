package DomashnayaZadaniya.Persson;

import java.time.Year;

public class Teacher extends Persson {
    private String subject;
    private boolean outline;
    private boolean plan;

    public Teacher() {}

    public Teacher(String lastName, String firsName, int age, String faculty, String department, String subject, boolean outline, boolean plan) {
        super(lastName, firsName, age, faculty, department);
        this.subject = subject;
        this.outline = outline;
        this.plan = plan;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean getOutline() {
        return outline;
    }

    public void setOutline(boolean outline) {
        this.outline = outline;
    }

    public boolean getPlan() {
        return plan;
    }

    public void setPlan(boolean plan) {
        this.plan = plan;
    }

    public String toString() {
        return "Teacher: " + super.toString() + "\nSubject: '" + subject + "';\nOutline: " + outline + ";\nPlan: " + plan + ";";
    }
}
