import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayDefinition
{

    public  static  void definitionArray(){

        //定义一维数组的格式
        //格式一
        int month[] = new int[12];
        //格式二
        int[] monthTwo = new int[12];

        //输入定义的格式
        int[] array = new int[5];
        array[0] = 1;
        int[] arrayTwo = new int[]{1,2,3,4};
        int[] arrayThree = {1,2,-3,4,5};
        //使用Array类输出数组内容 Arrays.toString
        System.out.println("array="+ Arrays.toString(array));
        System.out.println("arrayOne="+Arrays.toString(arrayTwo));
        System.out.println("arrayTwo="+Arrays.toString(arrayThree));


//        System.out.println("max="+getMaxOrMix(true,arrayThree));
//        System.out.println("mix="+getMaxOrMix(false,arrayThree));
//        //选择排序
//        sortMethod(arrayThree);
//        //冒泡排序
//        maoPaoSort(arrayThree);


        //二维数组的定义
        //二维数组的格式 type：数组的数据类型 arrayName：数组的名字 values：数组各元素的值
        //type arrayName[][] = {values1,values2,values3...};
        //二维数组定义例子
        int monthArray[][] = {{12,0},{5,4}};
        //使用二维数组输出 3行4列的长方形格式

        printRectangle();

    }
    public  static  void definitionMuArray(){
        ArrayList <String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        //移除数组所有元素
        list.removeAll(list);
        list.add("3");
        list.add("5");
        //数组移除指定下标
        list.remove(1);
        //数组插入
        list.add(0,"hello");
        System.out.println("list="+list);
    }
    //数组获取最大值最小值
    public  static  int getMaxOrMix(boolean getMix,int[] arr){
        int max = arr[0];
        int min = arr[1];
        for (int i = 0 ;i<arr.length;i++) {
            max = arr[i] > max ? arr[i] : max;
            min = arr[i] < min ? arr[i] : min;
        }
        return getMix==true?max:min;
    }
    //选择排序
    public  static  void  sortMethod(int[] arr){

        for (int i =0; i <arr.length-1; i++){
            for (int j =i+1;j<arr.length; j++){
                int temp = arr[i];
                if (arr[i]>arr[j]){
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("排序后的数组==="+Arrays.toString(arr));
    }
   //冒泡排序
    public  static  void  maoPaoSort(int[] arr){

        for (int i =0; i <arr.length-1; i++)
        {
            for (int j=0; j<arr.length-i-1; j++)
            {
               if (arr[j]>arr[j+1]){

                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
            }
        }
        System.out.println("arr="+Arrays.toString(arr));
    }
    //使用二维数组输出 3行4列的长方形格式
    public  static  void printRectangle(){
        int array[][] = new int[3][4];
        System.out.println("打印3行4列的长方形");
        for (int i =0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++)
            {
                System.out.print("*\t");
            }
            System.out.println("");
        }

    }
}
