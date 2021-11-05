/**
 * Project name(项目名称)：第三次实验 实验2
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/5
 * Time(创建时间)： 22:22
 * Version(版本): 1.0
 * Description(描述)： 2. 多态的实现
 * 编写一个Java应用程序，该程序中有3个类：Animal、Cat、Bird，分别来刻画动物、猫和鸟。实现面向对象程序设计中的多态特性，
 * 也就是在“执行期间而非编译期间”判断所引用的对象的实际类型,根据其实际的类型调用其相应的方法。
 * 要有继承、要有重写、父类引用指向子类对象。具体要求如下：
 * a)定义一个动物类Animal，具有name成员变量，构造方法和sing()方法，sing()方法输出"动物叫声...."。
 * b)定义一个Cat类继承Animal类，增添furColor成员变量，重写构造方法和sing()方法，sing()方法输出"猫叫声...."。
 * c)定义一个Bird类继承Animal类，增添featherColor成员变量，重写构造方法和sing()方法，sing()方法输出"鸟叫声...."。
 * d)在main方法中创建Cat类型和Bird类型对象，并分别把对象的引用赋值给一个Animal引用类型变量pet1和pet2，
 * 最后调用引用变量pet1和pet2的方法sing()，并将结果输出。看这两者的输出是否有什么不同。
 */

public class test
{
    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        Animal pet1 = new Cat("小黑", "黑色");
        Animal pet2 = new Bird("小蓝鸟", "蓝色");
        pet1.sing();
        pet2.sing();
        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println();
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------

    }
}
