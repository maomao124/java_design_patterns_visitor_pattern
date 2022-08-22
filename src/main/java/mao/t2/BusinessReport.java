package mao.t2;

import java.util.LinkedList;
import java.util.List;

/**
 * Project name(项目名称)：java设计模式_访问者模式
 * Package(包名): mao.t2
 * Class(类名): BusinessReport
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/22
 * Time(创建时间)： 21:15
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class BusinessReport
{
    private final List<Staff> mStaffs = new LinkedList<>();

    /**
     * Instantiates a new Business report.
     */
    public BusinessReport()
    {
        mStaffs.add(new Manager("经理-A"));
        mStaffs.add(new Engineer("工程师-A"));
        mStaffs.add(new Engineer("工程师-B"));
        mStaffs.add(new Engineer("工程师-C"));
        mStaffs.add(new Manager("经理-B"));
        mStaffs.add(new Engineer("工程师-D"));
    }

    /**
     * 展示报表
     *
     * @param visitor Visitor 实现类
     */
    public void showReport(Visitor visitor)
    {
        for (Staff staff : mStaffs)
        {
            staff.accept(visitor);
        }
    }
}
