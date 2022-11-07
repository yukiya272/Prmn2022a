package lecture01;

public class kadai14 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int i, sum = 0;

        //繰り返し処理の回数が定かであるためforを使う
        for (i = 0; i < array.length; i++) {
            array[i] = i + 1;
            if (i % 2 == 0) {
                sum = sum + array[i];
            }
        }

        System.out.println("合計 = " + sum);
    }
}
