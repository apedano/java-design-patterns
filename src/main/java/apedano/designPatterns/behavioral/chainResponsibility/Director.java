package apedano.designPatterns.behavioral.chainResponsibility;

/**
 * Created by Alex on 15/04/2018.
 */
public class Director extends AbstractLoanApprover implements LoanApprover {

    @Override
    protected Float getLoanLimit() {
        return 500000.0f;
    }

    @Override
    protected String getLoanApproverName() {
        return "Director";
    }

}
