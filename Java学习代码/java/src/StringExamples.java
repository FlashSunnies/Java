import java.util.StringTokenizer;

public class StringExamples {


    public static void learnString(){
        System.out.println("\n");
        //字符串的定义
        String  str = new String("hello world");
        System.out.println("你定义的字符串是="+str);
        System.out.println("-------------华丽的分割线-------------");
        //字符串的连接
        //1.多个字符串的连接
        String s1 = new String("hello\t");
        String s2 = new String("Java");
        String s3 = s1+s2;
        System.out.println("多个字符串连接后的是="+s3);
        System.out.println("-------------华丽的分割线-------------");
        //2.0 字符串连接其他类型
        double price = 4.0d;
        int num = 2;
        String useName = new String("小明");
        String connectString = useName + "在超市买了 "+num+" 瓶农夫山泉  ,    一共支付给了超市"+price+"元钱  。  ";
        System.out.println("拼接后的是=\t"+connectString);
        System.out.println("-------------华丽的分割线-------------");
        //3.0 获取字符串信息
        int strLength = connectString.length();
        System.out.println("字符串长度="+strLength);
        //获取指定字符的索引位置
        System.out.println("字符串小明所在位置是="+connectString.indexOf("农夫山泉"));
        System.out.println("字符串 超市最后出现的 所在位置是="+connectString.lastIndexOf("超市"));
        //4.0 获取指定索引位置的字符
        System.out.println("获取字符串下标6的字符串是="+connectString.charAt(6));
        System.out.println("-------------华丽的分割线-------------");
        //去掉字符串中的空格
        //去掉字符串首位空格 trim()
        String connectString2 = connectString.trim();
        System.out.println("去掉首位空格的字符串是="+connectString2);
        //去掉字符串中的所有空格 方式一  StringTokenizer(String str , String changeStr)
        StringTokenizer stringtoken = new  StringTokenizer(connectString," ");
        StringBuffer buffer = new StringBuffer();
        int i = 0 ;
        while (stringtoken.hasMoreTokens()){
            i++;
            buffer.append(stringtoken.nextToken());
        };
        String connectString3 = buffer.toString();
        System.out.println("去掉所有空格的字符串=="+connectString3);
        //去掉字符串中的所有空格 方式二  replaceAll(String regex,String replacement)
        String connectString4 = connectString.replaceAll(" ","");
        System.out.println("去掉所有空格的connectString4字符串=="+connectString4);
        System.out.println("-------------华丽的分割线-------------");



        //字符串替换指定字符串
        String connectString5 = connectString.replace("小明","校长");
        System.out.println("connectString5===="+connectString5);








    }

}
