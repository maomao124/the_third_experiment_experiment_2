/**
 * Project name(项目名称)：第三次实验 实验2
 * Package(包名): PACKAGE_NAME
 * Class(类名): Animal
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/5
 * Time(创建时间)： 22:23
 * Version(版本): 1.0
 * Description(描述)： a)定义一个动物类Animal，具有name成员变量，构造方法和sing()方法，sing()方法输出"动物叫声...."。
 */

public class Animal
{
    protected String name;

    public Animal(String name)
    {
        this.name = name;
    }

    public Animal()
    {

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void sing()
    {
        System.out.println("动物叫声....");
    }
}
