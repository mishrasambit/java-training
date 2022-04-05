import java.util.Scanner;
class SwitchCase{
    public static void main(String[] args){
        //take two number num1 & num2
        //take one arithmatic operator(+, -,*, /, %)
        //if operator is equal to +
            //result = num1 + num2  "+" "add"
        //if operator is equal to -
            //result = num1 - num2
        //    .......
        //print result
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number");        
        int num1 = scan.nextInt();
        System.out.println("Enter 2nd number");  
        int num2 = scan.nextInt();
        System.out.println("Enter the operation like + - / * or %");
        char operator = scan.next().charAt(0);
        int result;
        switch(operator){
            case '+' : result = num1 + num2;
            break;
            case '-' : result = num1 - num2;
            break;
            case '*' : result = num1 * num2;
            break;
            case '/' : result = num1 / num2;
            break;            
            case '%' : result = num1 % num2;
            break;
            default: result = -1;
                    System.out.println("Invalid operator");
        }
        System.out.println("result is ::"+result);
        /*if(operator == '+'){
            result = num1 + num2;
        }else if(operator == '-'){
            result = num1 - num2;
        }else if(operator == '*')
            result = num1 * num2;
        else if(operator == '/')
            result = num1 / num2;
        else{
            System.out.println("Invalid Operator");
            result = -1;
        }
        System.out.println("resutlsfasdfas is ::"+result);*/
        
        /*if(operator == '+'){
            result = num1 + num2;
        }else {
            if(operator == '-'){
                result = num1 - num2;
            }else{
                if(operator == '*'){
                    result = num1 * num2;
                }else{
                    if(operator == '/'){
                        result = num1 /num2;
                    }else{
                        System.out.println("invalid operation");
                        result = -1;
                    }
                }
            }
        }*/
        //System.out.println("result is "+result);
    }
}