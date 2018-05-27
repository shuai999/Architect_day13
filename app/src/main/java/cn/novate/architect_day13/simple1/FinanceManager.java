package cn.novate.architect_day13.simple1;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/13 15:34
 * Version 1.0
 * Params:
 * Description:
*/

public class FinanceManager {


    /**
     * 枚举
     */
    public enum Finance{
        ZHI_FU_BAO , REN_ZHONG
        // 后边肯定还会有很多，比如腾讯的、华为的、小米的等等，那么这里的代码就会越来越多，
        // 并且下边的方法也会越来越多，这样做肯定是不行的，下边看 simple2中的策略模式是如何写的
    }
    /**
     * 支付宝计算
     */
    private float zhifubaoFinance(int month  ,int money){
        if (month == 3){
            return money + money * 0.047f / 12 * month;  // 本金 + 利息
        }
        if (month == 6){
            return money + money * 0.05f / 12 * month;
        }
        if (month == 12){
            return money + money * 0.06f / 12 * month;
        }
        throw new IllegalArgumentException("月份不对") ;
    }

    /**
     * 人众金服计算
     */
    private float renzhongFinance(int month, int money) {
        if (month == 3) {
            return money + money * 0.09f / 12 * month;
        }
        if (month == 6) {
            return money + money * 0.112f / 12 * month;
        }
        if (month == 12) {
            return money + money * 0.12f / 12 * month;
        }
        throw new IllegalArgumentException("月份不对");
    }


    /**
     * 获取计算方式
     */
    public float finance(int month, int money , Finance finance){
        switch (finance){
            case ZHI_FU_BAO:
                 return zhifubaoFinance(month , money) ;
            case REN_ZHONG:
                 return renzhongFinance(month , money) ;
            default:
                 return 0f ;
        }
    }
}
