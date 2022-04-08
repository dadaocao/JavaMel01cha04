/**
 * 测试switch语句之不支持long,但是byte char string都可以自动转为int！
 */

public class TestSwitch03 {
    public static void main(String[]args){
    String computer="联想";
    switch(computer){
        case "联想":
            System.out.println("柳传志跑路啦");
            break;
        case "华为":
            System.out.println("支持华为！");
            break;
        default:
            System.out.println("其他品牌！");
            break;
    }




    }
}
