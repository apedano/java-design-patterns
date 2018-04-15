package apedano.designPatterns.behavioral.chainResponsibility;

/**
 * Created by Alex on 15/04/2018.
 */
public class Loan {
    private Float amount;

    public Loan(Float amount) {
        this.amount = amount;
    }

    public Float getAmount() {
        return amount;
    }

}
