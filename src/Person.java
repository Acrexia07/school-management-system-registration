public abstract class Person {

    // Initialization: Variable Declaration
    String name;
    String role;
    int id;
    int age;

    // Constructor
    Person (String name, String role, int id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
        this.role = role;
    }

    // Method: Abstracted
    abstract String displayInfo();
}
