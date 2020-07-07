package ChainOfResponsibility;

//A concrete handler
public class ProjectLead extends Employee {
    private final int ARROVAL_DURATION = 2;

    public ProjectLead(LeaveApprover successor) {
        super("Project Lead", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication leaveApplication) {
        // type of leave is sick leave and duration of leave is less than 2 days;
        if (leaveApplication.getType() == LeaveApplication.Type.Sick && leaveApplication.getNoOfDays() <= ARROVAL_DURATION) {
            leaveApplication.approve(this.getApproverRole());
            return true;
        }
        return false;
    }
}
