package charactor;

/**
 * @author : liulinzhi
 * @date: 2019/12/28/16:29
 * @description:
 */
class ADHero extends Hero{
    int damage;

    public void attacks(){System.out.println(name + " 进行了一次攻击 ，但是不确定打中谁了");}
    public void attacks(Hero h1){System.out.println(name + "对" + h1.name + "进行了一次攻击 ");}
    public void attacks(Hero h1, Hero h2){System.out.println(name + "同时对" + h1.name + "和" + h2.name + "进行了攻击 ");}
}
