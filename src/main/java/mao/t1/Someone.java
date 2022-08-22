package mao.t1;

/**
 * Project name(项目名称)：java设计模式_访问者模式
 * Package(包名): mao.t1
 * Class(类名): Someone
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/22
 * Time(创建时间)： 20:48
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Someone implements Person
{

    @Override
    public void feed(Cat cat)
    {
        System.out.println("其他人喂食猫");
    }

    @Override
    public void feed(Dog dog)
    {
        System.out.println("其他人喂食狗");
    }
}
