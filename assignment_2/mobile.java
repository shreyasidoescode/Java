public class StudentMarks {
    public static void main(String[] args) {
        String marks1 = "85";
        String marks2 = "90";
        String marks3 = "78";
        Integer m1 = Integer.valueOf(marks1);
        Integer m2 = Integer.valueOf(marks2);
        Integer m3 = Integer.valueOf(marks3);
        Integer total = m1 + m2 + m3;
        System.out.println("Student Marks");
        System.out.println("Subject 1: " + m1);
        System.out.println("Subject 2: " + m2);
        System.out.println("Subject 3: " + m3);
        System.out.println("Total Marks: " + total);
        int primitiveTotal = total.intValue();
        System.out.println("Primitive Total: " + primitiveTotal);
    }
}