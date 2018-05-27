package cn.novate.architect_day13.simple2;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/13 16:12
 * Version 1.0
 * Params:
 * Description:
*/

public class Client  {
    public static void main(String[] args){
        /*// 这个就是策略模式，就是把支付宝、人众金服的计算方法分离出来，需要计算哪个，就去new 哪个对象，如下边的写法
        IFinance finance = new RenzhongFinance() ;
//        IFinance finance = new ZhifubaoFinance() ;
        float money = finance.finance(12 , 10000) ;
        System.out.println("money =" + money);*/


        // 这里是采用上下文来写的，可以直接用上边的方式去写就可以
        IFinance finance = new RenzhongFinance() ;
        FinanceContext context = new FinanceContext(finance) ;
        float money = context.finance(12  ,10000) ;
        System.out.println("money =" + money);
    }
}
