/**
 * 测试嵌套循环
 */
public class TestLoop {
    public static void main(String[] args) {
        //输出矩阵
//        for(int m=1;m<6;m++){
//            for (int i=0;i<5;i++){
//                System.out.print(m+"\t");
//            }
//            System.out.println();
//        }

        //打印九九乘法表：
        System.out.println("九九乘法表，用了都说好");
        for(int m=1;m<10;m++) {
            for (int i = 1; i <= m; i++) {
                System.out.print(i + "*" + m + "=" +( i*m<10?" "+i*m:""+i*m )+ "\t");
            }
            System.out.println();
        }

//        //矩阵小练习；
//
//        for (int j=1;j<6;j++) {
//            for (int i = 1; i < 6; i++) {
//                System.out.print("*" + "\t");//想要制表符则去掉ln，错了一万遍了。
//            }
//            System.out.println();
//        }




//        //矩阵小练习(失败...)
//        for(int j=1;j<6;j++) {
//            for (int i = 1; i < 6; i++) {
//                System.out.print(((i % 2) == 0 ? "#" : "*") + "\t");
//            }
//            System.out.println();
//        }


        //课堂作业，交替打印*和#（改正）
        int count=0, n=6;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (count%2==0){
                    System.out.print("#\t");
                }else{
                    System.out.print("*\t");
                }
                count += 1;
            }
            if(n%2==0){
                count += 1;
            }

            System.out.println();
        }











    }
}
