package command;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		EWSService service = new EWSService();
		Command command1 = new AddMemberCommand(service, "a@a.com", "efrke ");
		MailTasksRunner.getInstance().addCommand(command1);
		Command c2 = new AddMemberCommand(service, "b@b.com", "spam");
		MailTasksRunner.getInstance().addCommand(c2);
		Thread.sleep(3000);
		MailTasksRunner.getInstance().shutdown();
	}

}
