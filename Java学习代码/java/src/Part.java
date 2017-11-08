public class Part {

    static  final  double PI = 3.14;  //申明常量PI
    static  int age = 23;//申明int 型变量age并赋值
    public static  void  main(String[] args){
        final int number;
        number = 1213;
        age = 24;
        System.out.println("PI="+PI);
        System.out.println("number"+number);
        System.out.println("age"+age);

    }
    public  static  void printHello(){
        System.out.println("part===hello world");
    }
}
