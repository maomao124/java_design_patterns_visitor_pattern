package mao.t2;

/**
 * Project name(项目名称)：java设计模式_访问者模式
 * Package(包名): mao.t2
 * Class(类名): ReportUtil
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/22
 * Time(创建时间)： 21:19
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class ReportUtil
{
    public void visit(Staff staff)
    {
        if (staff instanceof Manager manager)
        {
            System.out.println("经理: " + manager.name + ", KPI: " + manager.kpi +
                    ", 新产品数量: " + manager.getProducts());
        }
        else if (staff instanceof Engineer engineer)
        {
            System.out.println("工程师: " + engineer.name + ", KPI: " + engineer.kpi);
        }
    }
}
