/**
 * 测试seitch语句的用法
 */

public class TestSwitch01 {
    public static void main (String[]args){
        int grade=(int)(Math.random()*4+1);//大学的年级；
       // System.out.println(grade);
        switch(grade){
            case 1:
                System.out.println("大一不要迷茫！好好学习");
                break;
            case 2:
                System.out.println("大二！加油");
                break;
            case 3:
                System.out.println("大三！真快呀");
                break;
            default:
                System.out.println("马上工作啦！");

                //以上也可以用if else实现：

        if(grade==1){
            System.out.println("freshman!");
        }else if (grade==2) {
            System.out.println("sophomore");
        }else if (grade==3) {
            System.out.println("junior year student");
        }else{
                System.out.println("senior year student");
        }

        }
    }


}
