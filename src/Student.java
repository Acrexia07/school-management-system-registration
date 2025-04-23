public class Student extends Person{

    // Initialization: Variable Declaration
    int gradeLevel;
    double gpa;

    // Constructor
    Student(String name, String role, int id, int age, int gradeLevel, double gpa){
        super(name, role, id, age);
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
    }

    // Method: Overridden from parent (Person)
    @Override
    String displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Role: " + this.role);
        System.out.println("ID: " + this.id);
        System.out.println("Age: " + this.age);
        System.out.println("Grade Level: " + this.gradeLevel);
        System.out.println("GPA: " + this.gpa);
        return "";
    }
}
