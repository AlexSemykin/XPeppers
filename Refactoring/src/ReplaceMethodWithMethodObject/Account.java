package ReplaceMethodWithMethodObject;

public class Account {
    int gamma(int inputVal, int quantity, int yearToDate) {
        return new GammaCalculator(this, inputVal, quantity, yearToDate).compute();
    }

    public int delta() {
        return 0;
    }
}
