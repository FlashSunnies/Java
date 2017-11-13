
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
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

        //字符串替换
        String connectString5 = connectString.replace("小明","小邓");
        System.out.println("connectString5="+connectString5);
        System.out.println("-------------华丽的分割线-------------");
        //判断字符串相等
        String str1 = new String("hello world");
        String str2 = new String("Hello World");
        //equals 严格区分大小写
        boolean compare1 = str1.equals(str2);
        //equalsIgnoreCase 不区分大小写
        boolean compare2 = str1.equalsIgnoreCase(str2);
        System.out.println("compare1==="+compare1+"compare2="+compare2);
        //判断字符串的开始／结尾
        boolean compare3 = str1.startsWith("h");
        boolean compare4 = str1.endsWith("t");
        System.out.println("compare3==="+compare3+"compare4="+compare4);
        //字符串大小写转化  toLowerCase():转化为小写  toUpperCase:转化为大写
        System.out.println("小写转化后的str2="+str2.toLowerCase());
        System.out.println("大写转化后的str1="+str1.toUpperCase());
        //字符串分割 split(String regex) 分割后为数组
        String[] strArr = str1.split(" ");
        System.out.println("分割后的字符串数组="+ Arrays.toString(strArr));
        //split(String regex , int limit) 给定分割字符串 并限制分割份数
        String string1 = new String("a,b,c,d,f");
        System.out.println("string1="+string1);
        String[] strArr2 = string1.split(",",3);
        System.out.println("分割后的字符串数组="+ Arrays.toString(strArr2));
        for (String forStr:strArr2) {
            System.out.println("forStr="+forStr);
        }

    }

    /*
    * 给定字符串 使用，。进行分割 打印出数组元素及size*/
    public static  void  examplesOne(){
        System.out.println("-------------华丽的分割线-------------");
        String  str = new String("卢姬小小魏王家，绿鬓红唇桃李花。魏玉绮楼十二重，" +
                "水精帘箔绣芙蓉。白玉阑干金作柱，楼上朝朝学歌舞。" +
                "前堂后堂罗袖人，南窗北窗花发春。翠幌珠帘斗弦管，" +
                "一奏一弹云欲断。君王日晚下朝归，鸣环佩玉生光辉。" +
                "人生今日得骄贵，谁道卢姬身细微。");
        String[] splitArray = str.split("，|。");
        System.out.println("splitArray.length="+splitArray.length);
        for (String str2 :splitArray
                ) {
            System.out.println("str2="+str2);
        }

        System.out.println("-------------华丽的分割线-------------");
    }
    //判断字符串是否全部是数字格式
    public  static  void  examplesTwo(){
        System.out.println("-------------华丽的分割线-------------");
        String str = new String("12344545a343");
        boolean isNumber =  StringExamples.isNumber(str);
        System.out.println(isNumber?"全是是数字格式":"非数字格式");
        System.out.println("-------------华丽的分割线-------------");

    }
    private  static  boolean  isNumber(String str){
        boolean number = true;
        char[] c = str.toCharArray();
        for (int i = 0; i <c.length ; i++) {
            if (Character.isDigit(c[i])){

            }else{

                return false;
            }
        }
        return true;
    }
    //字符串格式化
    public static  void  formatString(){
        //日期格式化
        Date date = new Date();
        String a = String.format(Locale.US,"%tb",date); //格式化为月份的英文缩写
        String b = String.format(Locale.US,"%tB",date); //格式化为月份的英文全写
        String c = String.format("%ta",date); //格式化为星期的简称
        String d = String.format("%tA",date); //格式化星期的全称
        String e = String.format("%tY",date); //格式化为4位的年份值
        String f = String.format("%ty",date); //格式化为2为的年份值
        String g = String.format("%tm",date); //格式化为2位的月份值
        String h = String.format("%td",date); //格式化为2位的日期值
        String i = String.format("%te",date); //格式化为1位的日期值
        System.out.println("格式化为月份的英文缩写="+a+"\n"+"格式化为月份的英文全写="+b+"\n"+"格式化为星期的简称="+c+"\n"
                +"格式化星期的全称="+d+"\n"+"格式化为4位的年份值="+e+"\n"+"格式化为2为的年份值="+f+"\n"+"格式化为2位的月份值="+g+"\n" +
                "格式化为2位的日期值="+h+"\n"+"格式化为1位的日期值="+i+"\n");
        System.out.println("-------------华丽的分割线-------------");
        //时间格式化
        System.out.println("-------------华丽的分割线-------------");

        System.out.println("默认时间格式="+date);
        System.out.println("两位24小时制的小时="+String.format("%tH",date));
        System.out.println("两位12小时制的小时="+String.format("%tI",date));
        System.out.println("24小时制的小时="+String.format("%tk",date));
        System.out.println("12小时制的小时="+String.format("%tI",date));
        System.out.println("两位小时中的分钟="+String.format("%tM",date));
        System.out.println("两位小时中的秒="+String.format("%tS",date));
        System.out.println("表示时区缩写形式的字符串="+String.format("%tZ",date));
        System.out.println("上午还是下午="+String.format("%tp",date));
        System.out.println("-------------华丽的分割线-------------");

        //日期时间组合格式化
        /* weaning
        System.out.println("年-月-日 四位年份="+String.format("%tF"+date));
        System.out.println("月/日/年 两位年份="+String.format("%tD"+date));
        System.out.println("全部日期和时间信息="+String.format("%tc"+date));
        System.out.println("时:分:秒 pm格式="+String.format("%tr"+date));
        System.out.println("时:分:秒 24时="+String.format("%tT"+date));
        System.out.println("时:分 24时="+String.format("%tR"+date));
        */

        //常规类型格式化
        System.out.println("结果转化为十进制="+String.format("%d",400/2));
        System.out.println("结果以布尔形式表示="+String.format("%b",3>2));
        System.out.println("结果转化为十六进制="+String.format("%x",200));
        System.out.println("我是git上的更新");


    }


}
