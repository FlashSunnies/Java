public class PrintCFB {
    public  static void main(String[] args){


    }
    //函数的重构

    public  static  void  printCFB(int num){

        System.out.println("即将打印99乘法表");

        for (int i = 1 ; i <= num ;i ++){

            for (int j = 1 ; j <= i ; j++ ){

                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println("");
        }

    }

    public  static void  printCFB(){

        printCFB(9);
    }


}
