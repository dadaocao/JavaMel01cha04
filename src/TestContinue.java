/**
 * 测试continue语句
 * 把100-150之间不能被三整除的数输出，并且每行输出5个
 */
public class TestContinue {
    public static void main(String[] args) {
        int count=0;
        for(int j=100;j<151;j++){
            if (j%3==0){
                continue;
            }
            System.out.print(j+" ");
            count ++;
            if (count%5==0){
                System.out.println();
            }
        }
    }

}
