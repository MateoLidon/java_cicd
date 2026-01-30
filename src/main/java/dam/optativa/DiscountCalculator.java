package dam.optativa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DiscountCalculator {

    public double calculate(double price, boolean isStudent) {
    double desc;

        if (isStudent) {
            desc = 0.20;
        } else {
            desc = 0.05;
        }

        return price - (price * desc);
    }
}