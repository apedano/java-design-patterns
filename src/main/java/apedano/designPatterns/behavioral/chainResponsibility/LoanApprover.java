package apedano.designPatterns.behavioral.chainResponsibility;

/**
 * Created by Alex on 15/04/2018.
 */
public interface LoanApprover {
    public void approveLoan(Loan l);

    public void setNextApprover(LoanApprover loanApprover);


}
