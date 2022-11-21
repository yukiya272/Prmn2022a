package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("何行分入力しますか?");
        int n = input.nextInt();input.nextLine();
        ArrayList<String> list = new ArrayList<>();

        for(int i = 1 ; i < n + 1 ; i++){
            System.out.println(i + "行目:");
            String moji = input.nextLine();
            list.add(moji);
        }

        System.out.println("入力した文字列");
        for(String string : list){
            System.out.println("[" + list.indexOf(string) + "]" + string);
        }
    }
}
