package cn.novate.architect_day13.simple2;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/13 15:55
 * Version 1.0
 * Params:
 * Description: 这个类有点多余，可以不写
 *              策略模式的上下文，类似于 android 中的 Context，
 *              可以通过这个FinanceContext 获取一些额外的基本信息 - 和理财有关的
*/

public class FinanceContext {
    private IFinance finance ;
    public FinanceContext(IFinance finance){
        this.finance = finance ;
    }


    public float finance(int month , int money){
        return finance.finance(month , money) ;
    }
}
