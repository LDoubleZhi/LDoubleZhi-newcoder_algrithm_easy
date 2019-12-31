package class1;

import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : liulinzhi
 * @date: 2019/12/31/10:47
 * @description:  提取输入信息 排序（小到大或大到小） 打印
 */
public class hw01 {
    int arrayLength = 0;
    boolean sortMethod = false;

    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    public static  void swap(int[] arr, int start, int end){
        arr[start] = arr[start] ^ arr[end];
        arr[end] = arr[start] ^ arr[end];
        arr[start] = arr[start] ^ arr[end];
    }

    public static  void reverse(int[] arr){
            int t = 0;
            for (int i = 0; i <= arr.length / 2 - 1; i++){
                t = arr[i];
                arr[i] = arr[arr.length -1 - i];
                arr[arr.length -1 - i] = t;
            }
    }

    public static int[] selectionSortDemo(int[] arr, int method){
        int[] tempt = new int[arr.length];
        int num = 0;
        for (int i = 0; i <= tempt.length - 1; i++){
            tempt[i] = num;
            num++;
        }
//        System.out.println("初始化tempt" + Arrays.toString(tempt));

        for (int i = 1; i <= arr.length - 1; i++){
            for(int j = i; j > 0; j--){//对j - 0排序
                if (arr[j] >= arr[j-1])
                    break;
                else{
                    swap(arr, j, j-1);
                    swap(tempt, j, j-1);
            }
            }
        }

        return tempt;
    };

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){//检查是否输入非空字符
        int length = Integer.parseInt(in.nextLine());//长度
        int method = Integer.parseInt(in.nextLine());//排序方法
        int count = length;

        String[] input = new String[length];
        int[] arr = new int[length];


        while (count > 0){
            count--;
            String getInput = in.nextLine();
            String[] temp = new String[2];
            temp = getInput.split(" ");
            input[length - count - 1] = temp[0];
            arr[length - count - 1] = Integer.parseInt(temp[1]);
        }

        int[] arr1 = copyArray(arr);
        int[] index = new int[length];
        index = selectionSortDemo(arr, method);
        if (method == 1){
         for (int i : index){
            System.out.println(input[i] + " " + arr1[i]);
        }}
        else{
            for (int i = length - 1; i >= 0; i--)
            {
                System.out.println(input[index[i]] + " " + arr1[index[i]]);
            }
        }
//    }
    }
}}
