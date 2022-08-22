package mao.t1;

/**
 * Project name(项目名称)：java设计模式_访问者模式
 * Package(包名): mao.t1
 * Class(类名): Dog
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/22
 * Time(创建时间)： 20:44
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Dog implements Animal
{

    @Override
    public void accept(Person person)
    {
        person.feed(this);
        System.out.println("狗被喂食");
    }
}
