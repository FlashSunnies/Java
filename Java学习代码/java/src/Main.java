

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Part.printHello();
        /*
        System.out.println("Hello World!");
        System.out.println("hello world");
        int i = 100;
        System.out.println("i="+i);
        byte mybyte = 124;//申明byte型变量类型并赋值
        short myshort = 23213;//申明short型变量并赋值
        int myint = 242;//申明int型变量并赋值
        long mylong = 123213123123l;//申明long型变量并赋值
        long result = mybyte+myshort+myint+mylong;
        System.out.println("result="+result);

        float myfloat = 231.32f;//申明float型变量并赋值
        double mydouble = 23131233.2d;//申明double型变量并赋值
        double myresult = myfloat+mydouble;
        System.out.println("myresult="+myresult);
        final  boolean BOOL = false;//申明常量

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入变量A的值");
        long A = scan.nextLong();
        System.out.println("请输入变量B的值");
        long B = scan.nextLong();
        System.out.println("A="+A+"\tB="+B);
        System.out.println("执行变量互换。。。");
        A = A^B;
        B = B^A;
        A = A^B;
        System.out.println("A="+A+"\tB="+B);
        */

        //3.5.10 判断一个数的奇偶
//        Scanner scan1 = new Scanner(System.in);
//        System.out.println("请输入一个整数");
//        long number = scan1.nextLong();
//        //String check = ;
//        System.out.println((number%2==0)?"我是偶数":"我是奇数");

        //3.6.1 自动类型转化
//        float number1 = 45.232f;
//        int number = 12;
//        System.out.println(number1+number);

        /*
         //经典范例 判断是不是闰年
        System.out.println("即将开始判断年份...");
        Scanner scan2 = new Scanner(System.in);
        System.out.println("请输入年份");
        long year = scan2.nextLong();
        if (year%4==0 && year%100!=0 || year%400!=0){
            System.out.println(year+"是闰年");
        }else {
            System.out.println(year+"不是闰年");
        }
        */

       /* //经典范例 求长方形体积
        System.out.println("即将计算长方形的体积...");
        Scanner scan3 = new Scanner(System.in);
        System.out.println("请输入长方形的长度");
        double longC = scan3.nextDouble();
        System.out.println("请输入长方形的宽度");
        double longK = scan3.nextDouble();
        System.out.println("请输入长方形高度");
        double longG = scan3.nextDouble();
        double volume = longC * longK * longG;
        System.out.println("长方形的长度="+longC+"长方形的宽度="+longK+"长方形的高度="+longG
        +"长方形的体积="+volume);
        */
        /*
       //3.10 实战练习
        // 定义变量num1、num2
       int num1 = 12;
       int num2 = 18;
       boolean resuls = num1==num2?true:false;
       if (resuls){
           System.out.println("num1=num2");
       }else {
           System.out.println("最大值是:"+(num1>num2?num1:num2));
       }
       //计算矩形面积
        float lenth = 34.0f;
        float width = 10.0f;
        System.out.println("矩形面积是："+lenth*width);
        */
//        int c = addMethod(3,5);
//        System.out.println("2个和的值c="+c);
//        System.out.println(compareSameMethod(3,8)==true?"相同":"相同");
//        System.out.println("最大值=="+compareMethod(3,9));


//        //调用外部的类的方法，通过类的实例化进行调用
//        PrintCFB cfb = new PrintCFB();
//        //输入99乘法标
//        cfb.printCFB();
//        //输入其他的
//        cfb.printCFB(12);
//


/*
        //数组的学习
        //打印输入的定义
        ArrayDefinition arrayDefinition = new ArrayDefinition();
        //
        arrayDefinition.definitionArray();
        System.out.println("-------------华丽的分割线-------------");
//        //打印可变数组
//        arrayDefinition.definitionMuArray();
        //一维数组求和
        ArrayExamples arrayExamples = new ArrayExamples();
        int[] array =  {-1,-2,3,-18,5,19,};
        System.out.println("array="+arrayExamples.arraySum(array));
        System.out.println("-------------华丽的分割线-------------");
        //获取一维数组的最小值
        System.out.println("一维数组的最小值="+arrayExamples.arrayMinValues(array));
        System.out.println("-------------华丽的分割线-------------");
        //使用for循环遍历二维数组
        arrayExamples.bianliArrey();
        System.out.println("-------------华丽的分割线-------------");
        //使用foreach 遍历二维数组
        int arrayTwo[][] = {{1,2,3,4},{21,23,3,23,123},{23,23,23,23}};
        arrayExamples.bianliArray(arrayTwo);
        System.out.println("-------------华丽的分割线-------------");
        //使用Arrays.fill 替换数组元素
        arrayExamples.fillMethod();
        System.out.println("-------------华丽的分割线-------------");
        arrayExamples.useSortMethod();
        System.out.println("-------------华丽的分割线-------------");
        */


       //字符串的使用

        StringExamples string = new StringExamples();
        string.learnString();


    }
    //定义一个功能 实现2个整数的和
    public static  int addMethod(int a,int b ){
        return a+b;
    }
    //定义一个功能 判断2个整数是否相等
    public  static  boolean compareSameMethod(int a,int b){
        return a==b?true:false;
    }
    //定义一个功能 比较2个整数的大小
    public  static  int compareMethod(int a,int b){
        return a>b?a:b;
    }

}
