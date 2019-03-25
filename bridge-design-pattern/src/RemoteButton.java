public abstract class RemoteButton {
    private EntertainmentDevice theDevice;

    public RemoteButton(EntertainmentDevice newDevice) {
        this.theDevice = newDevice;
    }

    // bridge
    public void buttonFivePressed() {
        theDevice.buttonFivePressed();
    }

    public void buttonSixPressed() {
        theDevice.buttonSixPressed();
    }

    public void deviceFeedback() {
        theDevice.deviceFeedback();
    }

    public abstract void buttonNinePressed();
}
