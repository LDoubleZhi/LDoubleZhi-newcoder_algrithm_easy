package charactor;

import property.Item;

public abstract class Hero {
    public String name;
    public float hp;
    public int moveSpeed = 100;
    public int damage;
    public int price;

    class BattleScore {
        int kill;
        int die;
        int assit;

        public void legendary() {
            if (kill >= 8)
                System.out.println(name + "超神！");
            else
                System.out.println(name + "尚未超神！");
        }
    }

    public static void battleWin(){
        System.out.println("hero battle win");
    }

    public void kill(Mortal m){
        m.die();
    }

    public void useItem(Item i){
        i.effect();
    }

    public String toString(){
        return this.name + this.price;
    }

    public void finalize(){
        System.out.println("这个英雄正在被回收");
    }

    public boolean equals(Object o){
        if(o instanceof Hero){
            Hero h = (Hero) o;
            return this.hp == h.hp;
        }
        return false;
    }

    public Hero(){
//        System.out.println("Hero的构造方法 ");
    }

    public Hero(String name){
        System.out.println("Hero的有一个参数的构造方法 ");
        this.name = name;
    }

    public abstract void attack();

//    public Hero() {
//
//    }
//
//    // 增加一个初始化name的构造方法
//    public Hero(String name) {
//
//        this.name = name;
//    }
//
//    // 重写toString方法
//    public String toString() {
//        return name;
//    }
    public static void main(String[] args) {

    ADHero ad = new ADHero();

}
}