package mao.double_dispatch;

/**
 * Project name(项目名称)：java设计模式_访问者模式
 * Package(包名): mao.double_dispatch
 * Class(类名): Animal
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/22
 * Time(创建时间)： 22:25
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Animal
{
    public void accept(Execute exe)
    {
        exe.execute(this);
    }
}
