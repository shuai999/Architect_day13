package cn.novate.architect_day13.simple2;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/13 15:49
 * Version 1.0
 * Params:
 * Description:    策略模式 - 人众金服计算方式
*/

public class RenzhongFinance implements IFinance {
    @Override
    public float finance(int month, int money) {
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
}
