package ReplaceMethodWithMethodObject;

public class GammaCalculator {

    private Account _account;
    private int inputVal;
    private int quantity;
    private int yearToDate;
    private int importantValue1;
    private int importantValue2;
    private int importantValue3;

    GammaCalculator(Account source, int inputValArg, int quantityArg, int yearToDateArg) {
        _account = source;
        inputVal = inputValArg;
        quantity = quantityArg;
        yearToDate = yearToDateArg;
    }

    int compute(){
        importantValue1 = (inputVal * quantity) + _account.delta();
        importantValue2 = (inputVal * yearToDate) + 100;
        importantThing();
        importantValue3 = importantValue2 * 7;

        return importantValue3 - 2 * importantValue1;
    }

    private void importantThing() {
        if ((yearToDate - importantValue1) > 100)
            importantValue2 -= 20;
    }

}
