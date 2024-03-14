package Calculator.src;

public class Calculator {
    void add(int a, int b){
        System.out.println("Addition of "+a +"and"+b +"= "+(a+b));

    }
    void subtract(int a, int b){
        System.out.println("Subtraction of "+a+"and" +b+"="+(a-b));
    }
    static void division(int a, int b){
        System.out.println("Division "+a+"/"+b+"="+(a/b));
    }
    static void multi(int a, int b){
        System.out.println("Multiplication of "+a+"and"+b+"="+(a*b));
    }
}
