import java.util.Scanner;   //Importing the Scanner Class
class Main {
    public static void prompt(){System.out.println("Enter a number");}    
    public static int parse(String a){int b = Integer.parseInt(a);    
        return b;
    }   //Convert string to number method

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);    

        System.out.println("Addition, Subtraction, Multiplication, Division?");
        String type = scan.nextLine();

        if (type.equals("Addition")){
            prompt();
            String num1 = scan.nextLine();
            prompt();
            String num2 = scan.nextLine();
            System.out.println(parse(num1) + parse(num2));
        }
        else if (type.equals("Subtraction")) {
            prompt();
            String num1 = scan.nextLine();
            prompt();
            String num2 = scan.nextLine();
            System.out.println(parse(num1) - parse(num2));
        }
        else if (type.equals("Multiplication")) {
            prompt();
            String num1 = scan.nextLine();
            prompt();
            String num2 = scan.nextLine();
            System.out.println(parse(num1) * parse(num2));
        }
        else if (type.equals("Division")) {
            prompt();
            String num1 = scan.nextLine();
            prompt();
            String num2 = scan.nextLine();
            System.out.println(parse(num1) / parse(num2));
        }

    }
}
