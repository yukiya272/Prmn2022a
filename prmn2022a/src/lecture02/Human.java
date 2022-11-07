package lecture02;

import javax.xml.namespace.QName;

public class Human {
    String name;
    int age;

    Human(String name,int age){
        this.name = name;
        this.age = age;
    }

    void print(){
        if(age <= 18){
            System.out.println("生徒:" + name + "" + age + "歳です。");
        }
        else if(age <= 22){
            System.out.println("学生:" + name + "" + age + "歳です。");
        }
        else{
            System.out.println(name + "" + age + "歳です。");
        }
    }
}
