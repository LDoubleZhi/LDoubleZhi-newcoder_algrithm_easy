import charactor.*;
import property.*;
/**
接口与继承：
 1. 接口
 实现了AD这个接口，就必须提供AD接口中声明的方法physicAttack()
 实现在语法上使用关键字 implements

 2.对象转型 和 重写
 2.1明确引用类型和对象类型的概念
         在这个例子里，有一个对象 new ADHero(), 同时也有一个引用ad
         对象是有类型的， 是ADHero
         引用也是有类型的，是ADHero
         通常情况下，引用类型和对象类型是一样的
         接下来要讨论的类型转换的问题，指的是引用类型和对象类型不一致的情况下的转换问题
 2.2子类转父类（向上转型）：子类均可以转为父类，右边的能否当成左边来用
         Hero h = new Hero();
         ADHero ad = new ADHero();
         h = ad;
 2.3父类转子类：需要强制转换,有可能成功或失败   ad = (ADHero) h;
 2.4.没有继承关系的两个类，互相转换，一定会失败
 2.5 实现类转换为接口（向上转型）
 从语义上来讲，把一个ADHero当做AD来使用，而AD接口只有一个physicAttack方法，这就意味着转换后就有可能要调用physicAttack方法，而ADHero一定是有physicAttack方法的，所以转换是能成功的。
 2.6.接口转换为实现类（向下转型）
 2.7 instanceof 。。 判断一个引用所指得对象是否是。。
2.8子类可以继承父类的对象方法，在继承后，重复提供该方法，就叫做方法的重写，又叫覆盖 override

 3.多态
 操作符的多态  + 可以作为算数运算，也可以作为字符串连接
 类的多态:父类引用指向子类对象
3.1 操作符的多态
 不同情况，作用不同。+两侧都是整型代表数字相加，任意一侧是字符串就代表字符串连接3
 3.2类的多态
3.3类多态的条件：首先父类（接口）引用志向子类对象，然后调用的方法重写

 4.隐藏
 与重写类似，方法的重写是子类覆盖父类的对象方法
 隐藏，就是子类覆盖父类的类方法
 Hero h =new ADHero();
 h.battleWin();//调用的父类方法

 5.super
创建一个子类对象时候（），父类的构造方法会被先调用，然后再调用子类的；
先调用父类的无参构造函数，在调用子类的对应构造函数。
 注意如果父类没有声明默认构造函数而又自定义了有参构造函数
 创建子类对象就会报错
 如果想调用父类的对应参数构造函数，可以再子类构造函数中
 用super（参数）e.g.：super(name);
super.属性得到父类属性  super.方法调用父类方法

 6.Object类：Object类是所有类的父类
6.1 声明一个类的时候，默认是继承了Object  public class Hero extends Object
 6.2 Object类提供一个toString方法，所以所有的类都有toString方法
 toString()的意思是返回当前对象的字符串表达
 System.out.println(h.toString()); System.out.println(h);
两种输出相同

 6.3
 当一个对象没有任何引用指向的时候，它就满足垃圾回收的条件
 当它被垃圾回收的时候，它的finalize() 方法就会被调用。
 finalize() 不是开发人员主动调用的方法，而是由虚拟机JVM调用的。
 equals() 用于判断两个对象的内容是否相同
 ==  这不是Object的方法，但是用于判断两个对象是否相同，更准确的讲，用于判断两个引用，是否指向了同一个对象
 hashCode方法返回一个对象的哈希值，但是在了解哈希值的意义之前，讲解这个方法没有意义。
 Object还提供线程同步相关方法 wait() notify() notifyAll()
 getClass()会返回一个对象的类对象，反射

 7.final
修饰类，方法，基本类型变量，引用的时候分别有不同的意思。
7.1修饰类时候
 当Hero被修饰成final的时候，表示Hero不能够被继承，其子类会出现编译错误
 7.2修饰方法时：不能被重写
 7.3 修饰基本变量时，只有一次赋值机会
 7.4修饰引用时：只有1次指向对象的机会
7.5 修饰常量

 8.抽象类:类名前也要加abstract，没有方法体，子类有各自实现
 在类中声明一个方法，这个方法没有实现体，是一个“空”方法
 这样的方法就叫抽象方法，使用修饰符“abstract"，当一个类有抽象方法的时候，该类必须被声明为抽象类
 一旦一个类被声明为抽象类，就不能够被直接实例化
 和接口的区别：
 8.1 子类只能继承一个抽象类，但可实现多个接口
 8.2 抽象类可以定义public protected package private static final
 而接口中声明的属性只能是public static final resistMagic即便没有显式的声明为 public static final//但依然默认为public static final
 都可以有实体方法，接口中的实体方法较默认方法

 9.内部类(分为4种)
 非静态内部类,new 外部类().new 内部类()
 静态内部类,new 外部类.静态内部类();因为没有一个外部类的实例，所以在静态内部类里面不可以访问外部类的实例属性和方法
 除了可以访问外部类的私有静态成员外，静态内部类和普通类没什么大的区别
 匿名类,
 本地类

 10.默认方法
 默认方法是JDK8新特性，指的是接口也可以提供具体方法了，而不像以前，只能提供抽象方法
 被声明为了default
 假设没有默认方法这种机制，那么如果要为Mortal增加一个新的方法revive,那么所有实现了Mortal接口的类，都需要做改动。
 但是引入了默认方法后，原来的类，不需要做任何改动，并且还能得到这个默认方法
 通过这种手段，就能够很好的扩展新的类，并且做到不影响原来的类
如果实现了多个接口，就要实现default方法避免混淆
 */
/*
*1.接口：
*
* */
public class ExtendsAndInterface {
    public static void main(String[] args){
        /*
        Hero h =new Hero();
        System.out.println(h);
        ADHero ad = new ADHero();
        System.out.println(ad);
        Support s =new Support();
        System.out.println(s);

        h = ad;
        System.out.println(h);
        ad = (ADHero) h;
//        h引用有可能指向一个ad对象，也有可能指向一个support对象
//        所以把h引用转换成AD类型的时候，就有可能成功，有可能失败
//        因此要进行强制转换，换句话说转换后果自负
//        到底能不能转换成功，要看引用h到底指向的是哪种对象
//        在这个例子里，h指向的是一个ad对象，所以转换成ADHero类型，是可以的
        System.out.println(ad);
        h = s;
        System.out.println(h);
        ad = (ADHero)h;
        System.out.println(ad);
//        charactor.Hero@1b6d3586
//        charactor.ADHero@4554617c
//        charactor.Support@74a14482
//        charactor.ADHero@4554617c
//        charactor.ADHero@4554617c
//        charactor.Support@74a14482   */
        /*ADHero ad = new ADHero();
        APHero ap = new APHero();

        Hero h1= ad;
        Hero h2= ap;

        //判断引用h1指向的对象，是否是ADHero类型
        System.out.println(h1 instanceof ADHero);

        //判断引用h2指向的对象，是否是APHero类型
        System.out.println(h2 instanceof APHero);

        //判断引用h1指向的对象，是否是Hero的子类型
        System.out.println(h1 instanceof Hero);
        //true true true   */
        /*ADHero ad = new ADHero();
        Hero h = ad;
        AD adi = (AD) h;
        System.out.println(adi instanceof ADHero);
        System.out.println(adi instanceof Hero);
        APHero ap = (APHero) adi;//error */
        /*2.8
        Itm i = new Item();
        i.effect();

        LifePotion lp =new LifePotion();
        lp.effect();  */
        /*3
        int i = 5;
        int j = 6;
        int k = i+j; //如果+号两侧都是整型，那么+代表 数字相加

        System.out.println(k);

        int a = 5;
        String b = "5";

        String c = a+b; //如果+号两侧，任意一个是字符串，那么+代表字符串连接
        System.out.println(c);

        Item i1= new LifePotion();
        Item i2 = new MagicPotion();
        System.out.print("i1  是Item类型，执行effect打印:");
        i1.effect();
        System.out.print("i2也是Item类型，执行effect打印:");
        i2.effect();

        Hero garen =  new Hero();
        garen.name = "盖伦";

        LifePotion lp =new LifePotion();
        MagicPotion mp =new MagicPotion();

        garen.useItem(lp);
        garen.useItem(mp);  */
        /*多态题目
        Hero garlon = new Hero();
        ADHero ad = new ADHero();
        APHero ap = new APHero();
        ADAPHero adap = new ADAPHero();
        garlon.kill(ad);
        garlon.kill(ap);
        garlon.kill(adap);  */
        /*
        Hero.battleWin();
        ADHero.battleWin();
        Hero h =new ADHero();
        h.battleWin();//调用的父类方法*/
        /*
//        new ADHero();
//        Hero的构造方法
//        AD Hero的构造方法  */
        /*new ADHero("德莱文");
        ADHero h= new ADHero();
        Hero h = new Hero();
        h.name = "盖伦";
        System.out.println(h.toString());
        //直接打印对象就是打印该对象的toString()返回值
        System.out.println(h); */
        /* Object finalize（）
        Hero h;
        for (int i = 0; i < 100000; i++) {
            //不断生成新的对象
            //每创建一个对象，前一个对象，就没有引用指向了
            //那些对象，就满足垃圾回收的条件
            //当，垃圾堆积的比较多的时候，就会触发垃圾回收
            //一旦这个对象被回收，它的finalize()方法就会被调用
            h = new Hero();
        }  */
        /* Object equals（）
        * Hero h1= new Hero();
        h1.hp = 300;
        Hero h2= new Hero();
        h2.hp = 400;
        Hero h3= new Hero();
        h3.hp = 300;

        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));*/
        /*6 Object ==
        * Hero h1= new Hero();
        h1.hp = 300;
        Hero h2= new Hero();
        h2.hp = 400;
        Hero h3= new Hero();
        h3.hp = 300;

        System.out.println(h1==h2);
        System.out.println(h1==h3);*/
        /* Object 练习：重写Item的 toString(), finalize()和equals()方法
         toString() 返回Item的name + price
            finalize() 输出当前对象正在被回收
            equals(Object o) 首先判断o是否是It
              em类型，然后比较两个Item的price是否相同
              Item a = new Item();
        a.name = "a";
        a.price = 10;
        Item b = new Item();
        b.name = "b";
        b.price = 20;
        System.out.println(a);
        System.out.println(b);


        System.out.println(a.equals(b));

        Item c = new Item();
        a = c;*/
        /*8 抽象类*/
        ADAPHero a = new ADAPHero();
        a.attack();







    }
}
