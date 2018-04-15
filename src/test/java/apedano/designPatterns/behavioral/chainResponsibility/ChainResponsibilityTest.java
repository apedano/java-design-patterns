package apedano.designPatterns.behavioral.chainResponsibility;

import org.junit.Before;
import org.junit.Test;

/**
 * Chain of responsibility decouples the client that send requests (Loan) and the receiver (LoanApprover)
 * Internally the receiver interface has multiple implementations in chain. The request traverse che chain
 * until the handler for the specific request is founded
 */
public class ChainResponsibilityTest {

    private LoanApprover mainLoanApprover = null;

    @Before
    public void setUp(){
        mainLoanApprover = new Manager();
        Director director = new Director();
        director.setNextApprover(new President());
        mainLoanApprover.setNextApprover(director);
    }

    @Test
    public void approvedByManager(){
        Loan loan = new Loan(2000.0f);
        mainLoanApprover.approveLoan(loan);
    }

    @Test
    public void approvedByDirector(){
        Loan loan = new Loan(20000.0f);
        mainLoanApprover.approveLoan(loan);
    }

    @Test
    public void approvedByPresident(){
        Loan loan = new Loan(2000000.0f);
        mainLoanApprover.approveLoan(loan);
    }
}
