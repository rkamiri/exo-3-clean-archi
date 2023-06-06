package utilities.argsChecker;

import utilities.Enums.Operators;

public class ArgsChecker implements IArgsChecker {
    @Override
    public boolean correctArgs(String[] args) {
        if (args.length != 2) {
            return false;
        }
        String filePath = args[0];
        String operation = args[1];
        return filePath.endsWith(".txt") && (operation.length() == 1) && Operators.isStringOperator(operation);
    }

    @Override
    public Operators getOperation(String operation) {
        return Operators.getCorrectOperator(operation);
    }
}
