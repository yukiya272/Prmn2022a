package lecture04;

import java.util.ArrayList;

public class Account { 
    String name;
    String number;
    long balance;

    Account(String name , String number){
        this.name = name;
        this.number = number;
        this.balance = 0;
    }

    public Account(ArrayList<Account> accountList) {
    }
}
