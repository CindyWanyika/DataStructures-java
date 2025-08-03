package Question4;

public class Main {
    public static void main(String[] args){
        String t=ExpressionEvaluator.infixToPostfix("A*(B+C)/D");
        System.out.println("Expected: ABC+*D/");
        System.out.println("Actual: "+t);
        System.out.println(ExpressionEvaluator.evaluatePostfix("231*+9-"));
    }
}
