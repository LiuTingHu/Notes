import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * JAVA学习实战记录
 * 教程地址：https://www.liaoxuefeng.com/wiki/1252599548343744
 */
public class Index {
    /**
     *  主程
     * @param args
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
//        study20210923(args);
//        study20211207(args);
//        exceptionTest(args); //异常
//        logTest(args); //日志
        /*** 反射 ***/
        printClassInfo("".getClass());
        printClassInfo(Runnable.class);
        printClassInfo(java.time.Month.class);
        printClassInfo(String[].class);
        printClassInfo(int.class);
    }

    /**
     * 日志处理
     * @param args
     */
    public static void logTest(String[] args){

        Logger logger = Logger.getGlobal();
        logger.info("start process...");
        logger.warning("memory is running out...");
        logger.fine("ignored.");
        logger.severe("process will be terminated...");
    }

    static void printClassInfo(Class cls) {
        System.out.println("Class name: " + cls.getName());
        System.out.println("Simple name: " + cls.getSimpleName());
        if (cls.getPackage() != null) {
            System.out.println("Package name: " + cls.getPackage().getName());
        }
        System.out.println("is interface: " + cls.isInterface());
        System.out.println("is enum: " + cls.isEnum());
        System.out.println("is array: " + cls.isArray());
        System.out.println("is primitive: " + cls.isPrimitive());
        System.out.println(" ========================== ");
    }


    public static void exceptionTestTwo(String s) throws FileNotFoundException {
        if (s==null) {
            throw new FileNotFoundException();
        }
    }


    /**
     * 异常处理
     * @param args
     */
    public static void exceptionTest(String[] args) {
//        double x = Math.abs(10);
//        assert x >= 0:"x >= 0";
//        System.out.println(x);
//        System.exit(1);
        try {

//            new Integer();
            // 假设用户输入了abc：
            String s = "abc";
            byte[] s1 = s.getBytes("GBK");
            System.out.println("===s1===");
            System.out.println(s1);
            System.out.println("===s1 1===");
//            return ;

//            Class.forName()
//            s.;
//            int n = Integer.parseInt(s); // NumberFormatException!
            // ok:
            if (1==2)
            {
                throw new FileNotFoundException("asdf");
//                throw new NumberFormatException("asdf");
            }
        } catch (FileNotFoundException e) {
            // file not found:
            System.out.println("异常file not found：" + e.getMessage());
        } catch (SecurityException e) {
            // no read permission:
        } catch (IOException e) {
            // io error:
        } catch (Exception e) {
            // other error:
//            System.out.println(e);
//            e.printStackTrace();
//            System.out.println(
//                    "异常："
//                    + e.getCause() + "===\n "
//                    + e.toString() + "===\n "
//                    + e.getClass() + "===\n "
//                    + e.getMessage()
//            );
        }

    }

    /**
     * https://www.liaoxuefeng.com/wiki/1252599548343744/1260464690677856
     * @param args
     */
    public static void study20211207(String[] args){
        Base $base_obj = new Base();
        System.out.println(Base.test());
        System.out.println($base_obj.test2());
        BigDecimal bd = new BigDecimal("123.4567891234567891234567890");
        System.out.println(bd); // 15241.55677489
        System.out.println(bd.multiply(bd)); // 15241.55677489

        /**
         * 异常处理
         */
        try {
            // 假设用户输入了abc：
            String s = "abc";
            int n = Integer.parseInt(s); // NumberFormatException!
            // ok:
            if (1==2)
            {
                throw new FileNotFoundException("asdf");
            }
        } catch (FileNotFoundException e) {
            // file not found:
            System.out.println("异常file not found：" + e.getMessage());
        } catch (SecurityException e) {
            // no read permission:
        } catch (IOException e) {
            // io error:
        } catch (Exception e) {
            // other error:
            System.out.println("异常：" + e.getMessage());
        }



        // 用户删除了该文件：
//        String t = readFile("C:\\abc.txt"); // FileNotFoundException!

    }

    /**
     * 2021-09-23 学习笔记
     * 学习到：https://www.liaoxuefeng.com/wiki/1252599548343744/1255943520012800
     */
    public static void study20210923(String[] args){
        /**
         * 1. 基本数据类型
         *
         *       bit
         *       byte = 8bit
         *       kb = 1024 byte
         *       mb = 1024 kb
         *       gb = 1024 mb
         *       tb = 1024 gb
         *       pb = 1024 tb
         *       eb = 1024 pb
         *       zb = 1024 eb
         *       yb = 1024 zb
         *
         *       整数类型：byte，short（2 byte），int（4 byte），long（8 byte）
         *
         *       浮点数类型：float（4 byte），double（8 byte）
         *
         *       字符类型：char（2 byte）
         *
         *       布尔类型：boolean
         *
         * 除了上述基本类型的变量，剩下的都是引用类型。
         *
         * 
         */
//        int x = 1;
//        System.out.println(x);
//        System.out.println("Hello, world2!1");
//        byte y = 127;

//        int a = 0b1111;
//        int b = 0xf;
//        int c = 15;
//        if (a == c && b == c){
//            System.out.println("==");
//        }
//
//
//        int i = (100 + 200) * (99 - 88); // 3300
//        int n = 7 * (5 + (i - 9)); // 23072
//
////        int y = i / n;
//
//        System.out.println((i / n) +  "==" + (i % n));
//        System.out.println(i);
//        System.out.println(n);
//
//
//        n = 5;
//        double d = 1.2 + 24.0 / n; // 6.0
//        double d2 = 1.2 + 24 / n; // 6.0
//        System.out.println(d);
//        System.out.println(d2);
//
//
//        boolean b = 5 < 3;
//        boolean result = b && (5 / 0 > 0);
//        System.out.println(result);
//
//
//        n = -100;
//        int x = n >= 0 ? n : -n;
//        System.out.println(x);
//
//
//        char c0 = 'A';
//
//        char c1 = 'A';
//        char c2 = '中';
//
//        String s = """
//                   SELECT * FROM
//                     users
//                   WHERE id > 100
//                   ORDER BY name DESC""";
//        System.out.println(s);
//
//        String s1 = "SELECT * FROM \n" +
//                "users \n" +
//        "WHERE id > 100 \n" +
//        "ORDER BY name DESC";
//        System.out.println(s1);
//
//
//        int int_value = 0;
//        System.out.println(int_value);
//
//
//        // 5位同学的成绩:
//        int[] ns = new int[5];
//        ns[0] = 68;
//        ns[1] = 79;
//        ns[2] = 91;
//        ns[3] = 85;
//        ns[4] = 62;
//        ns[5] = 62;
//        ns[6] = 62;
//
//        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
//        System.out.print("Input your name: "); // 打印提示
//        String name = scanner.nextLine(); // 读取一行输入并获取字符串
//        System.out.print("Input your age: "); // 打印提示
//        int age = scanner.nextInt(); // 读取一行输入并获取整数
//        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
//
        /**
         * 2. 流程控制
         */
//        int option = 99;
//        switch (option) {
//            case 1:
//                System.out.println("Selected 1");
//                break;
//            case 2:
//                System.out.println("Selected 2");
//                break;
//            case 3:
//                System.out.println("Selected 3");
//                break;
//            default:
//                System.out.println("Not selected");
//                break;
//        }
//
//        String fruit = "apple";
//        switch (fruit) {
//            case "apple" -> System.out.println("Selected apple");
//            case "pear" -> System.out.println("Selected pear");
//            case "mango" -> {
//                System.out.println("Selected mango");
//                System.out.println("Good choice!");
//            }
//            default -> System.out.println("No fruit selected");
//        }
//
//
//
//        int sum = 0; // 累加的和，初始化为0
//        n = 1;
//        while (n>0) { // 循环条件是n <= 100
//            sum = sum + n; // 把n累加到sum中
//            n ++; // n自身加1
//        }
//        System.out.println(sum); // 5050
//
//
        /**
         * 3. 数组操作
         */
//        int[] ns2 = { 1, 1, 2, 3, 5, 8 };
//        System.out.println(Arrays.toString(ns2)); // 类似 [I@7852e922
//
//
//        int[] ns3 = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
//        Arrays.sort(ns);
//        System.out.println(Arrays.toString(ns3));
//
//        //数组循环 for each形式
//        System.out.print("数组循环for each形式");
//        for (int ns_info : ns3) {
//            System.out.println(ns_info);
//        }
//        System.out.print("数组循环for形式");
//        for (int ns_i=0; ns_i < ns3.length; ns_i ++){
//            System.out.println(ns3[ns_i]);
//        }
//
//
//        System.out.println("接收命令行参数-start");
//        for (String arg : args) {
//            System.out.println(arg);
//        }
//        System.out.println("接收命令行参数-end");

        /**
         * 4. 面向对象 - OOP（Object-Oriented Programming）
         */
        Person person = new Person();
        person.setAge(10);
        person.setName("lisi");
        person.test("test1", "test2", "test3");
        System.out.println(person);

        /**
         * ====== 多态 ==========
         *
         * 子类可以覆写父类的方法（Override），覆写在子类中改变了父类方法的行为；
         *
         * Java的方法调用总是作用于运行期对象的实际类型，这种行为称为多态；
         *
         * final修饰符有多种作用：
         *
         * final修饰的方法可以阻止被覆写；
         *
         * final修饰的class可以阻止被继承；
         *
         * final修饰的field必须在创建对象时初始化，随后不可修改。
         */

        /**
         * 抽象类
         * https://www.liaoxuefeng.com/wiki/1252599548343744/1260456371027744
         * 如果父类的方法本身不需要实现任何功能，仅仅是为了定义方法签名，目的是让子类去覆写它，那么，可以把父类的方法声明为抽象方法
         */
//        Object $ab_obj = new AbClass();
    }

}

class Person {
    private String name;
    private int age;

    public void setName(String name){
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("invalid name");
        }
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        if (age < 0 || age > 300) {
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void test(String... params){
        System.out.println(Arrays.toString(params));

    }

}

abstract class AbClass{
    public abstract void run();
}