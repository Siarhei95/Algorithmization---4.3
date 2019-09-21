package Question_3;
import java.util.Scanner;

public class question_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter the value of side: ");
        double side = scanner.nextDouble();
        question_3 question_3 = new question_3();
        question_3.writeHexagonSquare(side);
    }
    private static double findHexagonSquare(double side) {
        double findHexagonSquare = Math.rint((3 * Math.sqrt(3)) / 2 * Math.pow(side, 2) * 100) / 100;
        return findHexagonSquare;
    }
    private void writeHexagonSquare(double side) {
        System.out.println("Square of Hexagon: " + findHexagonSquare(side));
    }
}


