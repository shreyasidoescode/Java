class Student {
    int rollNo;
    String name;
    double marks;
    // Default Constructor
    Student() {
        rollNo = 0;
        name = "Unknown";
        marks = 0.0;
    }
    // Parameterized Constructor
    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    // Copy Constructor
    Student(Student s) {
        this.rollNo = s.rollNo;
        this.name = s.name;
        this.marks = s.marks;
    }
    // Method to display student details
    void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);
        System.out.println();
    }
    public static void main(String[] args) {
        // Using Default Constructor
        Student s1 = new Student();
        // Using Parameterized Constructor
        Student s2 = new Student(101, "Shreyasi", 92.5);
        // Using Copy Constructor
        Student s3 = new Student(s2);
        System.out.println("Default Constructor:");
        s1.display();
        System.out.println("Parameterized Constructor:");
        s2.display();
        System.out.println("Copy Constructor:");
        s3.display();
    }
}
