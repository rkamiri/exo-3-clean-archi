package Calculator;

import utilities.Enums.Operators;
import utilities.output.IWriteOutput;

import java.util.List;

public class Calculator {
    List<Integer> numbers;
    Operators operator;
    IWriteOutput outputWriter;
    int result;

    public Calculator(List<Integer> numbers, Operators operator, IWriteOutput outputWriter) {
        this.numbers = numbers;
        this.operator = operator;
        this.outputWriter = outputWriter;
    }

    public void calculate() {
        this.result = numbers.get(0);
        this.outputWriter.writeFirstIteration(String.valueOf(result));
        numbers.remove(0);
        for (int number: numbers) {
            calculateIteration(number);
        }
        this.outputWriter.writeFinalResult(String.valueOf(this.result), operator.getName());
    }

    public void calculateIteration(int iterationNumber) {
        switch (operator) {
            case ADD -> this.result = this.result + iterationNumber;
            case SUBTRACT -> this.result = this.result - iterationNumber;
            case MULTIPLY -> this.result = this.result * iterationNumber;
        }
        outputWriter.writeIteration(String.valueOf(iterationNumber), operator.getDisplay(), String.valueOf(result));
    }

}
