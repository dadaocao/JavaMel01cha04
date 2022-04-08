/**
 * 计算100之内的累加和，奇数和、偶数和
 */

public class PracticeForWhile_oddSum_Print130 {
    public static void main(String[] args) {

//        int sum=0;//总和
//        int oddSum=0;//奇数和
//        int evenSum=0;//偶数和
//        for(int i=0;i<101;i++){
//            sum=sum+i;//等价于sum += i;
//            if(i%2==0){
//            oddSum=oddSum+i;
//            }else{
//                evenSum=evenSum+i;
//            }
//        }
//        System.out.println("100之内数字和"+sum);
//        System.out.println("oddSum"+oddSum);
//        System.out.println("evenSum"+evenSum);
//
//
//        //再用while做一遍:
//        int i=0;
//        int sum1=0;
//        int oddSum1=0;
//        int evenSum1=0;
//
//        while (i<101){
//            sum1=sum1+i;
//            if(i%2==0){
//                evenSum1 +=i;
//            }else{
//                oddSum1 +=i;
//            }
//            i++;
//        }
//        System.out.println("总和、奇数和、偶数和分别为："+sum1+" "+oddSum1+" "+evenSum1+" ");

//    //使用while/for循环实现0-130之间的数，每行5个数字；
//        int a=0;
//        int count=0;//每行打印了几个数
//        while(a<131){
//            System.out.print(a+"\t");
//           //第一种方法对5取余；
//            if(a%5==0){
//                System.out.print("\n");
//            }
//            count++;
//            if(count==5){
//                System.out.println();
//                count=0;
//            }
//            a++;
//        }
        //用 while 和 for 循环输出 1-1000 之间能被 5 整除的数，且每行输出 3 个
        int count=0;
        for(int a=1;a<1000+1;a++){
            if(a%5==0){
                System.out.print(a+" ");
                count++;
                if(count==3){
                    System.out.println();
                    count = 0;
                }
            }else{
                continue;
            }
        }


    }
}
