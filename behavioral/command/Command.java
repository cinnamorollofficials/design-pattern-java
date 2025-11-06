public interface Command {
    void execute();
    default void undo() {
        throw new UnsupportedOperationException("Undo not implemented");
    }
}
