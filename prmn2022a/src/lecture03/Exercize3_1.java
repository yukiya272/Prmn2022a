package lecture03;

import javax.swing.*;
import java.util.Scanner;

public class Exercize3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("任意の文字列を入力してください");
        String moji = input.nextLine();
        System.out.println("”" + moji+ "”と入力されました。");
    }
}
