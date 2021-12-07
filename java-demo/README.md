# Java 基础知识梳理
## 1. 基本数据类型

    bit
    byte = 8bit
    kb = 1024 byte
    mb = 1024 kb
    gb = 1024 mb
    tb = 1024 gb
    pb = 1024 tb
    eb = 1024 pb
    zb = 1024 eb
    yb = 1024 zb
         
**（1）.整数类型**

byte，short（2 byte），int（4 byte），long（8 byte）
     
**（2）.浮点数类型**

float（4 byte），double（8 byte）
     
**（3）.字符类型**

char（2 byte）
     
**（4）.布尔类型**

boolean

    除了上述基本类型的变量，剩下的都是引用类型。

**（5）.引用类型**

    除了上述基本类型的变量，剩下的都是引用类型。例如，引用类型最常用的就是String字符串：
    String s = "hello";
    引用类型的变量类似于C语言的指针，它内部存储一个“地址”，指向某个对象在内存的位置
**（6）.数组类型**

    定义一个数组类型的变量，使用数组类型“类型[]”，例如，int[]。和单个基本类型变量不同，数组变量初始化必须使用new int[5]表示创建一个可容纳5个int元素的数组。
    
    Java的数组有几个特点：
    
    数组所有元素初始化为默认值，整型都是0，浮点型是0.0，布尔型是false；
    数组一旦创建后，大小就不可改变。
    要访问数组中的某一个元素，需要使用索引。数组索引从0开始，例如，5个元素的数组，索引范围是0~4。
    
    可以修改数组中的某一个元素，使用赋值语句，例如，ns[1] = 79;。
    
    可以用数组变量.length获取数组大小。
例子

    int[] ns = new int[5];

    String[] names = {"ABC", "XYZ", "zoo"};

总结

    数组是同一数据类型的集合，数组一旦创建后，大小就不可变；
    
    可以通过索引访问数组元素，但索引超出范围将报错；
    
    数组元素可以是值类型（如int）或引用类型（如String），但数组本身是引用类型；

**（7）.常量**

    定义变量的时候，如果加上final修饰符，这个变量就变成了常量：
    
    final double PI = 3.14; // PI是一个常量
    double r = 5.0;
    double area = PI * r * r;
    PI = 300; // compile error!
    常量在定义时进行初始化后就不可再次赋值，再次赋值会导致编译错误。
    
    常量的作用是用有意义的变量名来避免魔术数字（Magic number）。
    根据习惯，常量名通常全部大写。
**（8）.var关键字**

有些时候，类型的名字太长，写起来比较麻烦。例如：

    StringBuilder sb = new StringBuilder();
    这个时候，如果想省略变量类型，可以使用var关键字：
    
    var sb = new StringBuilder();
    编译器会根据赋值语句自动推断出变量sb的类型是StringBuilder。对编译器来说，语句：
    
    var sb = new StringBuilder();
    实际上会自动变成：
    
    StringBuilder sb = new StringBuilder();
    因此，使用var定义变量，仅仅是少写了变量类型而已。

## 2. 流程控制
### 2.1 输入输出
**（1）输出**

我们总是使用System.out.println()来向屏幕输出一些内容。
println是print line的缩写，表示输出并换行。因此，如果输出后不想换行，可以用print()：

    public class Main {
        public static void main(String[] args) {
            System.out.print("A,");
            System.out.print("B,");
            System.out.print("C.");
            System.out.println();
            System.out.println("END");
        }
    }

**格式化输出**

如果要把数据显示成我们期望的格式，就需要使用格式化输出的功能。格式化输出使用System.out.printf()，通过使用占位符%?，printf()可以把后面的参数格式化成指定格式：

    public class Main {
        public static void main(String[] args) {
            double d = 3.1415926;
            System.out.printf("%.2f\n", d); // 显示两位小数3.14
            System.out.printf("%.4f\n", d); // 显示4位小数3.1416
        }
    }

**占位符说明**

|占位符|说明|
|---|----|
|%d|格式化输出整数|
|%x|格式化输出十六进制整数|
|%f|格式化输出浮点数|
|%e|格式化输出科学计数法表示的浮点数|
|%s|格式化字符串|

注意，由于%表示占位符，因此，连续两个%%表示一个%字符本身。

**（2） 输入**

我们先看一个从控制台读取一个字符串和一个整数的例子：

    import java.util.Scanner;
    
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); // 创建Scanner对象
            System.out.print("Input your name: "); // 打印提示
            String name = scanner.nextLine(); // 读取一行输入并获取字符串
            System.out.print("Input your age: "); // 打印提示
            int age = scanner.nextInt(); // 读取一行输入并获取整数
            System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
        }
    }
首先，我们通过import语句导入java.util.Scanner，import是导入某个类的语句，必须放到Java源代码的开头，后面我们在Java的package中会详细讲解如何使用import。

然后，创建Scanner对象并传入System.in。System.out代表标准输出流，而System.in代表标准输入流。直接使用System.in读取用户输入虽然是可以的，但需要更复杂的代码，而通过Scanner就可以简化后续的代码。

有了Scanner对象后，要读取用户输入的字符串，使用scanner.nextLine()，要读取用户输入的整数，使用scanner.nextInt()。Scanner会自动转换数据类型，因此不必手动转换。

要测试输入，我们不能在线运行它，因为输入必须从命令行读取，因此，需要走编译、执行的流程：

    $ javac Main.java

这个程序编译时如果有警告，可以暂时忽略它，在后面学习IO的时候再详细解释。编译成功后，执行：

    $ java Main
    Input your name: Bob
    Input your age: 12
    Hi, Bob, you are 12

根据提示分别输入一个字符串和整数后，我们得到了格式化的输出。

### 2.2 if判断
if语句的基本语法是：

    if (条件) {
    // 条件满足时执行
    }
### 2.3 switch多重选择

switch语句根据switch (表达式)计算的结果，跳转到匹配的case结果，然后继续执行后续语句，直到遇到break结束执行。

    public class Main {
        public static void main(String[] args) {
            int option = 1;
            switch (option) {
                case 1:
                System.out.println("Selected 1");
                break;
                case 2:
                System.out.println("Selected 2");
                break;
                case 3:
                System.out.println("Selected 3");
                break;
            }
        }
    }
### 2.4 while循环
基本用法：

    while (条件表达式) {
        循环语句
    }

### 2.5 do while 循环
基本用法：

    do {
        执行循环语句
    } while (条件表达式);

### 2.6 for循环
基本用法：

    for (初始条件; 循环检测条件; 循环后更新计数器) {
    // 执行语句
    }
### 2.7 break和continue
在循环过程中，可以使用break语句跳出当前循环。

    public class Main {
        public static void main(String[] args) {
            int sum = 0;
            for (int i=1; ; i++) {
                sum = sum + i;
                if (i == 100) {
                    break;
                }
            }
            System.out.println(sum);
        }
    }

continue则是提前结束本次循环，直接继续执行下次循环。

    public class Main {
        public static void main(String[] args) {
            int sum = 0;
            for (int i=1; i<=10; i++) {
                System.out.println("begin i = " + i);
                if (i % 2 == 0) {
                    continue; // continue语句会结束本次循环
                }
                sum = sum + i;
                System.out.println("end i = " + i);
            }
            System.out.println(sum); // 25
        }
    }
## 3. 数组操作
### 3.1 遍历数组
方法1：

    int[] ns = { 1, 4, 9, 16, 25 };
    for (int i=0; i<ns.length; i++) {
        int n = ns[i];
        System.out.println(n);
    }
方法2：

    int[] ns = { 1, 4, 9, 16, 25 };
    for (int n : ns) {
        System.out.println(n);
    }

打印数组：

    int[] ns = { 1, 1, 2, 3, 5, 8 };
    System.out.println(Arrays.toString(ns));
### 3.2 数组排序

    int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
    Arrays.sort(ns);
    System.out.println(Arrays.toString(ns));

### 3.3 多维数组
    int[][] ns = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 }
    };
    System.out.println(ns.length); // 3

## 4. 面向对象基础 - OOP（Object-Oriented Programming）
### 4.1 构造方法
构造方法和类名相同，且可以有多个不同参数的构造方法。
### 4.2 方法重载
在一个类中，我们可以定义多个方法。如果有一系列方法，它们的功能都是类似的，只有参数有所不同，那么，可以把这一组方法名做成同名方法。例如，在Hello类中，定义多个hello()方法：

    class Hello {
        public void hello() {
            System.out.println("Hello, world!");
        }

        public void hello(String name) {
            System.out.println("Hello, " + name + "!");
        }
    
        public void hello(String name, int age) {
            if (age < 18) {
                System.out.println("Hi, " + name + "!");
            } else {
                System.out.println("Hello, " + name + "!");
            }
        }
    }
这种方法名相同，但各自的参数不同，称为方法重载（Overload）。

注意：方法重载的返回值类型通常都是相同的。

方法重载的目的是，功能类似的方法使用同一名字，更容易记住，因此，调用起来更简单。
### 4.3 继承
### 4.4 多态
### 4.5 抽象类 
    如果父类的方法本身不需要实现任何功能，仅仅是为了定义方法签名，目的是让子类去覆写它，那么，可以把父类的方法声明为抽象方法。
### 4.6 接口 
### 4.7 静态字段和方法 
### 4.8 包 
### 4.9 作用域 
### 4.10 内部类 
### 4.11 classpath和jar 
### 4.12 模块

## 5. TODO 面向对象-核心类

## 6. TODO 异常处理
## 7. TODO 反射
## 8. TODO 注解
## 9. TODO 泛型
## 10. TODO 集合
## 11. TODO IO
## 12. TODO 日期和时间
## 13. TODO 单元测试
## 14. TODO 正则表达式
## 15. TODO 加密与安全
## 16. TODO 多线程
## 17. TODO Maven基础
## 18. TODO 网络编程
## 19. TODO XML与JSON
## 20. TODO JDBC编程
## 21. TODO 函数式编程
## 22. TODO 设计模式
## 23. TODO WEB开发
## 24. TODO Spring开发
## 25. TODO Spring Boot开发
## 26. TODO Spring Cloud开发