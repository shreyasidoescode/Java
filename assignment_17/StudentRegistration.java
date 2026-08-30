import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class StudentRegistration extends JFrame implements ActionListener {
    JTextField name, rollNo, course;
    JButton submit;
    StudentRegistration() {
        setTitle("Student Registration");
        setSize(350,250);
        setLayout(new GridLayout(4,2));
        add(new JLabel("Name:"));
        name = new JTextField();
        add(name);
        add(new JLabel("Roll Number:"));
        rollNo = new JTextField();
        add(rollNo);
        add(new JLabel("Course:"));
        course = new JTextField();
        add(course);
        submit = new JButton("Submit");
        add(submit);
        submit.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this,"Student Registered Successfully!\nName: " + name.getText() + "\nRoll Number: " + rollNo.getText() + "\nCourse: " + course.getText());
    }
    public static void main(String[] args) {
        new StudentRegistration();
    }
}