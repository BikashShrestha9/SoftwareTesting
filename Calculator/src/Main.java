package Calculator.src;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends ScientificCalculator{
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        cal.add(2,4);
        cal.subtract(6,3);
        multi(4,5);
        division(4,4);
        areaOfCircle(6);
        areaOfTriangle(4,8);

    }
}