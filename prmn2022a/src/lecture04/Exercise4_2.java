package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {
        ATM a = new ATM();

        if(a.existsAccount("木村恭也","12345") != false){
            System.out.println("名前:" + a.accountList.get(0) + "口座番号:" + a.accountList.get(1)+ "は存在しません。");
        }

    }
}
