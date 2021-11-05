/**
 * Project name(项目名称)：第三次实验 实验2
 * Package(包名): PACKAGE_NAME
 * Class(类名): Bird
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/5
 * Time(创建时间)： 22:28
 * Version(版本): 1.0
 * Description(描述)： c)定义一个Bird类继承Animal类，增添featherColor成员变量，重写构造方法和sing()方法，sing()方法输出"鸟叫声...."。
 */

public class Bird extends Animal
{
    private String featherColor;

    public Bird(String name, String featherColor)
    {
        super(name);
        this.featherColor = featherColor;
    }

    public Bird(String featherColor)
    {
        this.featherColor = featherColor;
    }

    @Override
    public void sing()
    {
        System.out.println("鸟叫声....");
    }

    public String getFeatherColor()
    {
        return featherColor;
    }

    public void setFeatherColor(String featherColor)
    {
        this.featherColor = featherColor;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("类名：").append(getClass().getName()).append('\t');
        stringbuilder.append("名字：").append(name).append('\t');
        stringbuilder.append("颜色：").append(featherColor);
        return stringbuilder.toString();
    }
}
