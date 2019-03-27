public class ATMMachine {
    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;

    ATMState atmState;

    int cashInMachine = 2001;
    boolean correctPinEntered = false;

    public ATMMachine() {
        this.hasCard = new HasCard(this);
        this.noCard = new NoCard(this);
        this.hasCorrectPin = new HasPin(this);
        this.atmOutOfMoney = new NoCash(this);
        atmState = noCard;
        if (cashInMachine < 0) {
            atmState = atmOutOfMoney;

        }
    }

    public void setAtmState(ATMState atmState) {
        this.atmState = atmState;
    }

    public void setCashInMachine(int cashInMachine) {
        this.cashInMachine = cashInMachine;
    }

    public ATMState getHasCard() {
        return hasCard;
    }

    public ATMState getNoCard() {
        return noCard;
    }

    public ATMState getHasCorrectPin() {
        return hasCorrectPin;
    }

    public ATMState getAtmOutOfMoney() {
        return atmOutOfMoney;
    }

    public void insertCard() {
        atmState.insertCard();

    }

    public void ejectCard() {
        atmState.ejectCard();

    }

    public void requestCash(int cashToWithdraw) {
        atmState.requestCash(cashToWithdraw);

    }

    public void insertPin(int pinEntered) {
        atmState.insertPin(pinEntered);

    }
}
