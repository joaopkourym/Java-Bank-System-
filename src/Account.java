import javax.swing.JOptionPane;

public class Account {
    //Declaring account variables
    private String email, depositStr, transferenceStr, pinPasswordStr;
    private Integer pinPassword;
    private double balance = 1000, deposit, transference;

    //Declaring menu variables
    private String[] options = {"Create an account", "Deposit", "Transfer", "Check balance", "Exit"};
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

    //Make a transfer from user's account
    public void transfer() {
        JOptionPane.showMessageDialog(null, "You chose Transfer!");
                transferenceStr = JOptionPane.showInputDialog(null, "Enter the value you want to transfer: ");
                transference = Double.parseDouble(transferenceStr);
                if (transference > balance) {
                    JOptionPane.showMessageDialog(null, "You don't have enough money to make a transference!");
                } else if (transference <= balance)  {
                    balance -= transference;
                    JOptionPane.showMessageDialog(null, "Transfer successful!\nNew balance: $" + balance);
                }
    }

    //Checks the account balance 
    public void checkBalance() {
        JOptionPane.showMessageDialog(null, "You chose Check balance!");
        JOptionPane.showMessageDialog(null, "Your current balance: $" + balance);
    }
}
