package mao.t2;

/**
 * Project name(项目名称)：java设计模式_访问者模式
 * Package(包名): mao.t2
 * Interface(接口名): Visitor
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/22
 * Time(创建时间)： 21:13
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public interface Visitor
{
    /**
     * 访问工程师
     *
     * @param engineer Engineer
     */
    void visit(Engineer engineer);

    /**
     * 访问经理
     *
     * @param manager Engineer
     */
    void visit(Manager manager);
}
