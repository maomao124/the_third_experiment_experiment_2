/**
 * Project name(项目名称)：第三次实验 实验2
 * Package(包名): PACKAGE_NAME
 * Class(类名): Cat
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/5
 * Time(创建时间)： 22:25
 * Version(版本): 1.0
 * Description(描述)： b)定义一个Cat类继承Animal类，增添furColor成员变量，重写构造方法和sing()方法，sing()方法输出"猫叫声...."。
 */

public class Cat extends Animal
{
    private String furColor;

    public Cat(String name, String furColor)
    {
        super(name);
        this.furColor = furColor;
    }

    public Cat(String furColor)
    {
        this.furColor = furColor;
    }

    public String getFurColor()
    {
        return furColor;
    }

    public void setFurColor(String furColor)
    {
        this.furColor = furColor;
    }

    @Override
    public void sing()
    {
        System.out.println("猫叫声....");
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("类名：").append(getClass().getName()).append('\t');
        stringbuilder.append("名字：").append(name).append('\t');
        stringbuilder.append("颜色：").append(furColor);
        return stringbuilder.toString();
    }
}
