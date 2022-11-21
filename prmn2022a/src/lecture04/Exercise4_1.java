package lecture04;

public class Exercise4_1 {
    public static void main(String[] args) {
        Fighter f1 = new Fighter(50,5,"Fighter1");
        Fighter f2 = new Fighter(60,4,"Fighter2");

        System.out.println(f1.getName() + "VS" + f2.getName());
        System.out.println(f1.getName() + "のhitpoint:" + f1.getHitPoint());
        System.out.println(f2.getName() + "のhitpoint:" + f2.getHitPoint());

        while(true){
            f1.attack(f2);
            f2.setHitPoint(f2.getHitPoint());
            System.out.println(f2.getName() + "の残りhitPoint:" + f2.getHitPoint());
            if(f2.isAlive() == false){
                System.out.println(f2.getName() + "は倒れた。");
                break;
            }

            f2.attack(f1);
            f1.setHitPoint(f1.getHitPoint());
            System.out.println(f1.getName() + "の残りhitPoint:" + f1.getHitPoint());
            if(f1.isAlive() == false){
                System.out.println(f1.getName() + "は倒れた");
                break;
            }

        }

    }
}
