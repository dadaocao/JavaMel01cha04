/**
 * 带标签的continue帮助我们从内部循环跳到外部循环！
 * 控制嵌套循环跳转打印101-150之间所有的质数
 */

public class TestLableContinue {

    public static void main(String[] args) {
        outer:for (int i=2;i<10+1;i++){
           for(int j=2;j<Math.sqrt(i);j++) {
               if (i % j == 0) {
                   continue outer;//符合某条件，跳到外部循环继续
               }
           }
           System.out.print(i+" ");
        }
    }
}
