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
         
（1）.整数类型：byte，short（2 byte），int（4 byte），long（8 byte）
     
（2）.浮点数类型：float（4 byte），double（8 byte）
     
（3）.字符类型：char（2 byte）
     
（4）.布尔类型：boolean

    除了上述基本类型的变量，剩下的都是引用类型。

（5）.引用类型

    除了上述基本类型的变量，剩下的都是引用类型。例如，引用类型最常用的就是String字符串：
    String s = "hello";
    引用类型的变量类似于C语言的指针，它内部存储一个“地址”，指向某个对象在内存的位置
（6）.数组类型

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

（7）.常量

    定义变量的时候，如果加上final修饰符，这个变量就变成了常量：
    
    final double PI = 3.14; // PI是一个常量
    double r = 5.0;
    double area = PI * r * r;
    PI = 300; // compile error!
    常量在定义时进行初始化后就不可再次赋值，再次赋值会导致编译错误。
    
    常量的作用是用有意义的变量名来避免魔术数字（Magic number）。
    根据习惯，常量名通常全部大写。
（8）.var关键字

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
## 3. 数组操作
## 4. 面向对象 - OOP（Object-Oriented Programming）
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
