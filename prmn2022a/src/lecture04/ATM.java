package lecture04;

import javax.xml.namespace.QName;
import java.util.ArrayList;

public class ATM {
    ArrayList<Account> accountList  = new ArrayList<>();

    ATM(){

        }

    void registerAccount(String name , String number){
        accountList.add(new Account(name,number));
 //       System.out.println(+ "さんのアカウントを口座番号:" + + "で登録しました");

    }

    boolean existsAccount(String name , String number){
          return accountList.indexOf(name) > 0 && accountList.indexOf(number) > 0;
    }

    void deposit(String number , long money){

    }

  //  long withdraw(String number , long money){
  //  }


    }

