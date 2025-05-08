public class Student {
    
    String name;
    int rollNumber;
    char grade;

    
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    
    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Student student = new Student("Alice Johnson", 101, 'A');

        
        student.displayDetails();
    }
}
