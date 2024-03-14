package Calculator.src;

public class ScientificCalculator extends Calculator{
    ScientificCalculator(){

    }
    final double pie= 3.141;
    static void areaOfCircle(int a){
        ScientificCalculator scientificCalculator= new ScientificCalculator();
        System.out.println("Area of circle of  "+a+" cm radius = "+scientificCalculator.pie*a*a+" cm^2");
    }
    static void areaOfTriangle(int h, int b){
        System.out.println("Area of height "+h+" cm and base "+b+" cm triangle = "+ 0.5*h*b +" cm^2");
    }

}