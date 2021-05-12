package lab12_3;

import java.util.List;

public interface IExpression {


    static boolean isOperator(String op) {
        return op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/");
    }

    public static double evaluate(String postfixExpression) throws ExpressionException {
        // vegeredmeny
        String[] exprItems = postfixExpression.split(" ");
        Stack stack = new Stack(10);
        for (String expr : exprItems) {
            //vagy szam
            if (isOperator(expr.trim())) {
                double utolso = 0;
                try {
                    utolso = stack.top();
                    stack.pop();
                    double utolsoelotti = stack.top();
                    stack.pop();
                    double result = 0;
                    switch (expr.trim()) {
                        case "+":
                            result = utolsoelotti + utolso;
                            break;
                        case "-":
                            result = utolsoelotti - utolso;
                            break;
                        case "*":
                            result = utolsoelotti * utolso;
                            break;
                        case "/":
                            result = utolsoelotti / utolso;
                            break;
                    }
                    stack.push(result);

                } catch (SatckException e) {
                    //e.printStackTrace();
                    throw new ExpressionException("WRONG POSTFIX EXPRESSION");
                }
                //vagy muvelet
            } else {
                try {
                    double value = Double.parseDouble(expr.trim());
                    stack.push(value);
                } catch (NumberFormatException ex) {
                    throw new ExpressionException("WRONG OPERAND");
                } catch (SatckException e) {
                    //e.printStackTrace();
                }
            }
        }


        double finalResult = 0;
        try {
            finalResult = stack.top();
            stack.pop();
        } catch (
                SatckException e) {
          //  e.printStackTrace();
        }

        return finalResult;

    }


    class ExpressionException extends Exception {

        public ExpressionException(String message) {
            super(message);
        }
    }

}