package utilities.output;

public class WriteOutput implements IWriteOutput {
    @Override
    public void writeIteration(String currentNumber, char operator, String lastResult) {
        System.out.println(operator + currentNumber + " (=" + lastResult + ")");
    }

    @Override
    public void writeFirstIteration(String currentNumber) {
        System.out.println(" " + currentNumber);
    }

    @Override
    public void writeFinalResult(String output, String operator) {
        System.out.println("-------");
        System.out.println("total = " + output + " (" + operator + ")");
    }

    @Override
    public void writeOutput(String output) {
        System.out.println(output);
    }
}
