# 面向对象 OOP（Object-Oriented Programming）
## 1. 面向对象基础 
### 1.1 构造方法
构造方法和类名相同，且可以有多个不同参数的构造方法。
### 1.2 方法重载
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

    Person p = new Student();
    p.run(); // 无法确定运行时究竟调用哪个run()方法
有童鞋会问，从上面的代码一看就明白，肯定调用的是Student的run()方法啊。

但是，假设我们编写这样一个方法：

    public void runTwice(Person p) {
        p.run();
        p.run();
    }
它传入的参数类型是Person，我们是无法知道传入的参数实际类型究竟是Person，还是Student，还是Person的其他子类，因此，也无法确定调用的是不是Person类定义的run()方法。

所以，多态的特性就是，运行期才能动态决定调用的子类方法。对某个类型调用某个方法，执行的实际方法可能是某个子类的覆写方法。

**覆写Object方法**

因为所有的class最终都继承自Object，而Object定义了几个重要的方法：
    
    toString()：把instance输出为String；
    equals()：判断两个instance是否逻辑相等；
    hashCode()：计算一个instance的哈希值。

在必要的情况下，我们可以覆写Object的这几个方法。例如：

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

总结：

* 子类可以覆写父类的方法（Override），覆写在子类中改变了父类方法的行为； 
* Java的方法调用总是作用于运行期对象的实际类型，这种行为称为多态； 
* final修饰符有多种作用： 
  * final修饰的方法可以阻止被覆写； 
  * final修饰的class可以阻止被继承； 
  * final修饰的field必须在创建对象时初始化，随后不可修改。

### 1.5 抽象类
    如果父类的方法本身不需要实现任何功能，仅仅是为了定义方法签名，目的是让子类去覆写它，那么，可以把父类的方法声明为抽象方法。
### 1.6 接口
### 1.7 静态字段和方法
### 1.8 包
### 1.9 作用域
### 1.10 内部类
### 1.11 classpath和jar
### 1.12 模块

## 2. TODO 面向对象-核心类