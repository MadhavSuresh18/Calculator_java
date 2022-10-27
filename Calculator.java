package if_else;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int res=0;
        while (true){
            System.out.println("Enter operator");
        char op=in.next().trim().charAt(0);

        if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
            int a=in.nextInt();
            int b=in.nextInt();

            if(op=='+'){
                res=a+b;
            }
            if(op=='-'){
                res=a-b;
            }
            if(op=='*') {
                res = a * b;
            }
            if(op=='/'){
                if(b>0){
                    res=a/b;
                }
            }
            if(op=='%'){
                res=a%b;
            }

            }
        else if (op=='x' || op=='X'){
            break;
        }
        else {
            System.out.println("Invalid operation");
        }
            System.out.println("Answe="+res);
        }
    }

}
