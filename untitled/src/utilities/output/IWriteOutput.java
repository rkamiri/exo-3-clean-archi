package utilities.output;

import utilities.Enums.Operators;

public interface IWriteOutput {
    void writeIteration(String currentNumber, char operator, String lastResult);
    void writeFinalResult(String finalResult, String operator);
    public void writeFirstIteration(String currentNumber);
    void writeOutput(String output);
}
