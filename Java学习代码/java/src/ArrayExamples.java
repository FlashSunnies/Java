import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExamples {


    //求一维数组的和
    public  static int arraySum(int[] array){

        int sum = 0;
        for (int i=0; i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }
    //获取一维数组的最小值
    public  static int arrayMinValues(int[] array){
        int min = array[0];
        for (int i=1; i<array.length; i ++)
        {
            min = min<array[i]?min:array[i];
        }
        return min;
    }

    //遍历二维数组，并打印数组元素
    public  static void  bianliArrey(){
        int array[][] = {{1},{2,3,4,5},{2,4,5,6}};
        for (int i =0; i < array.length;i++)
        {
            for (int j =0; j < array[i].length;j++)
            {
                System.out.print("数组中的元素="+array[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("-------------华丽的分割线-------------");
        String arrayTwo[][] = {{"iOS","iOS大佬"},{"android","android小弟"},{"Php"}};
        for (String arrayThree[]:arrayTwo) {
            for (String str: arrayThree) {
                System.out.print("数组中的元素="+str+"\t");
            }
            System.out.println("");
        }


    }
    //使用 for each 遍历二维数组 并打印数组元素
    public  static void  bianliArray(int array[][]){
        for (int x[]: array) {

            for (int y:x) {
                System.out.print("数组中的元素="+y+"\t");
            }
            System.out.println("");
        }

    }
    //fill 填充替换元素
    public  static void  fillMethod(){
        //fill语句 a需要进行元素替换的数组 values要存储数组中的所有元素的值 返回值 替换后的数组
        // fill(int[] a, int values)
        //例子1
        int a[] = new int[]{1,2,4,56,6,9};
        Arrays.fill(a,8);
        for (int i=0; i<a.length; i++){
            System.out.println("第"+i+"个元素，值="+a[i]);
        }
        System.out.println("-------------华丽的分割线-------------");
        //例子2 替换指定返回内的元素 Arrays.fill(int[] a, int fromIndex, int toIndex , int  values )
        // a:需要进行元素替换的数组 fromIndex：从指定下标（包括） toIndex:目标下标（不包括） values:储存数组中国年的元素值
        //替换数组元素 从下标2-4的元素值
        Arrays.fill(a,2,4,7);
        System.out.println("替换后的数组="+Arrays.toString(a));
        System.out.println("-------------华丽的分割线-------------");

    }
    //使用sort方法对数组进行排序
    public  static  void  useSortMethod(){

        int a[] = {1,2,344,-1923,232,23};
        System.out.println("使用sort方法排序前的数组="+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("使用sort方法排序后的数组="+Arrays.toString(a));
    }
    //数组的copy
    public  static  void  useCopyArray(){
        int a[] = {1,2,344,-1923,232,23,2323,223,21,232,3,23,2,312,3,123,12,312,3,213,21312};
        System.out.println("cpoy前的数组="+Arrays.toString(a));
        //copyOf(int a[], int length) a:进行copy的数组 length:copy的数组长度 从下标0开始
        Arrays.copyOf(a,a.length-2);
        System.out.println("copyOf后的数组" +Arrays.toString(a));
        //copyOfRange(int a[],int fromIndex,int toIndex)
        Arrays.copyOfRange(a,2,6);
        System.out.println("copyOfRange后的数组="+Arrays.toString(a));

    }
}