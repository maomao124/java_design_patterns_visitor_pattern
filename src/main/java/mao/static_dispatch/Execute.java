package mao.static_dispatch;

/**
 * Project name(项目名称)：java设计模式_访问者模式
 * Package(包名): mao.static_dispatch
 * Class(类名): Execute
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/22
 * Time(创建时间)： 22:20
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Execute
{
    /**
     * Execute.
     *
     * @param animal the animal
     */
    public void execute(Animal animal)
    {
        System.out.println("Animal");
    }

    /**
     * Execute.
     *
     * @param dog the dog
     */
    public void execute(Dog dog)
    {
        System.out.println("dog");
    }

    /**
     * Execute.
     *
     * @param cat the cat
     */
    public void execute(Cat cat)
    {
        System.out.println("cat");
    }
}
