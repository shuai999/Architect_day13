package cn.novate.architect_day13.simple2;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/13 15:48
 * Version 1.0
 * Params:
 * Description:    策略模式 - 支付宝计算方式
*/

public class ZhifubaoFinance implements IFinance {
    @Override
    public float finance(int month, int money) {
        if (month == 3) {
            return money + money * 0.047f / 12 * month;
        }
        if (month == 6) {
            return money + money * 0.05f / 12 * month;
        }
        if (month == 12) {
            return money + money * 0.06f / 12 * month;
        }
        throw new IllegalArgumentException("月份不对");
    }
}
