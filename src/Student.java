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
        return "Name: " + this.name + "\n" +
                "Role: " + this.role + "\n" +
                "ID: " + this.id + "\n" +
                "Age: " + this.age + "\n" +
                "Subject: " + this.gradeLevel + "\n" +
                "Subject: " + this.gpa + "\n";
    }
}
