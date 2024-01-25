import java.time.LocalDate;
public class Income {
    //Adding the fields
    private int incomeId;
    private double incomeAmt;
    private LocalDate incomeDate;

    //Adding the constructor
    public Income(int incomeId, double incomeAmt, LocalDate incomeDate) {
        this.incomeId = incomeId;
        this.incomeAmt = incomeAmt;
        this.incomeDate = incomeDate;
    }

    //Adding getter and setter methods
public int getIncomeId() {
    return incomeId;
}
public void setIncomeId(int incomeId) {
    this.incomeId = incomeId;
}
public double getIncomeAmt(double incomeAmt){
return incomeAmt;
}

public void setIncomeAmt(double incomeAmt){
this.incomeAmt = incomeAmt;
}

public LocalDate getIncomeDate(){
return incomeDate;
}
public void setIncomeDate(LocalDate incomeDate){
this.incomeDate = incomeDate;
}
    
}
