package ChainOfResponsibility;

import java.time.LocalDate;

public class Client {

	public static void main(String[] args) {
		LeaveApplication leaveApplication = LeaveApplication.getBuilder().withType(LeaveApplication.Type.PTO)
				.from(LocalDate.now()).to(LocalDate.of(2020, 07, 27)).build();
	   	LeaveApprover leaveApprover = createChain();
	   	System.out.println(leaveApplication);
		leaveApprover.processLeaveApplication(leaveApplication);
		System.out.println(leaveApplication.getProcessedBy());
	}

	private static LeaveApprover createChain() {
		Director director = new Director(null);
		Manager manager = new Manager(director);
		ProjectLead projectLead = new ProjectLead(manager);
		return projectLead;
	}

	
}
