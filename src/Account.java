import javax.swing.JOptionPane;

public class Account {
    //Declaring account variables
    private String email, depositStr, withdrawStr, pinPasswordStr;
    private Integer pinPassword;
    private double balance = 1000, deposit, withdraw;

    //Declaring menu variables
    private String[] options = {"Create an account", "Deposit", "Withdraw", "Check balance", "Exit"};
    public int selection;
        
    //Open the menu 
    public void openMenu() {
        selection = JOptionPane.showOptionDialog(
        null, 
        "Welcome to the bank system!\nChoose an option:", 
        "Bank system", 
        JOptionPane.DEFAULT_OPTION, 
        JOptionPane.INFORMATION_MESSAGE, 
        null, 
        options, 
        options[0]
        );
    }

    //Create an account 
    public void createAccount() {
        JOptionPane.showMessageDialog(null, "You chose Create Account!");
                email = JOptionPane.showInputDialog(null, "Enter your email: ");
                pinPasswordStr = JOptionPane.showInputDialog(null, "Enter your pin password (Only numbers): ", "Password", JOptionPane.QUESTION_MESSAGE);
                pinPassword = Integer.parseInt(pinPasswordStr);
                if (pinPassword instanceof Integer) {
                    JOptionPane.showMessageDialog(null, "Account successfully created!");
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR! ENTER VALID NUMBERS");
                }
    }

    //Make a deposit to user's account
    public void deposit() {
        JOptionPane.showMessageDialog(null, "You chose Deposit!");
                depositStr = JOptionPane.showInputDialog(null, "Enter the value you want to deposit: ");
                deposit = Double.parseDouble(depositStr);
                balance += deposit;
                JOptionPane.showMessageDialog(null, "Deposit successful!\nNew balance: $" + balance);
    }

    //Make a withdraw from user's account
    public void withdraw() {
        JOptionPane.showMessageDialog(null, "You chose Withdraw!");
                withdrawStr = JOptionPane.showInputDialog(null, "Enter the value you want to withdraw: ");
                withdraw = Double.parseDouble(withdrawStr);
                if (withdraw > balance) {
                    JOptionPane.showMessageDialog(null, "You don't have enough money to make a withdraw!");
                } else if (withdraw <= balance)  {
                    balance -= withdraw;
                    JOptionPane.showMessageDialog(null, "Withdraw successful!\nNew balance: $" + balance);
                }
    }

    //Checks the account balance 
    public void checkBalance() {
        JOptionPane.showMessageDialog(null, "You chose Check balance!");
        JOptionPane.showMessageDialog(null, "Your current balance: $" + balance);
    }
}
