package mao.t2;

/**
 * Project name(项目名称)：java设计模式_访问者模式
 * Package(包名): mao.t2
 * Class(类名): CTOVisitor
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/22
 * Time(创建时间)： 21:20
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class CTOVisitor implements Visitor
{

    @Override
    public void visit(Engineer engineer)
    {
        System.out.println("工程师: " + engineer.name + ", 代码行数: " + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager)
    {
        System.out.println("经理: " + manager.name + ", 产品数量: " + manager.getProducts());
    }
}
