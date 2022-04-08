/**
 * 测试if-else双分支结构
 */

public class TestIf02 {
    public static void main(String[]args){
        double r=4*Math.random();
        double area=3.14*r*r;
        double circle=2*Math.PI*r;

        System.out.println("半径："+r);
        System.out.println("面积："+area);
        System.out.println("周长："+circle);

        if(area>=circle) {
            System.out.println("面积大于等于周长");
        }else{
            System.out.println("周长大于面积");
        }


        //条件运算符
        int a=3,b=4;
        int c=a<b?b:a;//把a、b中更大的数字返回
        System.out.println(c);

        //上面的等价于:
        if(a>b){
            c=a;
        }else{
            c=b;
        }
        System.out.println(c);
    }
}
