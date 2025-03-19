package DomashnayaZadaniya.Persson;

public class Students extends Persson {
    private String profession;
    private String books;
    private boolean notebook;
    private boolean pen;

    public Students() {}

    public Students(String lastName, String firstName, int age, String faculty, String department,String profession, String books, boolean notebook, boolean pen) {
        super(lastName, firstName, age, faculty, department);
        this.profession = profession;
        this.books = books;
        this.notebook = notebook;
        this.pen = pen;
    }

    public String getBooks() {
        return books;
    }
    public void setBooks(String books) {
        this.books = books;
    }

    public boolean getNotebook() {
        return notebook;
    }

    public void setNotebook(boolean notebook) {
        this.notebook = notebook;
    }

    public boolean getPen() {
        return pen;
    }

    public void setPen(boolean pen) {
        this.pen = pen;
    }

    public String toString() {
        return "Student: " + super.toString() + "\nProfession: " + profession +
                "\nBooks: " + books + "\nNotebook: " + notebook + "\nPen: " + pen + ";";
    }
}
