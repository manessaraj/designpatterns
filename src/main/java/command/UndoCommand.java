package command;

public interface UndoCommand extends Command{
    // Refined Abstraction: IDEA from adaptor pattern
    void undoOperation();
}
