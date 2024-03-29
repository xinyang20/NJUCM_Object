package case1;

public class TestPersonDemo {
	public static void main(String[] args) {
		/********* begin *********/
		// 声明并实例化一Person对象p
        Person p = new Person();
		// 给p中的属性赋值
        p.setName("张三");
        p.setAge(18);
		// 调用Person类中的talk()方法
        p.talk();
		/********* end *********/

	}
}

// 在这里定义Person类
class Person {
	/********* begin *********/
    private String name;
    private int age;
    void talk(){
        System.out.print("我是："+name+"，今年："+age+"岁");
    }
    void setName(String name){
        this.name=name;
    }
    void setAge(int age){
        this.age=age;
    }
	/********* end *********/
}
package case7;

public class interfaceTest {
	public static void main(String[] args) {
		// 实例化一Student的对象s，并调用talk()方法，打印信息
		/********* begin *********/
        Student s = new Student();
        s.talk();
		/********* end *********/

	}
}

// 声明一个Person接口，并在里面声明三个常量：name、age和occupation，并分别赋值，声明一抽象方法talk()
interface Person {
	/********* begin *********/
    final String name="张三";
    final int age=18;
    final String occupation="学生";
    abstract public void talk();
	/********* end *********/
}

// Student类继承自Person类 复写talk()方法返回姓名、年龄和职业信息
class Student implements Person {
	/********* begin *********/
    public void talk(){
        System.out.println("学生——>姓名："+this.name+"，年龄："+this.age+"，职业："+this.occupation+"！");
    }
	/********* end *********/
}