import java.util.ArrayList;

public class StudentReportCard extends Report {

    private String name;
    private ArrayList<String> courses;
    private ArrayList<Integer> grades;

    public StudentReportCard(String title, String author, String date, String name) {
        super(title, author, date);
        this.name = name;
        courses = new ArrayList<>();
        grades = new ArrayList<>();
    }

    @Override
    public void print() {
        // Set the first section string in the inherited array list sections to the string:
        // "Student Name: " followed by the student name followed by "\n"
        sections.add("Student Name: " + name + "\n");

        // Then set each subsequent string in the sections array list to the course name (from courses array list)
        // followed by " " followed by the grade for that course (from grades array list)
        for (int i = 0; i < courses.size(); i++) {
            sections.add(courses.get(i) + " " + grades.get(i));
        }

        // Then finally print the student report card by properly calling the print() method in the superclass Report
        super.print();
    }

    // Create a method void addCourse(String courseName, int grade) that adds the course name to the array list of
    // courses and adds the grade to the array list of grades
    public void addCourse(String courseName, int grade) {
        courses.add(courseName);
        grades.add(grade);
    }
}
