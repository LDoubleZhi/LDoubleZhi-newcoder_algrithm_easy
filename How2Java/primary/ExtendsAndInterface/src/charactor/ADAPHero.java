package charactor;

public class ADAPHero extends Hero implements AD,AP,Mortal{

    @Override
    public void magicAttack() {
        // TODO Auto-generated method stub

    }

    @Override
    public void physicAttack() {
        // TODO Auto-generated method stub

    }

    @Override
    public void die() {
        System.out.println(name+ " 这个混合英雄挂了");
    }

    //作为同时继承了AD和AP中的 默认方法attack，就必须在实现类中重写该方法
    //从而免去到底调用哪个接口的attack方法这个问题
    @Override
    public void attack() {
        //
        System.out.println("这个ADAPHero自己的attack方法");
    }

    public static void main(String[] args){

       ADAPHero a = new ADAPHero();
        a.attack();}

}