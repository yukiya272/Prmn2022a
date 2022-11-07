package lecture01;

public class kadai15 {
    public static void main(String[] args) {
        int[] score = {41,85,72,38,80};
        int i,Min,Max;
        double ave;

        for(i = 0;i < score.length;i++){
            if(score[i] >= 90){
                System.out.println(i + "番 " + score[i] + "点 " +"秀");
            }
            else if(score[i] >=80){
                System.out.println(i + "番 " + score[i] + "点 " +"優");
            }
            else if(score[i] >= 70){
                System.out.println(i + "番 " + score[i] + "点 " +"良");
            }
            else if(score[i] >= 60){
                System.out.println(i + "番 " + score[i] + "点 " +"可");
            }
            else{
                System.out.println(i + "番 " + score[i] + "点 " +"不可");
            }
        }

        Max = max(score);
        Min = min(score);
        ave = average(score);

        System.out.println("最高点:" + Max + "点");
        System.out.println("最低点:" + Min + "点");
        System.out.println("平均点:" + ave + "点");
    }

    static int min(int[] score){
        int i,min;
        min = score[0];
        for(i=1;i < score.length;i++){
            if(min > score[i]){
                min = score[i];
            }
        }
        return min;
    }

    static int max(int[] score){
        int i,max;
        max = score[0];
        for(i = 1;i < score.length;i++){
            if(max < score[i]){
                max = score[i];
            }
        }
        return max;
    }

    static double average(int[] score){
        int i,sum;
        double ave;
        sum = 0;
        for(i = 0;i < score.length;i++){
            sum = sum + score[i];
        }
        ave = (double)sum / score.length;
        return ave;
    }
}

