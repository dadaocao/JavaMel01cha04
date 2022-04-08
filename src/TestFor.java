/**;
 * 测试for循环
 */

public class TestFor {
    public static void main(String[]args){
        int a=0;//初始化
        while(a<3){//布尔表达式
        System.out.println("I LOVE U!"+a);//循环体
        a++;//迭代因子
        }

        for(int b=0;b<3;b++){
            System.out.println("I LOVE U!"+b);
        }

        int summ=0;
        for(int c=1; c<=100; c++ ){
            summ= summ+c;
            System.out.println("1到100累加="+summ);
        }

        //输出9-1之间的数字：
        for(int l=9;l>0;l--){
            System.out.println("9-1之间有哪些数字？"+l);
        }

        //输出90-1之间能被3整除的数字：


        for(int w=90; w>0;w-=3) {
            System.out.println(w);
        }
        //不用计算啥除不除法的了；了另外，w-=3也即w=w-3噢~

    }
}
