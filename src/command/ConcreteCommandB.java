package command;

public class ConcreteCommandB implements Command {
    /*
    * This command does not supports undo operation as it changes the object state in a such a way '
    * that it can't be recovered.
    * */


    public void execute() {

    }
}
