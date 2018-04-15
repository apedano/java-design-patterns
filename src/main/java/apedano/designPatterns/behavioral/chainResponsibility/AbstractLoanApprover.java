package apedano.designPatterns.behavioral.chainResponsibility;

/**
 * Created by Alex on 15/04/2018.
 */
public abstract class AbstractLoanApprover implements LoanApprover {

    private LoanApprover nextLoanApprove;

    public void setNextApprover(LoanApprover loanApprover){
        this.nextLoanApprove = loanApprover;
    }

    @Override
    public void approveLoan(Loan l) {
        if(l.getAmount() < getLoanLimit()){
            System.out.println(String.format("Approver %s can approve the loan! %f load approved", getLoanApproverName(), l.getAmount()));
        } else {
            System.out.printf("Approver %s cannot approve the loan. Passing the request to the next approver\n" , getLoanApproverName());
            this.nextLoanApprove.approveLoan(l);
        }
    }

    protected Float getLoanLimit() {
        return 0.0f;
    }

    protected String getLoanApproverName(){
        return "DEFUALT";
    };
}
