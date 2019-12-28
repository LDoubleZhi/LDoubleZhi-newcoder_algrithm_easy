import java.util.Arrays;

/**
 * @author : liulinzhi
 * @date: 2019/12/28/15:22
 * @description:
 */

/*
* 数组是一个固定长度，包含相同类型数据的容器，创建时候需要指定长度
* .length属性显示长度
* 1.初始化数组：int[] a = new int[]{100,102,444,836,3236};
                //写法二： 省略了new int[],效果一样
                int[] b = {100,102,444,836,3236};
2.数组中的for：for (int each : b)
* 3.复制数组：System.arraycopy(src, srcPos, dest, destPos, length)
* src: 源数组 srcPos: 从源数组复制数据的起始位置 dest: 目标数组 destPos: 复制到目标数组的起始位置 length: 复制的长度
* 4.二维数组：
* int[][] a = new int[2][3]; //有两个一维数组，每个一维数组的长度是3
* int[][] b = new int[2][]; //有两个一维数组，每个一维数组的长度暂未分配
int b[][] = new int[][]{
   {1,2,3},
   {4,5,6},
   {7,8,9}
};
* 5.Arrays类
* import java.util.Arrays;
* copyOfRange	数组复制
toString()	转换为字符串
sort	排序
binarySearch	搜索
equals	判断是否相同
fill	填充
*
* */
public class ArrayDemo {
    public static void main(String[] args){
        //复制
        int[] a = new int[] {18, 62, 68, 82, 65, 9};
        int[] b = Arrays.copyOfRange(a, 0, 3);//ori from to,3位置是取不到的

        String content = Arrays.toString(a);
        System.out.println("To string: " + content);//TO String[]无需for循环观察数组

        Arrays.sort(a);
        System.out.println("To string: " + Arrays.toString(a));//排序

        System.out.println("To string: " + Arrays.binarySearch(a, 62));//search index

        System.out.println("To string: " + Arrays.equals(a, b));//比较

        Arrays.fill(a, 5);
        System.out.println("To string: " + Arrays.toString(a));//用同一个值填充
//        To string: [18, 62, 68, 82, 65, 9]
//        To string: [9, 18, 62, 65, 68, 82]
//        To string: 2
//        To string: false
//        To string: [5, 5, 5, 5, 5, 5]

        for (int i : a)
            System.out.println(i);
    }
}
