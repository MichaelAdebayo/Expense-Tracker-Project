import java.time.LocalDate;
public class Expenses {
    
    
    //Adding the fields
    private int expenseId;
    private double expenseAmt;
    private LocalDate expenseDate;
    
//Adding the constructor
    public Expenses(int expenseId, double expenseAmt, LocalDate expenseDate) {
        this.expenseId = expenseId;
        this.expenseAmt = expenseAmt;
        this.expenseDate = expenseDate;
    }
    
//Adding getter and setter methods
    public int getExpenseId(int expenseId ) {
        return expenseId;
    }
    
    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }

    public double getExpenseAmt(double expenseAmt){
        return expenseAmt;
    }

    public void setExpenseAmt(double expenseAmt){
        this.expenseAmt = expenseAmt;
    }

    public LocalDate getExpenseDate(){
        return expenseDate;
    }
    public void setExpenseDate(LocalDate expenseDate){
        this.expenseDate = expenseDate;
    }
}
