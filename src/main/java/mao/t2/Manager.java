package mao.t2;

import java.util.Random;

/**
 * Project name(项目名称)：java设计模式_访问者模式
 * Package(包名): mao.t2
 * Class(类名): Manager
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/22
 * Time(创建时间)： 21:12
 * Version(版本): 1.0
 * Description(描述)： 经理
 */

public class Manager extends Staff
{

    public Manager(String name)
    {
        super(name);
    }

    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }

    /**
     * 获得经理一年的产品数量
     *
     * @return 产品数量
     */
    public int getProducts()
    {
        //这里也是随机
        return new Random().nextInt(10);
    }

}
