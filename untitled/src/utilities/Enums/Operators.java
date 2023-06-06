package utilities.Enums;

public enum Operators {
    ADD('+', "addition", '+'),
    SUBTRACT('-', "subtraction", '-'),
    MULTIPLY('*', "multiplication", 'x');

    private final char operator;
    private final String name;
    private final char display;

    Operators(char operator, String name, char display) {
        this.operator = operator; this.name = name;
        this.display = display;
    }

    public char getOperator() {
        return operator;
    }
    public boolean isOperator(String operator) {
        return operator.charAt(0) == this.operator;
    }

    public static boolean isStringOperator(String operator) {
        for(Operators op : Operators.values()) {
            if(op.isOperator(operator)) {
                return true;
            }
        }
        return false;
    }

    public static Operators getCorrectOperator(String operator) {
        for(Operators op : Operators.values()) {
            if(op.isOperator(operator)) {
                return op;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public char getDisplay() {
        return display;
    }
}
