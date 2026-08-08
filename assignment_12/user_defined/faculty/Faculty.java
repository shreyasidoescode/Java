package faculty;

public class Faculty {

    int facultyId;
    String facultyName;

    public Faculty(int facultyId, String facultyName) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
    }

    public void displayFaculty() {
        System.out.println("\n----- Faculty Details -----");
        System.out.println("Faculty ID   : " + facultyId);
        System.out.println("Faculty Name : " + facultyName);
    }
}