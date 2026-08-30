package asgn18;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener {
    JTextField num1, num2, result;
    JButton add, subtract;
    Calculator() {
        setTitle("Calculator");
        setSize(300,250);
        setLayout(new GridLayout(4,2));
        add(new JLabel("First Number:"));
        num1 = new JTextField();
        add(num1);
        add(new JLabel("Second Number:"));
        num2 = new JTextField();
        add(num2);
        add = new JButton("Add");
        subtract = new JButton("Subtract");
        add(add);
        add(subtract);
        add(new JLabel("Result:"));
        result = new JTextField();
        result.setEditable(false);
        add(result);
        add.addActionListener(this);
        subtract.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(num1.getText());
        double b = Double.parseDouble(num2.getText());
        if (e.getSource() == add)
            result.setText(String.valueOf(a + b));
        else
            result.setText(String.valueOf(a - b));
    }
    public static void main(String[] args) {
        new Calculator();
    }
}