import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author : liulinzhi
 * @date: 2019/12/29/10:12
 * @description:
 */
/*
* 1.装箱拆箱：
* 所有基本类型，都有对应的类类型，比如int对应Integer，这种类叫做封装类
*Number大类分为：Byte Double Float Integer Short Long
* Integer it = new Integer(i);//基本类型转为封装类
        int i2= it.intValue();//封装类转为基本类型
* 不需要调用构造方法，通过=符号自动把 基本类型 转换为 类类型 就叫装箱
* 不需要调用Integer的intValue方法，通过=就自动转换成int类型，就叫拆箱
* int的最大值可以通过其对应的封装类Integer.MAX_VALUE获取
*
* 2.字符串转换：
* 数字转字符串：1.用string类的静态方法valueOf  2先把基本类型装箱为对象然后调用对象的toString
* 字符串转数字：调用Integer的静态方法parseInt
*
* 3.数学方法：java.lang.Math提供了一些静态方法
* Math.round()四舍五入  Math.random()0-1间的随机浮点数
* Math.sqrt()开方 Math.pow(,)次方   Math.PI Math.E自然常数
* 是否是质数2-sqrt(n)
*
* 4.格式化输出
* %s字符串  %d数字   %n换行（可以做到跨平台，因为不同系统换行符不同）
* printf  format
* %8d:总长度为8  %-8d左对齐  %08d不够补零  %,8d千分位分隔符 %.2f小数点位数
*
* 5.字符：
* char 单引号 对应封装类是character
* 常用方法：isLetter()是否为字母  isDigit() isWhitespace()
* isUpperCase()  isLowerCase() toUpperCase() toLowerCase()   toString()
* \t可达到对齐效果（长为8）
*
* 6.字符串  String是一个final类（不可继承），创建的所有字符串都是一个对象
* 三种创建方法 String s = "asf"  String s = new String("asf")
* char[] cs =new char[]{'a', 's', 'f'} Stirng s = new String(cs)
* 字符串间可用加号连接，创建新的字符串
* 字符串i创建后mmutable不可改变
* 格式化：String sentenceFormat ="%s 在进行了连续 %d 次击杀后，获得了 %s 的称号%n";
            String sentence2 = String.format(sentenceFormat, name,kill,title);
length返回当前长度
*
*
* 7.操纵字符串：
* charAt(int index) toCharArray()   subString()截取字符串
* split（）   trim去掉收尾空格  toLowerCase() toUpperCase()
* indexOf() lastIndexOf() contains()是否包含子字符串
* replaceAll()替换所有  replaceFirst()只替换第一个
*
* 8.比较字符串
* ==是否是同一个字符串对象
* String str1 = "the light";
String str2 = new String(str1);//指向不同对象
* str1 = "the light";
str3 = "the light";其实指向同一个对象
*
* equals（）判断内容是否相同  equalsIgnoreCase（）忽略大小写
* startsWith //以...开始
endsWith //以...结束
*
* 9.StringBuffer类：可变长的字符串
* append delete insert reverse  length capacity（分配空间）
* 和String内部是一个字符数组一样，StringBuffer也维护了一个字符数组。 但是，这个字符数组，留有冗余长度
比如说new StringBuffer("the")，其内部的字符数组的长度，是19，而不是3，这样调用插入和追加，在现成的数组的基础上就可以完成了。
如果追加的长度超过了19，就会分配一个新的数组，长度比原来多一些，把原来的数据复制到新的数组中，看上去 数组长度就变长了
* */


public class StringDemo {
    public static String randomString(int length) {   //用randomString产生长度为len的随机字符串，只包含数字和字母
        char[] ch=new char[length];
        for (int i = 0; i < ch.length; i++) {
            int k=0;
            while(k<length) {
                int randomNum=(int)(Math.random()*48+75);
                if (randomNum>=48&&randomNum<=57||
                        randomNum>=65&&randomNum<=90||
                        randomNum>=97&&randomNum<=122) {
                    ch[i]=(char)randomNum;
                    k++;
                }
            }
        }
        String strRandom= Arrays.toString(ch);
        return strRandom;
    }

    private static boolean isPrime(int i){
        for (int j =2; j <=Math.sqrt(i); j++)
            if (0==i%j)
                return false;
            return true;
            };
    public static void main(String[] args){
        /*1.装箱拆箱
        int i = 5;
        Integer it = new Integer(i);//基本类型转为封装类
        int i2= it.intValue();//封装类转为基本类型
        System.out.println(Integer.MAX_VALUE);
        //int的最小值
        System.out.println(Integer.MIN_VALUE);
        byte b = 1;
        Byte b1 = b;
        System.out.println(b1);
        byte b2 = b1;
        System.out.println(b2);
        System.out.println(b2);
        //int的最小值
        System.out.println(Byte.MIN_VALUE);  */
        /*2.字符串转换
        int i = 5;
        String str = String.valueOf(i);
        Integer it = i;
        String str2 = it.toString();
        String str3 = "999";
        int i1 = Integer.parseInt(str3);
        System.out.println(i1);

        float f = 3.14f;
        String strf = String.valueOf(f);
        float f1 = Float.parseFloat(strf);
        System.out.println(f1);   */
        /*3.Math
        int n = Integer.MAX_VALUE;
        System.out.println(1+1d/n);
        System.out.println(1+1d/n);
        System.out.println(Math.pow(1+1d/n, n));//注意必须1d
        System.out.println(Math.E);

        int sum=0;
        for (int i = 1; i <=10000000; i++) {
            if (isPrime(i)) {
                sum++;
            }
        }
        System.out.println(sum);  */
        /*
        String name ="盖伦";
        int kill = 8;
        String title="超神";

        //直接使用+进行字符串连接，编码感觉会比较繁琐，并且维护性差,易读性差
        String sentence = name+ " 在进行了连续 " + kill + " 次击杀后，获得了 " + title +" 的称号";

        System.out.println(sentence);

        //使用格式化输出
        //%s表示字符串，%d表示数字,%n表示换行
        String sentenceFormat ="%s 在进行了连续 %d 次击杀后，获得了 %s 的称号%n";
        System.out.printf(sentenceFormat,name,kill,title);
        System.out.format(sentenceFormat,name,kill,title);
        int year = 2020;
        System.out.format("%,8d%n",year*10000);
        System.out.format(Locale.FRANCE,"%,.2f%n",Math.PI*10000);

        Scanner s = new Scanner(System.in);
        System.out.println("请输入地名:");
        String location = s.nextLine();
        System.out.println("请输入公司类型:");
        String companyCategory = s.nextLine();
        System.out.println("请输入公司名称:");
        String companyName = s.nextLine();
        System.out.println("请输入老板名称:");
        String bossName = s.nextLine();
        System.out.println("请输入金额:");
        String money = s.nextLine();
        System.out.println("请输入产品:");
        String product = s.nextLine();
        System.out.println("请输入价格计量单位:");
        String unit = s.nextLine();

        String model = "%s最大%s%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%s个亿，%n"
                + "带着他的小姨子跑了!我们没有办法，拿着%s抵工资!原价都是一%s多、两%s多、三%s多的%s，%n"
                + "现在全部只卖二十块，统统只要二十块!%s王八蛋，你不是人!我们辛辛苦苦给你干了大半年，%n"
                + "你不发工资，你还我血汗钱，还我血汗钱!";
        System.out.format(model, location,companyCategory,companyName,bossName,money,product,unit,unit,unit,product,bossName);
        */
        /*
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        char[] cs = input.toCharArray();
        for(char c:cs){
        if(Character.isUpperCase(c))
            System.out.println(c);
        if(Character.isDigit(c))
            System.out.println(c);
        }  */
        long firstStageTime=System.currentTimeMillis();//用StringBuffer拼接10000个字符串
        int len=10;
        StringBuffer buffer= new StringBuffer("");
        for (int i = 0; i < 10000; i++) {
            buffer=buffer.append(randomString(len));
        }
        System.err.println(System.currentTimeMillis()-firstStageTime);



        long sencondStageTime=System.currentTimeMillis();//用String拼接10000个字符串
        String str="";
        for (int i = 0; i < 10000; i++) {
            str=str+randomString(len);
        }
        System.out.println(System.currentTimeMillis()-sencondStageTime);

    }
}
