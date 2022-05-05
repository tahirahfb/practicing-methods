public class AverageMethod {
    public static void main(String[] args){
        System.out.println("The average is: " + average(2, 5, 8));
    }

    public static double sum(double numOne, double numTwo, double numThree){

        return numOne + numTwo + numThree;
    }

    public static double average(double numUno, double numDos, double numTres){

        return sum(numUno, numDos, numTres) / 3.0;

    }
}
