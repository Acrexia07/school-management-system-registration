
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Initialization: Variable Declaration
        Scanner scn = new Scanner(System.in);
        String name;
        char personType;
        int id;
        int numOfPersons;

        // Process: Validate user input (positive integers only)
        numOfPersons = validateInput_Integer(scn, "How many persons do you want to register: ");

        // Process: Initialize a 'Person' array based on the numOfPersons index
        Person[] persons = new Person[numOfPersons];

        // Process: Perform loop based on the person.length
        for( int i = 0; i < persons.length;i++){

            // Process: Perform do-while loop until the while condition became false
            do{
                System.out.print("Enter person type to register ( S = student, T = teacher): ");
                personType = scn.next().toUpperCase().charAt(0);

                // Process: Validate char input - Person type
                if(personType != 'S' && personType != 'T'){
                    System.out.println("Invalid input: Enter correct option (S or T)! Please try again.");
                }
            } while(personType != 'S' && personType != 'T');

            // Process: Clears the Scanner buffer
            scn.nextLine();

            // Process: User input - Registration
            System.out.print("Enter your name: ");
            name = scn.nextLine();
            // Process: Validate user input (positive integers only)
            id = validateInput_Integer(scn, "Enter your ID: ");

            switch (personType) {
                case 'S' -> {

                    String role = "Student";
                    // Process: Validate Student Age
                    int age = validateRegisterAge_Student(scn);

                    // Process: Validate Grade Level
                    int gradeLevel = validateInput_Integer(scn,"Enter your Grade Level: ");

                    // Process: Validate Grade Level
                    double gpa = validateInput_Double(scn,"Enter your GPA: ");

                    // Process: Added to array as new index
                    persons[i] = new Student(name, role, id, age, gradeLevel, gpa);
                }
                case 'T' -> {
                    String role = "Teacher";
                    // Process: Validate Teacher Age
                    int age = validateRegisterAge_Teacher(scn);

                    // Process: User input - Subject handled
                    System.out.print("Enter Subject handled: ");
                    String subjectHandled = scn.nextLine();

                    // Process: Validate Grade Level
                    double salary = validateInput_Double(scn,"Enter your Salary: ");

                    // Process: Added to array as new index
                    persons[i] = new Teacher(name, role, id, age, subjectHandled, salary);
                }
            }
        }

        // Process: Displays Registered persons
        System.out.println("\n=== Registered Persons ===\n");
        for (Person person : persons){
            if(person != null){
                System.out.printf(person.displayInfo());
                System.out.println("-------------------------");
            }
            System.out.println();
        }

        //Exit: Closing Scanner object
        scn.close();
    }

    // Method: Validate user input - Integer data type
    static int validateInput_Integer (Scanner scn, String prompt){

        // Initialization: Variable Declaration
        int variableInput;

        // Process: Validate user input (positive integers only)
        while (true) {
            System.out.print(prompt);
            if(!scn.hasNextInt()){
                System.out.println("Invalid input: Enter number only! Please try again.");
                scn.next();
            }
            else {
                variableInput = scn.nextInt();
                scn.nextLine();
                if(variableInput <= 0){
                    System.out.println("Invalid input: Enter a number greater than 0! Please try again.");
                }
                else {
                    break;
                }
            }
        }
        return variableInput;
    }

    // Method: Validate user input - Double data type
    static double validateInput_Double (Scanner scn, String prompt){

        // Initialization: Variable Declaration
        double variableInput;

        // Process: Validate user input (positive integers only)
        while (true) {
            System.out.print(prompt);
            if(!scn.hasNextDouble()){
                System.out.println("Invalid input: Enter number only! Please try again.");
                scn.next();
            }
            else {
                variableInput = scn.nextDouble();
                scn.nextLine();
                if(variableInput <= 0){
                    System.out.println("Invalid input: Enter a number greater than 0! Please try again.");
                }
                else {
                    break;
                }
            }
        }
        return variableInput;
    }

    // Method: Validate age input - Student
    static int validateRegisterAge_Student (Scanner scn){

        // Initialization: Variable Declaration
        int age;

        // Process: Validate user input (positive integers only)
        while (true) {
            System.out.print("Enter your age: ");
            if(!scn.hasNextInt()){
                System.out.println("Invalid input: Enter number only! Please try again.");
                scn.next();
            }
            else {
                age = scn.nextInt();
                scn.nextLine();
                if(age < 5 || age > 100){
                    System.out.println("Invalid input: Student must be at least 5 years old or enter valid age! Please try again.");
                }
                else {
                    break;
                }
            }
        }
        return age;
    }

    // Method: Validate age input - Teacher
    static int validateRegisterAge_Teacher (Scanner scn){

        // Initialization: Variable Declaration
        int age;

        // Process: Validate user input (positive integers only)
        while (true) {
            System.out.print("Enter your age: ");
            if(!scn.hasNextInt()){
                System.out.println("Invalid input: Enter number only! Please try again.");
                scn.next();
            }
            else {
                age = scn.nextInt();
                scn.nextLine();
                    if(age < 21 || age > 100){
                        System.out.println("Invalid input: Teacher must be at least 21 years old or enter valid age! Please try again.");
                    }
                else {
                    break;
                }
            }
        }
        return age;
    }
}
