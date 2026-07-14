public class Student {

    // Data members
    String name;
    int age;

    // Method to set student details
    void setDetails(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    // Main method
    public static void main(String[] args) {

        // Creating object
        Student s = new Student();

        // Assigning values
        s.setDetails("Tejas", 20);

        // Displaying details
        s.displayDetails();
    }
}