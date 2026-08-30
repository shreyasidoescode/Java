import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EmployeeRegistration extends JFrame implements ActionListener {
    JTextField id, name, department, salary;
    JButton submit;
    EmployeeRegistration() {
        setTitle("Employee Registration");
        setSize(400,300);
        setLayout(new GridLayout(5,2));
        add(new JLabel("Employee ID:"));
        id = new JTextField();
        add(id);
        add(new JLabel("Name:"));
        name = new JTextField();
        add(name);
        add(new JLabel("Department:"));
        department = new JTextField();
        add(department);
        add(new JLabel("Salary:"));
        salary = new JTextField();
        add(salary);
        submit = new JButton("Submit");
        add(submit);
        submit.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this,"Employee Details\nEmployee ID: " + id.getText() + "\nName: " + name.getText() + "\nDepartment: " + department.getText() + "\nSalary: " + salary.getText());
    }
    public static void main(String[] args) {
        new EmployeeRegistration();
    }
}