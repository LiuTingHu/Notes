<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->


- [面向对象 OOP（Object-Oriented Programming）](#%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1-oopobject-oriented-programming)
  - [1. 面向对象基础](#1-%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E5%9F%BA%E7%A1%80)
    - [1.1 构造方法](#11-%E6%9E%84%E9%80%A0%E6%96%B9%E6%B3%95)
    - [1.2 方法重载](#12-%E6%96%B9%E6%B3%95%E9%87%8D%E8%BD%BD)
    - [1.3 继承](#13-%E7%BB%A7%E6%89%BF)
    - [1.4 多态](#14-%E5%A4%9A%E6%80%81)
      - [1.4.1 覆写Object方法](#141-%E8%A6%86%E5%86%99object%E6%96%B9%E6%B3%95)
      - [1.4.2 调用super](#142-%E8%B0%83%E7%94%A8super)
      - [1.4.3 final](#143-final)
    - [1.5 抽象类](#15-%E6%8A%BD%E8%B1%A1%E7%B1%BB)
      - [1.5.1 定义](#151-%E5%AE%9A%E4%B9%89)
      - [1.5.2 意义](#152-%E6%84%8F%E4%B9%89)
      - [1.5.3 面向抽象编程](#153-%E9%9D%A2%E5%90%91%E6%8A%BD%E8%B1%A1%E7%BC%96%E7%A8%8B)
      - [1.5.4 总结](#154-%E6%80%BB%E7%BB%93)
    - [1.6 接口](#16-%E6%8E%A5%E5%8F%A3)
      - [1.6.1 定义](#161-%E5%AE%9A%E4%B9%89)
      - [1.6.2 default方法](#162-default%E6%96%B9%E6%B3%95)
      - [1.6.3 总结](#163-%E6%80%BB%E7%BB%93)
    - [1.7 静态字段和方法](#17-%E9%9D%99%E6%80%81%E5%AD%97%E6%AE%B5%E5%92%8C%E6%96%B9%E6%B3%95)
      - [1.7.1 静态字段](#171-%E9%9D%99%E6%80%81%E5%AD%97%E6%AE%B5)
      - [1.7.2 静态方法](#172-%E9%9D%99%E6%80%81%E6%96%B9%E6%B3%95)
      - [1.7.3 接口的静态字段](#173-%E6%8E%A5%E5%8F%A3%E7%9A%84%E9%9D%99%E6%80%81%E5%AD%97%E6%AE%B5)
      - [1.7.4 总结](#174-%E6%80%BB%E7%BB%93)
    - [1.8 包](#18-%E5%8C%85)
    - [1.9 作用域](#19-%E4%BD%9C%E7%94%A8%E5%9F%9F)
    - [1.10 内部类](#110-%E5%86%85%E9%83%A8%E7%B1%BB)
    - [1.11 classpath和jar](#111-classpath%E5%92%8Cjar)
      - [1.11.1 classpath](#1111-classpath)
      - [1.11.2 jar](#1112-jar)
      - [1.11.3 总结](#1113-%E6%80%BB%E7%BB%93)
    - [1.12 模块](#112-%E6%A8%A1%E5%9D%97)
  - [2. 面向对象-核心类](#2-%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1-%E6%A0%B8%E5%BF%83%E7%B1%BB)
    - [2.1 字符串和编码](#21-%E5%AD%97%E7%AC%A6%E4%B8%B2%E5%92%8C%E7%BC%96%E7%A0%81)
    - [2.2 StringBuilder](#22-stringbuilder)
    - [2.3 StringJoiner](#23-stringjoiner)
    - [2.4 包装类型](#24-%E5%8C%85%E8%A3%85%E7%B1%BB%E5%9E%8B)
    - [2.5 JavaBean](#25-javabean)
    - [2.6 枚举](#26-%E6%9E%9A%E4%B8%BE)
    - [2.7 记录类（不变类）](#27-%E8%AE%B0%E5%BD%95%E7%B1%BB%E4%B8%8D%E5%8F%98%E7%B1%BB)
    - [2.8 BigInteger](#28-biginteger)
    - [2.9 BigDecimal](#29-bigdecimal)
    - [2.10 常用工具类](#210-%E5%B8%B8%E7%94%A8%E5%B7%A5%E5%85%B7%E7%B1%BB)
      - [2.10.1 Math](#2101-math)
      - [2.10.2 三角函数](#2102-%E4%B8%89%E8%A7%92%E5%87%BD%E6%95%B0)
      - [2.10.3 数学常量](#2103-%E6%95%B0%E5%AD%A6%E5%B8%B8%E9%87%8F)
      - [2.10.4 生成一个随机数x](#2104-%E7%94%9F%E6%88%90%E4%B8%80%E4%B8%AA%E9%9A%8F%E6%9C%BA%E6%95%B0x)
      - [2.10.5 Random](#2105-random)
      - [1.10.6 SecureRandom](#1106-securerandom)
      - [1.10.7 总结](#1107-%E6%80%BB%E7%BB%93)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->

# 面向对象 OOP（Object-Oriented Programming）
## 1. 面向对象基础
### 1.1 构造方法
构造方法和类名相同，且可以有多个不同参数的构造方法。
### 1.2 方法重载
在一个类中，我们可以定义多个方法。如果有一系列方法，它们的功能都是类似的，只有参数有所不同，那么，可以把这一组方法名做成同名方法。例如，在Hello类中，定义多个hello()方法：
```java
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
```
这种方法名相同，但各自的参数不同，称为方法重载（Overload）。

注意：方法重载的返回值类型通常都是相同的。

方法重载的目的是，功能类似的方法使用同一名字，更容易记住，因此，调用起来更简单。

### 1.3 继承

![img.png](imgs/img.png)

Java只允许一个class继承自一个类，因此，一个类有且仅有一个父类。只有Object特殊，它没有父类。

总结：
1. 继承是面向对象编程的一种强大的代码复用方式； 
2. Java只允许单继承，所有类最终的根类是Object； 
3. protected允许子类访问父类的字段和方法； 
4. 子类的构造方法可以通过super()调用父类的构造方法； 
5. 可以安全地向上转型为更抽象的类型； 
6. 可以强制向下转型，最好借助instanceof判断； 
7. 子类和父类的关系是is，has关系不能用继承

### 1.4 多态
多态是指，针对某个类型的方法调用，其真正执行的方法取决于运行时期实际类型的方法。例如：
```java
    Person p = new Student();
    p.run(); // 无法确定运行时究竟调用哪个run()方法
```
有童鞋会问，从上面的代码一看就明白，肯定调用的是Student的run()方法啊。

但是，假设我们编写这样一个方法：
```java
    public void runTwice(Person p) {
        p.run();
        p.run();
    }
```
它传入的参数类型是Person，我们是无法知道传入的参数实际类型究竟是Person，还是Student，还是Person的其他子类，因此，也无法确定调用的是不是Person类定义的run()方法。

所以，多态的特性就是，运行期才能动态决定调用的子类方法。对某个类型调用某个方法，执行的实际方法可能是某个子类的覆写方法。

#### 1.4.1 覆写Object方法

因为所有的class最终都继承自Object，而Object定义了几个重要的方法：
    
    toString()：把instance输出为String；
    equals()：判断两个instance是否逻辑相等；
    hashCode()：计算一个instance的哈希值。

在必要的情况下，我们可以覆写Object的这几个方法。例如：
```java
    class Person {
        ...
        // 显示更有意义的字符串:
        @Override
        public String toString() {
            return "Person:name=" + name;
        }
    
        // 比较是否相等:
        @Override
        public boolean equals(Object o) {
            // 当且仅当o为Person类型:
            if (o instanceof Person) {
                Person p = (Person) o;
                // 并且name字段相同时，返回true:
                return this.name.equals(p.name);
            }
            return false;
        }
        // 计算hash:
        @Override
        public int hashCode() {
            return this.name.hashCode();
        }
    }
```
#### 1.4.2 调用super
在子类的覆写方法中，如果要调用父类的被覆写的方法，可以通过super来调用。例如：
```java
    class Person {
        protected String name;
        public String hello() {
            return "Hello, " + name;
        }
    }
    
    Student extends Person {
        @Override
        public String hello() {
            // 调用父类的hello()方法:
            return super.hello() + "!";
        }
    }
```
#### 1.4.3 final
继承可以允许子类覆写父类的方法。如果一个父类不允许子类对它的某个方法进行覆写，可以把该方法标记为final。用final修饰的方法不能被Override：
```java
    class Person {
        protected String name;
        public final String hello() {
            return "Hello, " + name;
        }
    }
    
    Student extends Person {
        // compile error: 不允许覆写
        @Override
        public String hello() {
        }
    }
```
如果一个类不希望任何其他类继承自它，那么可以把这个类本身标记为final。用final修饰的类不能被继承：
```java
    final class Person {
        protected String name;
    }
    
    // compile error: 不允许继承自Person
    Student extends Person {
    }
```
总结：

* 子类可以覆写父类的方法（Override），覆写在子类中改变了父类方法的行为； 
* Java的方法调用总是作用于运行期对象的实际类型，这种行为称为多态； 
* final修饰符有多种作用： 
  * final修饰的方法可以阻止被覆写； 
  * final修饰的class可以阻止被继承； 
  * final修饰的field必须在创建对象时初始化，随后不可修改。

### 1.5 抽象类
    如果父类的方法本身不需要实现任何功能，仅仅是为了定义方法签名，目的是让子类去覆写它，那么，可以把父类的方法声明为抽象方法。
```java
class Person {
    public abstract void run();
}
```

把一个方法声明为abstract，表示它是一个抽象方法，本身没有实现任何方法语句。因为这个抽象方法本身是无法执行的，所以，Person类也无法被实例化。编译器会告诉我们，无法编译Person类，因为它包含抽象方法。

必须把Person类本身也声明为abstract，才能正确编译它：
```java
abstract class Person {
    public abstract void run();
}
```
#### 1.5.1 定义

如果一个class定义了方法，但没有具体执行代码，这个方法就是抽象方法，抽象方法用abstract修饰。

因为无法执行抽象方法，因此这个类也必须申明为抽象类（abstract class）。

使用abstract修饰的类就是抽象类。我们无法实例化一个抽象类。

#### 1.5.2 意义

因为抽象类本身被设计成只能用于被继承，因此，抽象类可以强迫子类实现其定义的抽象方法，否则编译会报错。因此，抽象方法实际上相当于定义了“规范”。

#### 1.5.3 面向抽象编程

当我们定义了抽象类Person，以及具体的Student、Teacher子类的时候，我们可以通过抽象类Person类型去引用具体的子类的实例：

```java
Person s = new Student();
Person t = new Teacher();
```
这种引用抽象类的好处在于，我们对其进行方法调用，并不关心Person类型变量的具体子类型：

```java
// 不关心Person变量的具体子类型:
s.run();
t.run();
```

同样的代码，如果引用的是一个新的子类，我们仍然不关心具体类型：

```java
// 同样不关心新的子类是如何实现run()方法的：
Person e = new Employee();
e.run();
```

这种尽量引用高层类型，避免引用实际子类型的方式，称之为面向抽象编程。

面向抽象编程的本质就是：
- 上层代码只定义规范（例如：abstract class Person）；
- 不需要子类就可以实现业务逻辑（正常编译）；
- 具体的业务逻辑由不同的子类实现，调用者并不关心。

#### 1.5.4 总结
- 通过abstract定义的方法是抽象方法，它只有定义，没有实现。抽象方法定义了子类必须实现的接口规范； 
- 定义了抽象方法的class必须被定义为抽象类，从抽象类继承的子类必须实现抽象方法； 
- 如果不实现抽象方法，则该子类仍是一个抽象类； 
- 面向抽象编程使得调用者只关心抽象方法的定义，不关心子类的具体实现。

### 1.6 接口

#### 1.6.1 定义
在抽象类中，抽象方法本质上是定义接口规范：即规定高层类的接口，从而保证所有子类都有相同的接口实现，这样，多态就能发挥出威力。

如果一个抽象类没有字段，所有方法全部都是抽象方法：
```java
abstract class Person {
  public abstract void run();
  public abstract String getName();
}
```

就可以把该抽象类改写为接口：interface。

在Java中，使用interface可以声明一个接口：

```java
interface Person {
  void run();
  String getName();
}
```

所谓interface，就是比抽象类还要抽象的纯抽象接口，因为它连字段都不能有。因为接口定义的所有方法默认都是public abstract的，所以这两个修饰符不需要写出来（写不写效果都一样）。

当一个具体的class去实现一个interface时，需要使用implements关键字。举个例子：

```java
class Student implements Person {
private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + " run");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
```

我们知道，在Java中，一个类只能继承自另一个类，不能从多个类继承。但是，一个类可以实现多个interface，例如：

```java
class Student implements Person, Hello { // 实现了两个interface
...
}
```
抽象类和接口的对比如下：

| |abstract class|interface|
| ---- | ---- | ---- |
| 继承	| 只能extends一个class	| 可以implements多个interface
| 字段	| 可以定义实例字段	| 不能定义实例字段
| 抽象方法	| 可以定义抽象方法	| 可以定义抽象方法
| 非抽象方法	| 可以定义非抽象方法	| 可以定义default方法

#### 1.6.2 default方法
在接口中，可以定义default方法。例如，把Person接口的run()方法改为default方法：
```java
public class Main {
    public static void main(String[] args) {
        Person p = new Student("Xiao Ming");
        p.run();
    }
}

interface Person {
    String getName();
    default void run() {
        System.out.println(getName() + " run");
    }
}

class Student implements Person {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
```
实现类可以不必覆写default方法。

default方法的目的是，当我们需要给接口新增一个方法时，会涉及到修改全部子类。如果新增的是default方法，那么子类就不必全部修改，只需要在需要覆写的地方去覆写新增方法。

default方法和抽象类的普通方法是有所不同的。因为interface没有字段，default方法无法访问字段，而抽象类的普通方法可以访问实例字段。

#### 1.6.3 总结
- Java的接口（interface）定义了纯抽象规范，一个类可以实现多个接口； 
- 接口也是数据类型，适用于向上转型和向下转型； 
- 接口的所有方法都是抽象方法，接口不能定义实例字段； 
- 接口可以定义default方法（JDK>=1.8）。

### 1.7 静态字段和方法

#### 1.7.1 静态字段

在一个class中定义的字段，我们称之为实例字段。实例字段的特点是，每个实例都有独立的字段，各个实例的同名字段互不影响。

还有一种字段，是用`static`修饰的字段，称为静态字段：`static field`。

实例字段在每个实例中都有自己的一个独立“空间”，但是静态字段只有一个共享“空间”，所有实例都会共享该字段。  

对于静态字段，无论修改哪个实例的静态字段，效果都是一样的：所有实例的静态字段都被修改了，原因是静态字段并不属于实例：  

![img1.png](imgs/img1.png)

虽然实例可以访问静态字段，但是它们指向的其实都是`Person class`的静态字段。所以，所有实例共享一个静态字段。

因此，不推荐用`实例变量.静态字段`去访问静态字段，因为在Java程序中，实例对象并没有静态字段。在代码中，实例对象能访问静态字段只是因为编译器可以根据实例类型自动转换为`类名.静态字段`来访问静态对象。

推荐用类名来访问静态字段。可以把静态字段理解为描述`class`本身的字段（非实例字段）。对于上面的代码，更好的写法是：

```java
Person.number = 99;
System.out.println(Person.number);
```
#### 1.7.2 静态方法
有静态字段，就有静态方法。用`static`修饰的方法称为静态方法。

调用实例方法必须通过一个实例变量，而调用静态方法则不需要实例变量，通过类名就可以调用。静态方法类似其它编程语言的函数。
```java
public class Main {
    public static void main(String[] args) {
        Person.setNumber(99);
        System.out.println(Person.number);
    }
}

class Person {
    public static int number;

    public static void setNumber(int value) {
        number = value;
    }
}
```

因为静态方法属于`class`而不属于实例，因此，静态方法内部，无法访问`this`变量，也无法访问实例字段，它只能访问静态字段。

通过实例变量也可以调用静态方法，但这只是编译器自动帮我们把实例改写成类名而已。

通常情况下，通过实例变量访问静态字段和静态方法，会得到一个编译警告。

静态方法经常用于工具类。例如：

- Arrays.sort()
- Math.random()

静态方法也经常用于辅助方法。注意到Java程序的入口`main()`也是静态方法。

#### 1.7.3 接口的静态字段
因为`interface`是一个纯抽象类，所以它不能定义实例字段。但是，interface是可以有静态字段的，并且静态字段必须为`final`类型：

```java
public interface Person {
  public static final int MALE = 1;
  public static final int FEMALE = 2;
}
```

实际上，因为`interface`的字段只能是`public static final`类型，所以我们可以把这些修饰符都去掉，上述代码可以简写为：

```java
public interface Person {
  // 编译器会自动加上public statc final:
  int MALE = 1;
  int FEMALE = 2;
}
```

编译器会自动把该字段变为`public static final`类型。

#### 1.7.4 总结
- 静态字段属于所有实例“共享”的字段，实际上是属于class的字段； 
- 调用静态方法不需要实例，无法访问this，但可以访问静态字段和其他静态方法； 
- 静态方法常用于工具类和辅助方法。

### 1.8 包
在Java中，我们使用`package`来解决名字冲突。

Java定义了一种名字空间，称之为包：`package`。一个类总是属于某个包，类名（比如`Person`）只是一个简写，真正的完整类名是`包名.类名`。
如：

```java
package ming; // 申明包名ming

public class Person {
}
```
在Java虚拟机执行的时候，JVM只看完整类名，因此，只要包名不同，类就不同。

包可以是多层结构，用.隔开。例如：`java.util`。

**总结**
- Java内建的package机制是为了避免class命名冲突； 
- JDK的核心类使用java.lang包，编译器会自动导入； 
- JDK的其它常用类定义在java.util.*，java.math.*，java.text.*，……； 
- 用`import`导入其他包；
- 包名推荐使用倒置的域名，例如org.apache。

### 1.9 作用域

- Java内建的访问权限包括public、protected、private和package权限； \
- Java在方法内部定义的变量是局部变量，局部变量的作用域从变量声明开始，到一个块结束； 
- final修饰符不是访问权限，它可以修饰class、field和method； 
- 一个.java文件只能包含一个public类，但可以包含多个非public类。

### 1.10 内部类
Java的内部类可分为Inner Class、Anonymous Class和Static Nested Class三种： 
  - Inner Class和Anonymous Class本质上是相同的，都必须依附于Outer Class的实例，即隐含地持有Outer.this实例，并拥有Outer Class的private访问权限； 
  - Static Nested Class是独立类，但拥有Outer Class的private访问权限。

### 1.11 classpath和jar
#### 1.11.1 classpath
`classpath`是JVM用到的一个环境变量，它用来指示JVM如何搜索`class`。

因为Java是编译型语言，源码文件是`.java`，而编译后的`.class`文件才是真正可以被JVM执行的字节码。因此，JVM需要知道，如果要加载一个`abc.xyz.Hello`的类，应该去哪搜索对应的`Hello.class`文件。

所以，`classpath`就是一组目录的集合，它设置的搜索路径与操作系统相关。例如，在Windows系统上，用`;`分隔，带空格的目录用`""`括起来，可能长这样：

`C:\work\project1\bin;C:\shared;"D:\My Documents\project1\bin"`

在Linux系统上，用:分隔，可能长这样：

`/usr/shared:/usr/local/bin:/home/liaoxuefeng/bin`

**classpath的设定方法有两种：**

- 在系统环境变量中设置classpath环境变量，不推荐； 
- 在启动JVM时设置classpath变量，推荐。

我们强烈不推荐在系统环境变量中设置`classpath`，那样会污染整个系统环境。在启动JVM时设置`classpath`才是推荐的做法。实际上就是给java命令传入`-classpath`或`-cp`参数：

`java -classpath .;C:\work\project1\bin;C:\shared abc.xyz.Hello`

或者使用-cp的简写：

`java -cp .;C:\work\project1\bin;C:\shared abc.xyz.Hello`

没有设置系统环境变量，也没有传入-cp参数，那么JVM默认的classpath为.，即当前目录：

`java abc.xyz.Hello`

#### 1.11.2 jar

如果有很多`.class`文件，散落在各层目录中，肯定不便于管理。如果能把目录打一个包，变成一个文件，就方便多了。

`jar包`就是用来干这个事的，它可以把`package`组织的目录层级，以及各个目录下的所有文件（包括`.class`文件和其他文件）都打成一个`jar文件`，这样一来，无论是备份，还是发给客户，就简单多了。

`jar包`实际上就是一个`zip格式`的压缩文件，而`jar包`相当于目录。如果我们要执行一个`jar包`的`class`，就可以把`jar包`放到`classpath`中：

`java -cp ./hello.jar abc.xyz.Hello`

这样JVM会自动在`hello.jar`文件里去搜索某个类。

**如何创建jar包？**

因为jar包就是zip包，所以，直接在资源管理器中，找到正确的目录，点击右键，在弹出的快捷菜单中选择“发送到”，“压缩(zipped)文件夹”，就制作了一个zip文件。然后，把后缀从.zip改为.jar，一个jar包就创建成功。

#### 1.11.3 总结

- JVM通过环境变量classpath决定搜索class的路径和顺序；

- 不推荐设置系统环境变量classpath，始终建议通过-cp命令传入；

- jar包相当于目录，可以包含很多.class文件，方便下载和使用；

- MANIFEST.MF文件可以提供jar包的信息，如Main-Class，这样可以直接运行jar包。

### 1.12 模块
从Java 9开始，JDK又引入了模块（Module）。

**总结**

- Java 9引入的模块目的是为了管理依赖； 
- 使用模块可以按需打包JRE； 
- 使用模块对类的访问权限有了进一步限制。

## 2. 面向对象-核心类
### 2.1 字符串和编码
在Java中，`String`是一个引用类型，它本身也是一个`class`。但是，Java编译器对`String`有特殊处理，即可以直接用`"..."`来表示一个字符串：

`String s1 = "Hello!";`

实际上字符串在`String`内部是通过一个`char[]`数组表示的，因此，按下面的写法也是可以的：

`String s2 = new String(new char[] {'H', 'e', 'l', 'l', 'o', '!'});`

因为`String`太常用了，所以Java提供了`"..."`这种字符串字面量表示方法。

**常用的字符串方法**

`String s = "Hello";
String s2 = "Hello World";`

|字符串方法|说明|实例|
|----|----|----|
|`equals()`| 字符串相等比较。只能用这个，不能用 `==` | `s1.equals(s2)` |
|`equalsIgnoreCase()`| 字符串相等比较。和`equals()`一样，区别是此方法忽略大小写 | `s1.equals(s2)` |
|`contains()`| 字符串是否包含子串 | `"Hello".contains("ll"); // true` |
|`indexOf()`, `lastIndexOf()`, `startsWith()`, `endsWith()` | 字符串搜索子串 | `"Hello".indexOf("l"); // 2`, `"Hello".lastIndexOf("l"); // 3`, `"Hello".startsWith("He"); // true`, `"Hello".endsWith("lo"); // true` |
|`substring()`| 字符串提取（截取）子串，索引从`0`开始 | `"Hello".substring(2); // "llo"`, `"Hello".substring(2, 4); "ll"` |
|`trim()`| 去除首位空白字符（包含`空格`，`\t`，`\r`，`\n`） |`"  \tHello\r\n ".trim(); // "Hello"`|
|`strip()`| 去除首位空白字符（和`trim`不同的是，类似中文空格`\u3000`也会被去除） |`"\u3000Hello\u3000".strip(); // "Hello"`, `" Hello ".stripLeading(); // "Hello "`,`" Hello ".stripTrailing(); // " Hello"` |
|`isEmpty()`| 判断是否为空 | `"".isEmpty(); // true，因为字符串长度为0` , `"  ".isEmpty(); // false，因为字符串长度不为0` |
|`isBlank()`| 判断是否为空白字符串 | `"  \n".isBlank(); // true，因为只包含空白字符` , `" Hello ".isBlank(); // false，因为包含非空白字符` |
|`replace()`| 替换字符串 | `String s = "hello";`, `s.replace('l', 'w'); // "hewwo"，所有字符'l'被替换为'w'`, `s.replace("ll", "~~"); // "he~~o"，所有子串"ll"被替换为"~~"` |
|`replaceAll()`| 替换字符串 | `String s = "A,,B;C ,D";`, `s.replaceAll("[\\,\\;\\s]+", ","); // "A,B,C,D"` |
|`split()`| 分割字符串 | `String s = "A,B,C,D";`, `String[] ss = s.split("\\,"); // {"A", "B", "C", "D"}` |
|`join()`| 拼接字符串 | `String[] arr = {"A", "B", "C"};`, `String s = String.join("***", arr); // "A***B***C"` |
|`formatted()`, `format()`| 格式化字符串（占位符有`%s`：显示字符串；`%d`：显示整数；`%x`：显示十六进制整数；`%f`：显示浮点数。） | `public class Main {public static void main(String[] args) {String s = "Hi %s, your score is %d!";System.out.println(s.formatted("Alice", 80));System.out.println(String.format("Hi %s, your score is %.2f!", "Bob", 59.5));}}` |
|`valueOf()`| 将任意基本类型或引用类型转换为字符串 | `String.valueOf(123); // "123"`,`String.valueOf(45.67); // "45.67"`,`String.valueOf(true); // "true"`,`String.valueOf(new Object()); // 类似java.lang.Object@636be97c` |
|`Integer.parseInt()`| 将字符串转为整型 | `int n1 = Integer.parseInt("123"); // 123`, `int n2 = Integer.parseInt("ff", 16); // 按十六进制转换，255` |
|`Boolean.parseBoolean()`| 将字符串转为`boolean`型 | `boolean b1 = Boolean.parseBoolean("true"); // true`, `boolean b2 = Boolean.parseBoolean("FALSE"); // false` |
|`Integer.getInteger()`| 把该字符串对应的系统变量转换为`Integer` | `Integer.getInteger("java.version"); // 版本号，11` |
|`toCharArray()`, `new String()`| 转换为char[] 。String和char[]类型可以互换| `char[] cs = "Hello".toCharArray(); // String -> char[]`, `String s = new String(cs); // char[] -> String` |

**字符串编码**

我们可以手动把字符串转换为其他编码。如：

```java
byte[] b1 = "Hello".getBytes(); // 按系统默认编码转换，不推荐
byte[] b2 = "Hello".getBytes("UTF-8"); // 按UTF-8编码转换
byte[] b2 = "Hello".getBytes("GBK"); // 按GBK编码转换
byte[] b3 = "Hello".getBytes(StandardCharsets.UTF_8); // 按UTF-8编码转换
```

如果要把已知编码的byte[]转换为String，可以这样做：

```java
byte[] b = ...
String s1 = new String(b, "GBK"); // 按GBK转换
String s2 = new String(b, StandardCharsets.UTF_8); // 按UTF-8转换
```

始终牢记：Java的String和char在内存中总是以Unicode编码表示。

**总结**

- Java字符串String是不可变对象； 
- 字符串操作不改变原字符串内容，而是返回新字符串； 
- 常用的字符串操作：提取子串、查找、替换、大小写转换等； 
- Java使用Unicode编码表示String和char； 
- 转换编码就是将String和byte[]转换，需要指定编码； 
- 转换为byte[]时，始终优先考虑UTF-8编码。

### 2.2 StringBuilder
Java编译器对String做了特殊处理，使得我们可以直接用`+`拼接字符串。

考察下面的循环代码：
```java
String s = "";
for (int i = 0; i < 1000; i++) {
    s = s + "," + i;
}
```

虽然可以直接拼接字符串，但是，在循环中，每次循环都会创建新的字符串对象，然后扔掉旧的字符串。这样，绝大部分字符串都是临时对象，不但浪费内存，还会影响GC效率。

为了能高效拼接字符串，Java标准库提供了`StringBuilder`，它是一个可变对象，可以预分配缓冲区，这样，往StringBuilder中新增字符时，不会创建新的临时对象：

```java
StringBuilder sb = new StringBuilder(1024);
for (int i = 0; i < 1000; i++) {
  sb.append(',');
  sb.append(i);
}
String s = sb.toString();
```

`StringBuilder`还可以进行链式操作。

**注意**：对于普通的字符串`+`操作，并不需要我们将其改写为`StringBuilder`，因为Java编译器在编译时就自动把多个连续的+操作编码为`StringConcatFactory`的操作。在运行期，`StringConcatFactory`会自动把字符串连接操作优化为数组复制或者`StringBuilder`操作。

你可能还听说过`StringBuffer`，这是`Java`早期的一个`StringBuilder`的线程安全版本，它通过同步来保证多个线程操作`StringBuffer`也是安全的，但是同步会带来执行速度的下降。

`StringBuilder`和`StringBuffer`接口完全相同，现在完全没有必要使用`StringBuffer`。

**总结**
- `StringBuilder`是可变对象，用来高效拼接字符串；

- `StringBuilder`可以支持链式操作，实现链式操作的关键是返回实例本身；

- `StringBuffer`是`StringBuilder`的线程安全版本，现在很少使用。

### 2.3 StringJoiner

`StringJoiner`可以用分隔符拼接数组。`StringJoiner`可以指定“开头”和“结尾”。如：

```java
public class Main {
    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Grace"};
        var sj = new StringJoiner(", ", "Hello ", "!");
        for (String name : names) {
            sj.add(name);
        }
        System.out.println(sj.toString());
    }
}
```

`String`还提供了一个静态方法`join()`，这个方法在内部使用了`StringJoiner`来拼接字符串，在不需要指定“开头”和“结尾”的时候，用`String.join()`更方便：
```java
String[] names = {"Bob", "Alice", "Grace"};
var s = String.join(", ", names);
```
**总结**

- 用指定分隔符拼接字符串数组时，使用StringJoiner或者String.join()更方便；
- 用StringJoiner拼接字符串时，还可以额外附加一个“开头”和“结尾”。

### 2.4 包装类型
Java的数据类型分两种：

- 基本类型：`byte`，`short`，`int`，`long`，`boolean`，`float`，`double`，`char`

- 引用类型：所有`class`和`interface`类型

引用类型可以赋值为`null`，表示空，但基本类型不能赋值为`null`：

```java
String s = null;
int n = null; // compile error!
```
那么，如何把一个基本类型视为对象（引用类型）？对应的包装类型如下：

|基本类型|对应的引用类型|
|----|----|
| boolean |	java.lang.Boolean |
| byte |	java.lang.Byte |
| short |	java.lang.Short |
| int |	java.lang.Integer |
| long |	java.lang.Long |
| float |	java.lang.Float |
| double |	java.lang.Double |
| char |	java.lang.Character |

**总结**

- Java核心库提供的包装类型可以把基本类型包装为class；

- 自动装箱和自动拆箱都是在编译期完成的（JDK>=1.5）；

- 装箱和拆箱会影响执行效率，且拆箱时可能发生NullPointerException；

- 包装类型的比较必须使用equals()；

- 整数和浮点数的包装类型都继承自Number；

- 包装类型提供了大量实用方法。

### 2.5 JavaBean

在Java中，有很多`class`的定义都符合这样的规范：

- 若干`private`实例字段； 
- 通过`public`方法来读写实例字段。

例如：
```java
public class Person {
private String name;
private int age;

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return this.age; }
    public void setAge(int age) { this.age = age; }
}
```

如果读写方法符合以下这种命名规范：

```java
// 读方法:
public Type getXyz()
// 写方法:
public void setXyz(Type value)

```
那么这种`class`被称为`JavaBean`。

`JavaBean`主要用来传递数据，即把一组数据组合成一个`JavaBean`便于传输。

**总结**

- JavaBean是一种符合命名规范的class，它通过getter和setter来定义属性；
- 属性是一种通用的叫法，并非Java语法规定；
- 可以利用IDE快速生成getter和setter；
- 使用Introspector.getBeanInfo()可以获取属性列表。

### 2.6 枚举

用`enum`来定义枚举类。

```java
public class Main {
    public static void main(String[] args) {
        Weekday day = Weekday.SUN;
        if (day == Weekday.SAT || day == Weekday.SUN) {
            System.out.println("Work at home!");
        } else {
            System.out.println("Work at office!");
        }
    }
}

enum Weekday {
    SUN, MON, TUE, WED, THU, FRI, SAT;
}
```

**总结**

- Java使用enum定义枚举类型，它被编译器编译为final class Xxx extends Enum { … }；
- 通过name()获取常量定义的字符串，注意不要使用toString()；
- 通过ordinal()返回常量定义的顺序（无实质意义）；
- 可以为enum编写构造方法、字段和方法
- enum的构造方法要声明为private，字段强烈建议声明为final；
- enum适合用在switch语句中。

### 2.7 记录类（不变类）
```java
public record Point(int x, int y) {}
```

相当于以下代码：

```java
public final class Point extends Record {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int x() {
        return this.x;
    }

    public int y() {
        return this.y;
    }

    public String toString() {
        return String.format("Point[x=%s, y=%s]", x, y);
    }

    public boolean equals(Object o) {
        ...
    }
    public int hashCode() {
        ...
    }
}
```

**总结**

从Java 14开始，提供新的record关键字，可以非常方便地定义Data Class：
- 使用record定义的是不变类；
- 可以编写Compact Constructor对参数进行验证；
- 可以定义静态方法。

### 2.8 BigInteger
`java.math.BigInteger`就是用来表示任意大小的整数。

`BigInteger`和`Integer`、`Long`一样，也是不可变类，并且也继承自`Number类`。因为`Number`定义了转换为基本类型的几个方法：

- 转换为`byte`：`byteValue()`
- 转换为`short`：`shortValue()`
- 转换为`int`：`intValue()`
- 转换为`long`：`longValue()`
- 转换为`float`：`floatValue()`
- 转换为`double`：`doubleValue()`

**总结**

- BigInteger用于表示任意大小的整数；
- BigInteger是不变类，并且继承自Number；
- 将BigInteger转换成基本类型时可使用longValueExact()等方法保证结果准确。

### 2.9 BigDecimal

和`BigInteger`类似，`BigDecimal`可以表示一个任意大小且精度完全准确的浮点数。

````java
BigDecimal bd = new BigDecimal("123.4567");
System.out.println(bd.multiply(bd)); // 15241.55677489
````

`BigDecimal`用scale()表示小数位数，例如：

````java
BigDecimal d1 = new BigDecimal("123.45");
BigDecimal d2 = new BigDecimal("123.4500");
BigDecimal d3 = new BigDecimal("1234500");
System.out.println(d1.scale()); // 2,两位小数
System.out.println(d2.scale()); // 4
System.out.println(d3.scale()); // 0
````

通过`BigDecimal`的`stripTrailingZeros()`方法，可以将一个`BigDecimal`格式化为一个相等的，但去掉了末尾0的`BigDecimal`

```java
BigDecimal d1 = new BigDecimal("123.4500");
BigDecimal d2 = d1.stripTrailingZeros();
System.out.println(d1.scale()); // 4
System.out.println(d2.scale()); // 2,因为去掉了00

BigDecimal d3 = new BigDecimal("1234500");
BigDecimal d4 = d3.stripTrailingZeros();
System.out.println(d3.scale()); // 0
System.out.println(d4.scale()); // -2
```
如果一个`BigDecimal`的`scale()`返回负数，例如，`-2`，表示这个数是个整数，并且末尾有`2个0`。


调用`divideAndRemainder()`方法时，返回的数组包含两个`BigDecimal`，分别是商和余数，其中商总是整数，余数不会大于除数。我们可以利用这个方法判断两个`BigDecimal`是否是整数倍数：

```java
BigDecimal n = new BigDecimal("12.75");
BigDecimal m = new BigDecimal("0.15");
BigDecimal[] dr = n.divideAndRemainder(m);
if (dr[1].signum() == 0) {
    // n是m的整数倍
}
```

**比较BigDecimal**
在比较两个`BigDecimal`的值是否相等时，要特别注意，使用`equals()`方法不但要求两个`BigDecimal`的值相等，还要求它们的`scale()`相等：

```java
BigDecimal d1 = new BigDecimal("123.456");
BigDecimal d2 = new BigDecimal("123.45600");
System.out.println(d1.equals(d2)); // false,因为scale不同
System.out.println(d1.equals(d2.stripTrailingZeros())); // true,因为d2去除尾部0后scale变为2
System.out.println(d1.compareTo(d2)); // 0
```

必须使用`compareTo()`方法来比较，它根据两个值的大小分别返回`负数`、`正数`和`0`，分别表示`小于`、`大于`和`等于`。

`总是使用compareTo()比较两个BigDecimal的值，不要使用equals()！`

`BigDecimal`也是从`Number`继承的，也是不可变对象。


**总结**

- BigDecimal用于表示精确的小数，常用于财务计算； 
- 比较BigDecimal的值是否相等，必须使用compareTo()而不能使用equals()。

### 2.10 常用工具类

#### 2.10.1 Math

顾名思义，Math类就是用来进行数学计算的，它提供了大量的静态方法来便于我们实现数学计算。

求绝对值：

```java
Math.abs(-100); // 100
Math.abs(-7.8); // 7.8
```

取最大或最小值：

```java
Math.max(100, 99); // 100
Math.min(1.2, 2.3); // 1.2
```
计算xy次方：

```java
Math.pow(2, 10); // 2的10次方=1024
```
计算√x：

```java
Math.sqrt(2); // 1.414...
```
计算ex次方：

```java
Math.exp(2); // 7.389...
```
计算以e为底的对数：

```java
Math.log(4); // 1.386...
```
计算以10为底的对数：

```java
Math.log10(100); // 2
```

#### 2.10.2 三角函数

```java
Math.sin(3.14); // 0.00159...
Math.cos(3.14); // -0.9999...
Math.tan(3.14); // -0.0015...
Math.asin(1.0); // 1.57079...
Math.acos(1.0); // 0.0
```

#### 2.10.3 数学常量
```java
double pi = Math.PI; // 3.14159...
double e = Math.E; // 2.7182818...
Math.sin(Math.PI / 6); // sin(π/6) = 0.5
```

#### 2.10.4 生成一个随机数x

x的范围是0 <= x < 1：

```java
Math.random(); // 0.53907... 每次都不一样
```

如果我们要生成一个区间在[MIN, MAX)的随机数，可以借助Math.random()实现，计算如下：
```java
// 区间在[MIN, MAX)的随机数
public class Main {
    public static void main(String[] args) {
        double x = Math.random(); // x的范围是[0,1)
        double min = 10;
        double max = 50;
        double y = x * (max - min) + min; // y的范围是[10,50)
        long n = (long) y; // n的范围是[10,50)的整数
        System.out.println(y);
        System.out.println(n);
    }
}
```

有些童鞋可能注意到`Java`标准库还提供了一个`StrictMath`，它提供了和`Math`几乎一模一样的方法。这两个类的区别在于，由于浮点数计算存在误差，不同的平台（例如`x86`和`ARM`）计算的结果可能不一致（指误差不同），因此，`StrictMath`保证所有平台计算结果都是完全相同的，而`Math`会尽量针对平台优化计算速度，所以，绝大多数情况下，使用`Math`就足够了。

#### 2.10.5 Random

`Random`用来创建伪随机数。所谓伪随机数，是指只要给定一个初始的种子，产生的随机数序列是完全一样的。

要生成一个随机数，可以使用`nextInt()`、`nextLong()`、`nextFloat()`、`nextDouble()`：
```java
Random r = new Random();
r.nextInt(); // 2071575453,每次都不一样
r.nextInt(10); // 5,生成一个[0,10)之间的int
r.nextLong(); // 8811649292570369305,每次都不一样
r.nextFloat(); // 0.54335...生成一个[0,1)之间的float
r.nextDouble(); // 0.3716...生成一个[0,1)之间的double
```

如果我们在创建Random实例时指定一个种子，就会得到完全确定的随机数序列：
```java
public class Main {
    public static void main(String[] args) {
        Random r = new Random(12345);
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(100));
        }
        // 51, 80, 41, 28, 55...
    }
}
```

前面我们使用的`Math.random()`实际上内部调用了`Random`类，所以它也是伪随机数，只是我们无法指定种子。

#### 1.10.6 SecureRandom

有伪随机数，就有真随机数。实际上真正的真随机数只能通过量子力学原理来获取，而我们想要的是一个不可预测的安全的随机数，`SecureRandom`就是用来创建安全的随机数的：
```java
SecureRandom sr = new SecureRandom();
System.out.println(sr.nextInt(100));
```

`SecureRandom`无法指定种子，它使用`RNG`（`random number generator`）算法。`JDK`的`SecureRandom`实际上有多种不同的底层实现，有的使用安全随机种子加上伪随机数算法来产生安全的随机数，有的使用真正的随机数生成器。实际使用的时候，可以优先获取高强度的安全随机数生成器，如果没有提供，再使用普通等级的安全随机数生成器：
```java
public class Main {
    public static void main(String[] args) {
        SecureRandom sr = null;
        try {
            sr = SecureRandom.getInstanceStrong(); // 获取高强度安全随机数生成器
        } catch (NoSuchAlgorithmException e) {
            sr = new SecureRandom(); // 获取普通的安全随机数生成器
        }
        byte[] buffer = new byte[16];
        sr.nextBytes(buffer); // 用安全随机数填充buffer
        System.out.println(Arrays.toString(buffer));
    }
}

```

`SecureRandom`的安全性是通过操作系统提供的安全的随机种子来生成随机数。这个种子是通过`CPU`的热噪声、读写磁盘的字节、网络流量等各种随机事件产生的“熵”。

在密码学中，安全的随机数非常重要。如果使用不安全的伪随机数，所有加密体系都将被攻破。因此，时刻牢记必须使用`SecureRandom`来产生安全的随机数。

`需要使用安全随机数的时候，必须使用SecureRandom，绝不能使用Random！`

#### 1.10.7 总结
Java提供的常用工具类有：

- Math：数学计算 
- Random：生成伪随机数 
- SecureRandom：生成安全的随机数