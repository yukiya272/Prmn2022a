package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        System.out.println("1つ目の整数を入力してください:");
        Scanner input = new Scanner(System.in);

        String num1 = input.nextLine();
        int number1 = Integer.parseInt(num1);

        System.out.println("2つ目の整数を入力してください:");
        String num2 = input.nextLine();
        int number2 = Integer.parseInt(num2);

        int sum = number1 + number2;

        System.out.println(number1 + " + " + number2 + " = " + sum);
    }
}
