import jdk.jshell.spi.ExecutionControl;

import java.util.NoSuchElementException;

public class SourceStub implements Source {
    @Override
    public char getChar() {
        return '\n';
    }
}
