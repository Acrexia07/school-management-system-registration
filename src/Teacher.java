public class Teacher extends Person{

    // Initialization: Variable Declaration
    String subjectHandled;
    double salary;

    // Constructor
    Teacher(String name, String role, int id, int age, String subjectHandled, double salary){
        super(name, role, id, age);
        this.subjectHandled = subjectHandled;
        this.salary = salary;
    }

    // Method: Overridden from parent (Person)
    @Override
    String displayInfo(){
        return "Name: " + this.name + "\n" +
                "Role: " + this.role + "\n" +
                "ID: " + this.id + "\n" +
                "Age: " + this.age + "\n" +
                "Subject: " + this.subjectHandled + "\n" +
                String.format("Salary: $%,.2f\n", this.salary);
    }
}
