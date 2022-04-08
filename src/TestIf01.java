/**
 * 测试if单分支结构
 * 写个掷骰子游戏
 *  1.如果三次的值加起来大于15，则手气不错
 *  2.如果三次的值加起来在10-15之间，一般
 *  3.如果三次的值加起来在10以下，不怎么样
 */

public class TestIf01 {
    public static void main(String[]args){
        int i=(int)(Math.random()*6)+1;
        int j=(int)(Math.random()*6)+1;
        int k=(int)(Math.random()*6)+1;

        int count=i+j+k;
        System.out.println("第一次掷骰子："+i);
        System.out.println("第二次掷骰子："+j);
        System.out.println("第三次掷骰子："+k);

        if (count>=15){
            System.out.println("哟不错嘛！再来一次叭");
        }
        if(count>=10&&count<15){
            System.out.println("一般般吧哼");
        }

        if(count<10){
            System.out.println("非酋ヾ(￣▽￣)Bye~Bye~");
        }
        System.out.println("今天得分："+count);
    }


}
