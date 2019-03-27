public class HasCard implements ATMState {
    ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can't enter more than one card");
    }

    @Override
    public void ejectCard() {
        System.out.println("You Card Ejected");
        atmMachine.setAtmState(atmMachine.getNoCard());
    }

    @Override
    public void insertPin(int pinEntered) {
        if (pinEntered == 1234) {
            System.out.println("You entered the correct PIN");
            atmMachine.correctPinEntered = true;
            atmMachine.setAtmState(atmMachine.getHasCorrectPin());
        } else {
            System.out.println("You entered the wrong PIN");
            atmMachine.correctPinEntered = false;
            System.out.println("Your card is ejected");
            atmMachine.setAtmState(atmMachine.getNoCard());
        }
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("You have not entered your PIN");
    }
}
