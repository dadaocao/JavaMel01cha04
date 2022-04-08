/**
 * 薪水计算器
 * (1) 通过键盘输入用户的月薪，每年是几个月薪水。
 * (2) 输出用户的年薪
 * (3) 输出一行字如果年薪超过10万，恭喜你超越90%的国人，如果年薪超过20万，恭喜你超越98%的国人。
 * (4) 键盘输入数字88，则退出程序（使用break退出循环）
 * (5) 键盘输入66，直接显示重新开始计算...继续计算
 */


import java.util.Scanner;
public class SalaryCalculate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);//ctrl alt v从右向左调用scanner函数
        System.out.println("***Salary calculate***");
        while(true){
            System.out.println("请输入月薪:");
            int monthSal= s.nextInt();
            System.out.println("请输入一年几个月薪资：");
            int months=s.nextInt();
            int yearSal=monthSal*months;

            System.out.println("您的年薪是："+yearSal);
            if(yearSal>200000){
                System.out.println("恭喜你超越98%的国人");
            }else if (yearSal>=100000){
                System.out.println("恭喜你超越90%的国人");
            }

            System.out.println("1.键盘输入数字88，则退出程序）\n2.键盘输入66，直接显示重新开始计算");
            int comm=s.nextInt();
            if(comm==88){
                System.out.println("系统退出！");
                break;
            }
            if (comm==66){
                System.out.println("继续计算下一个！");
                continue;
            }

        }
    }
}
