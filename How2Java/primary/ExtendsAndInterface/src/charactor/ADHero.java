package charactor;

public class ADHero extends Hero implements AD, Mortal{
    int moveSpeed = 400;
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    @Override
    public void die() {
        System.out.println("ADHero die");
    }

    public int getMoveSpeed(){
        return this.moveSpeed;
    }

    public int getMoveSpeed2(){
        return super.moveSpeed;
    }

    public static void battleWin(){
        System.out.println("ad hero battle win");
    }
    public ADHero(){

        System.out.println("AD Hero的构造方法");
    }

    public ADHero(String name){
        super(name);
        System.out.println("AD Hero的一个参数的构造方法");
    }


    @Override
    public void attack() {
        physicAttack();
    }
}
