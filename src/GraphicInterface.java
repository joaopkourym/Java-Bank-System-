import javax.swing.JOptionPane;

public class GraphicInterface {
    public static void showOptionDialog() {
        boolean stayOpen = true;
        Account account = new Account();
   
    do {
        account.openMenu();

            switch (account.selection) {
                case 0 -> {//Create account
                    account.createAccount();
                }
                case 1 -> {//Deposit
                    account.deposit();
                }
                case 2 -> {//Transfer
                    account.transfer();
                }
                case 3 -> {//Check balance
                    account.checkBalance();
                }
                case 4 -> {//Exit
                    JOptionPane.showMessageDialog(null, "You chose exit, goodbye!");
                    stayOpen = false;
                }
            }
    
    } while (stayOpen == true);
    }
}