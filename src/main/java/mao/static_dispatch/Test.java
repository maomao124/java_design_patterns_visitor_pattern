package mao.static_dispatch;

/**
 * Project name(项目名称)：java设计模式_访问者模式
 * Package(包名): mao.static_dispatch
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/22
 * Time(创建时间)： 22:21
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Animal();

        Execute execute = new Execute();
        execute.execute(animal1);
        execute.execute(animal2);
        execute.execute(animal3);
    }
}
