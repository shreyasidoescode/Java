import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BankBalance extends JFrame implements ActionListener {
    JTextField balance, amount, result;
    JButton deposit, withdraw;
    double currentBalance;
    BankBalance() {
        setTitle("Bank Balance Calculator");
        setSize(350,250);
        setLayout(new GridLayout(4,2));
        add(new JLabel("Initial Balance:"));
        balance = new JTextField();
        add(balance);
        add(new JLabel("Transaction Amount:"));
        amount = new JTextField();
        add(amount);
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        add(deposit);
        add(withdraw);
        add(new JLabel("Updated Balance:"));
        result = new JTextField();
        result.setEditable(false);
        add(result);
        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        double b;
        if (result.getText().isEmpty())
            b = Double.parseDouble(balance.getText());
        else
            b = currentBalance;
        double a = Double.parseDouble(amount.getText());
        if (e.getSource() == deposit)
            currentBalance = b + a;
        else
            currentBalance = b - a;
        result.setText(String.valueOf(currentBalance));
        balance.setText(String.valueOf(currentBalance));
        amount.setText("");
    }
    public static void main(String[] args) {
        new BankBalance();
    }
}