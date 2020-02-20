public class LibSigner {
    private int daysLeft;

    public int getLibNumber() {
        return libNumber;
    }

    public void setLibNumber(int libNumber) {
        this.libNumber = libNumber;
    }

    private int libNumber;

    public void signLibrary(int totalDays, int libNumber) {
        daysLeft = totalDays;
        this.libNumber = libNumber;
    }

    public boolean incrementAndCheckEmpty() {
        daysLeft -= 1;
        return daysLeft == 0;
    }
}
