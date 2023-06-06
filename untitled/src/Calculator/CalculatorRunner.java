package Calculator;

import utilities.Enums.Operators;
import utilities.argsChecker.IArgsChecker;
import utilities.fileChecker.IFileChecker;
import utilities.fileReader.IFileReader;
import utilities.output.IWriteOutput;
import utilities.output.WriteOutput;

import java.io.File;
import java.util.List;

public class CalculatorRunner {
    final IArgsChecker argsChecker;
    final IFileChecker fileChecker;
    final IFileReader fileReader;
    final IWriteOutput writeOutput;
    final String[] args;

    public CalculatorRunner(IArgsChecker argsChecker, IFileChecker fileChecker, IFileReader fileReader, IWriteOutput writeOutput, String[] args) {
        this.argsChecker = argsChecker;
        this.fileChecker = fileChecker;
        this.fileReader = fileReader;
        this.writeOutput = writeOutput;
        this.args = args;
    }

    public void run() {

        if(argsChecker.correctArgs(args)) {
            String filePath = args[0];
            String operation = args[1];
            if(fileChecker.fileExists(filePath)) {
                File file = fileChecker.getFile(filePath);
                List<Integer> numbers = fileReader.readFile(file);
                Operators operator = argsChecker.getOperation(operation);
                new Calculator(numbers, operator, writeOutput).calculate();
            }
        }
    }

}
