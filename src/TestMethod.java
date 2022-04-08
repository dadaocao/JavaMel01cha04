/**
 * 测试方法的定义和调用
 */

public class TestMethod {
    public static void main(String[] args) {
        sayLoveU();
        add(10,20,30);
    }

    public static void sayLoveU(){
        System.out.println("Love U");
        System.out.println("je t'aime");
        System.out.println("te amo");
    }
    public static int add(int a,int b, int c){
        int sum=a+b+c;
        System.out.println("sum:"+sum);
        return sum;//return两个作用:返回值，结束方法运行
    }

}
