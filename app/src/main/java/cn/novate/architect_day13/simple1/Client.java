package cn.novate.architect_day13.simple1;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/13 15:42
 * Version 1.0
 * Params:
 * Description:
*/

public class Client {
    public static void main(String[] args){
        FinanceManager financeManager = new FinanceManager() ;

        // 测试支付宝的 3个月
        float money = financeManager.finance(3 , 10000 , FinanceManager.Finance.ZHI_FU_BAO) ;
        System.out.println("money = " + money);  // money = 10117.5

    }
}
