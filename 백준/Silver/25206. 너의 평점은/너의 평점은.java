import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalScore = 0; // 학점 * 점수의 합
        double totalCredits = 0; // 학점 총합

        for (int i = 0; i < 20; i++) {
            String[] input = sc.nextLine().split(" ");
            double credit = Double.parseDouble(input[1]);
            String grade = input[2];
            double gradeValue = 0;

            if (grade.charAt(0) == 'A') gradeValue = (grade.length() > 1 && grade.charAt(1) == '+') ? 4.5 : 4.0;
            else if (grade.charAt(0) == 'B') gradeValue = (grade.length() > 1 && grade.charAt(1) == '+') ? 3.5 : 3.0;
            else if (grade.charAt(0) == 'C') gradeValue = (grade.length() > 1 && grade.charAt(1) == '+') ? 2.5 : 2.0;
            else if (grade.charAt(0) == 'D') gradeValue = (grade.length() > 1 && grade.charAt(1) == '+') ? 1.5 : 1.0;
            else if (grade.charAt(0) == 'F') gradeValue = 0;
            else if (grade.charAt(0) == 'P') credit = 0; 

            totalCredits += credit;
            totalScore += credit * gradeValue;
        }
        sc.close();
        System.out.printf("%.6f\n", totalCredits == 0 ? 0.0 : totalScore / totalCredits);
    }
}