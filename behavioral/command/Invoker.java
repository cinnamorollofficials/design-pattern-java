import java.util.Stack;

public class Invoker {
    private final Stack<Command> history = new Stack<>();

    public void run(Command cmd) {
        cmd.execute();
        history.push(cmd);
    }

    public void undoLast() {
        if (history.isEmpty()) {
            System.out.println("No commands to undo.");
            return;
        }
        Command last = history.pop();
        last.undo();
    }
}
