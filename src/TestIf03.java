/**
 * 测试多分支结构
 */

public class TestIf03 {
    public static void main(String[]args){
        int age=(int)(120*Math.random());
        System.out.println("年龄是："+age);
        //15以下（不含15）是儿童，15-24是青年，25-44中年，45-64中老年
        // 65-84老年，85-99老寿星，100-109百岁老人，110以上申请国家记录；
        if(age<15){
            System.out.println("你的童年我的童年好像都一样");
        }else if(age<25){
            System.out.println("准备好面对社会的毒打了吗");
        }else if (age<45){
            System.out.println("被社会毒打了吗");
        }else if (age<65){
            System.out.println("退休指日可待");
        }else if (age<85){
            System.out.println("颐养天年");
        }else if (age<100){
            System.out.println("老寿星，看看广场舞");
        }else if (age<110){
            System.out.println("百岁老人，依然搞不懂人生");
        }else{
            System.out.println("申请国家记录吧！");
        }




























//        int i=(int)(Math.random()*6)+1;
//        int j=(int)(Math.random()*6)+1;
//        int k=(int)(Math.random()*6)+1;
//
//        int count=i+j+k;
//        System.out.println("第一次掷骰子："+i);
//        System.out.println("第二次掷骰子："+j);
//        System.out.println("第三次掷骰子："+j);
//
//        if (count>15){
//            System.out.println("哟不错嘛！再来一次叭");
//        }else if(count>=10){
//            System.out.println("一般般吧哼");
//        }else{
//            System.out.println("非酋ヾ(￣▽￣)Bye~Bye~");
//        }
//        System.out.println("今天得分："+count);



    }
}
