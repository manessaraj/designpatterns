package command;

//A Concrete implementation of Command.
public class AddMemberCommand implements Command{

    private String emailAddress;
    private String listName;
    // Reciever object
    private EWSService reciever;


    public AddMemberCommand(EWSService service, String emailAddress, String listName) {
        this.reciever = service;
        this.emailAddress = emailAddress;
        this.listName = listName;
    }

    @Override
    public void execute() {
        this.reciever.addMember(emailAddress, listName);
    }
}
