import java.text.DecimalFormat;

public class DivideMethod {
    public static void main(String[] args) throws Exception {
       
        divide(1, 3);
    }

    public static void divide(double numOne, double numTwo){
        DecimalFormat df = new DecimalFormat("0.00");

        double quotient = numOne / numTwo;

        System.out.println(numOne + " / " + numTwo + " = " + df.format(quotient));
    }
}
