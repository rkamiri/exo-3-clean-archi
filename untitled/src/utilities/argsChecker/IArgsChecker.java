package utilities.argsChecker;

import utilities.Enums.Operators;

public interface IArgsChecker {
    boolean correctArgs(String[] args);
    Operators getOperation(String operation);
}
