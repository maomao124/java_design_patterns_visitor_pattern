package mao.t1;

import java.util.ArrayList;
import java.util.List;

/**
 * Project name(项目名称)：java设计模式_访问者模式
 * Package(包名): mao.t1
 * Class(类名): Home
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/22
 * Time(创建时间)： 20:48
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Home
{
    private final List<Animal> nodeList = new ArrayList<>();

    public void add(Animal animal)
    {
        nodeList.add(animal);
    }

    public void action(Person person)
    {
        for (Animal animal : nodeList)
        {
            animal.accept(person);
        }
    }
}
