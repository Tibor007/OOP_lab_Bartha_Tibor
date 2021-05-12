package lab12_3;

public class Main {
    public static void main(String[] args) {
        String expressions[] = {
                "1 2 + 3 2 + * ", //15
                "1 2 + +", // wrong postfix
                "1 a +", // wrong operand
                "1 2,3 *", // wrong operand
                "1 3 /"}; // 0.33
        for (String expr : expressions) {
            try {
                System.out.println("Eval(" + expr + "): " +
                        IExpression.evaluate(expr));
            } catch (IExpression.ExpressionException e) {
                System.out.println("Wrong expression: " + expr);
                System.out.println("\t" + e.getMessage());
            }
        }
    }

}

