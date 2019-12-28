/**
 * @author : liulinzhi
 * @date: 2019/12/28/16:02
 * @description:
 */

/*
* 类与对象：
* 1.引用：变量的另一种类型：区分对象和应用
* Hero h1 = new Hero();//引用类似遥控器，etc 见下
*      引用      对象
*
* 2.继承：继承和覆盖、添加  class son extends father
*
* 3.方法重载：方法的重载指的是方法名一样，但是参数类型不一样,根据传递的参数类型以及数量，自动调用对应的方法
*
* 4.构造方法：无返回；无创建构造方法时候，有一个无参隐式构造函数，一旦创建，隐式就没了
* 也可以加入重载
*
* 5.this指针：当前对象；用.调用属性；this（）调用构造函数
*
* 6.传参数：参数也是变量，分为基本类型传参和引用类型传参，小心修改引用
*
* 7.包：使用同一个包下的其他类，直接使用即可
但是要使用其他包下的类，必须import,而且类需要public
*
* 8.访问修饰符：private package protected public
* 1. 属性通常使用private封装起来
2. 方法一般使用public用于被调用
3. 会被子类继承的方法，通常使用protected
4. package用的不多，一般新手会用package,因为还不知道有修饰符这个东西
* 再就是作用范围最小原则
简单说，能用private就用private，不行就放大一级，用package,
* 再不行就用protected，最后用public。 这样就能把数据尽量的封装起来，
* 没有必要露出来的，就不用露出来了
*
*9.类属性：被static修饰的属性，也叫静态属性，所有对象共享一个值
* teemo.copyright/Hero.copyright两种方式，建议后一种便于理解
*
* 10.类方法：static方法无需先创对象 Hero.Staticfunc() 如：Math.random()
* 为什么要用static：如果一个方法，没有调用任何对象属性，那么就可以考虑设计为类方法，比如
*
* 11.属性初始化：
* 对象属性初始化有3种
1. 声明该属性的时候初始化
2. 构造方法中初始化
3. 初始化块 {
        maxHP = 200; //初始化块
    }
*
* 类属性初始化有2种
1. 声明该属性的时候初始化
2. 静态初始化块static{
        itemCapacity = 6;//静态初始化块 初始化
    }
    *
    *
12.单例模式：Singleton模式，指的是一个类，在一个JVM里，只有一个实例存在。
*
*
* 13.枚举：一种特殊的类：public enum Season {
	SPRING,SUMMER,AUTUMN,WINTER
}   switch (season) {
        case SPRING:
            System.out.println("春天");
            break;
        case SUMMER:
            System.out.println("夏天");
            break;
        case AUTUMN:
            System.out.println("秋天");
            break;
        case WINTER:
            System.out.println("冬天");
            break;
        }
* */

//class Hero{
//    String name; //姓名
//
//    float hp; //血量
//
//    float armor; //护甲
//
//    int moveSpeed; //移动速度
//
//
//};
import charactor.Hero;
class Hero1{
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度
    // 攻击一个英雄，并让他掉damage点血
    public Hero1(String name, float hp) {
        this.name = name;
        this.hp = hp;
    }
    public void attack(Hero1 hero, int damage) {
        hero.hp = hero.hp - damage;
    }


};
class Item{
    String name;
    int price;
}
//class ADHero extends Hero{
//    int damage;
//
//    public void attacks(){System.out.println(name + " 进行了一次攻击 ，但是不确定打中谁了");}
//    public void attacks(Hero h1){System.out.println(name + "对" + h1.name + "进行了一次攻击 ");}
//    public void attacks(Hero h1, Hero h2){System.out.println(name + "同时对" + h1.name + "和" + h2.name + "进行了攻击 ");}
//}
public class ClassAndObject {
    public static void main(String[] args){
//        Hero h1 = new Hero();
//        Hero h2 = h1;  //h2指向h1所指向的对象
//        Hero h3 = h1;
//        Hero h4 = h1;
//        Hero h5 = h4;//五个引用一个对象
//
//        Hero garen =  new Hero();
//        garen =  new Hero();//两个对象，一个引用。 和原对象解绑
//
//        ADHero bh = new ADHero();
//        bh.name = "赏金猎人";
//
//        Hero hero1 = new Hero();
//        hero1.name = "盖伦";
//        Hero hero2 = new Hero();
//        hero2.name = "提莫";
//
//        bh.attacks(hero1);
//        bh.attacks(hero1, hero2);
//
//        Hero1 teemo = new Hero1("提莫", 383);
//        Hero1 garen1 = new Hero1("盖伦", 616);
//        garen1.attack(teemo, 100);
//        System.out.println(teemo.hp);Her
        Hero i = new Hero();
    }
}
