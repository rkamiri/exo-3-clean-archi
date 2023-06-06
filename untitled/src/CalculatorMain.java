import Calculator.CalculatorRunner;
import utilities.argsChecker.ArgsChecker;
import utilities.argsChecker.IArgsChecker;
import utilities.fileChecker.FileChecker;
import utilities.fileChecker.IFileChecker;
import utilities.fileReader.CalculatorFileReader;
import utilities.fileReader.IFileReader;
import utilities.output.IWriteOutput;
import utilities.output.WriteOutput;

public class CalculatorMain {

    public static void main(String[] args) {
        IArgsChecker argsChecker = new ArgsChecker();
        IFileChecker fileChecker = new FileChecker();
        IFileReader fileReader = new CalculatorFileReader();
        IWriteOutput writeOutput = new WriteOutput();
        new CalculatorRunner(argsChecker, fileChecker, fileReader, writeOutput, args).run();
    }
}