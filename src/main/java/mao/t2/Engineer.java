package mao.t2;

import java.util.Random;

/**
 * Project name(项目名称)：java设计模式_访问者模式
 * Package(包名): mao.t2
 * Class(类名): Engineer
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/22
 * Time(创建时间)： 21:10
 * Version(版本): 1.0
 * Description(描述)： 工程师类
 */

public class Engineer extends Staff
{

    public Engineer(String name)
    {
        super(name);
    }

    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }

    /**
     * 获得工程师的代码行数
     *
     * @return 代码行数
     */
    public int getCodeLines()
    {
        //这里随机
        return new Random().nextInt(10 * 10000);
    }
}
