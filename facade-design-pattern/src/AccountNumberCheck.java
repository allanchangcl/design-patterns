public class AccountNumberCheck {
    private int accountNumber = 12345678;

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean accountActive(int acctNumberToCheck) {
        if (acctNumberToCheck == getAccountNumber()) {
            return true;
        } else {
            return false;
        }
    }
}
