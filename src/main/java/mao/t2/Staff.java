package mao.t2;

import java.util.Random;

/**
 * Project name(项目名称)：java设计模式_访问者模式
 * Package(包名): mao.t2
 * Class(类名): Staff
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/22
 * Time(创建时间)： 21:09
 * Version(版本): 1.0
 * Description(描述)： 员工基类
 */

public abstract class Staff
{
    //员工姓名
    public String name;
    //员工KPI
    public int kpi;

    public Staff(String name)
    {
        this.name = name;
        //随机
        kpi = new Random().nextInt(10);
    }

    //核心方法，接受Visitor的访问
    public abstract void accept(Visitor visitor);
}
