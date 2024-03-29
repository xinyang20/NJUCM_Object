package case4;

public class overridingTest {
	public static void main(String[] args) {
		// 实例化子类对象s，调用talk()方法打印信息
		/********* begin *********/
        Student s = new Student("张三",18,"哈佛大学");
        s.talk();
		/********* end *********/
		
	}
}

class Person {
	/********* begin *********/
    String name;
    int age;
    void talk(){
        System.out.print("我是："+this.name+"，今年："+this.age+"岁");
    }
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
	/********* end *********/
}

class Student extends Person {
	/********* begin *********/
    String school;
    void talk(){
        super.talk();
        System.out.println("，我在"+this.school+"上学");
    }
    Student(String name,int age,String school){
        super(name,age);
        this.school=school;
    }
	/********* end *********/
}