import java.time.LocalDate;
public class Goals {
    //Adding the fields
    private int goalId;
    private double goalAmt;
    private boolean target;
    private double currAmt;
    private String goalName;
    private LocalDate goalDate;

//Adding the constructor
    public Goals(int goalId, double goalAmt, boolean target, double currAmt, String goalName, LocalDate goalDate) {
        this.goalId = goalId;
        this.goalAmt = goalAmt;
        this.target = target;
        this.currAmt = currAmt;
        this.goalName = goalName;
        this.goalDate = goalDate;
    }

    //Adding getter and setter methods
    public int getGoalId() {
        return goalId;
    }

    public void setGoalId(int goalId) {
        this.goalId = goalId;
    }

    public double getGoalAmt() {
        return goalAmt;
    }

    public void setGoalAmt(double goalAmt) {
        this.goalAmt = goalAmt;
    }

    public boolean isTarget() {
        return target;
    }

    public void setTarget(boolean target) {
        this.target = target;
    }

    public double getCurrAmt() {
        return currAmt;
    }

    public void setCurrAmt(double currAmt) {
        this.currAmt = currAmt;
    }

    public String getGoalName() {
        return goalName;
    }

    public void setGoalName(String goalName) {
        this.goalName = goalName;
    }

    public LocalDate getGoalDate() {
        return goalDate;
    }

    public void setGoalDate(LocalDate goalDate) {
        this.goalDate = goalDate;
    }
}
