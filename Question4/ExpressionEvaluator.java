package Question4;


public class ExpressionEvaluator {
    //define precedence for the operators(*/+-^)
    public static int precedence(char operator){
        if(operator=='^')return 3;
        else if (operator=='/'||operator=='*')return 2;
        else if(operator=='+'||operator=='-')return 1;
        else return -1;
    }
    public static String infixToPostfix(String expression){
        //a stack to collect the operators
        Stack<Character> operators=new Stack<>();
        //a stringbuilder to collect output postfix
        StringBuilder postfix=new StringBuilder();
        //iterate over the array of characters in your input string
        for(char val:expression.toCharArray()){
            if (Character.isLetterOrDigit(val))postfix.append(val);
            else if(val=='(')operators.push(val);
            //if you find a closing parenthesis,pop until you encounter the next parenthesis
            else if(val == ')'){
                while(!operators.isempty()&&operators.peek()!='('){
                    postfix.append(operators.pop());
                }
                operators.pop();
            }
            else{
                while(!operators.isempty()&&precedence(val)<=precedence(operators.peek())){
                    postfix.append(operators.pop());
                }
                operators.push(val);

            }
        }
        while(!operators.isempty())postfix.append(operators.pop());
        return postfix.toString();
    }

    public static int evaluatePostfix(String postfixOperation){
        Stack<Integer> operands=new Stack<>();
        for(char val:postfixOperation.toCharArray()){
            if(Character.isLetterOrDigit(val)){
                int num=Integer.parseInt(String.valueOf(val));
                operands.push(num);
            }
            else{
                int val1=operands.pop();

                int val2=operands.pop();
                int t=0;
                if(val=='+')t=val1+val2;
                else if(val=='-')t=val2-val1;
                else if(val=='*')t=val2*val1;
                else if(val=='/')t=val2/val1;
                operands.push(t);
            }
        }
        return operands.pop();
    }
}
