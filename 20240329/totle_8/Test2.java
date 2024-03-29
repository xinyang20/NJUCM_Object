package case2;

public class extendsTest {
	public static void main(String args[]) {
		// 实例化一个Cat对象，设置属性name和age，调用voice()和eat()方法，再打印出名字和年龄信息
		/********* begin *********/
        Cat cat = new Cat();
        cat.setName("大花猫");
        cat.setAge(6);
        cat.voice();
        cat.eat();
        System.out.println(cat.getName()+cat.getAge()+"岁");
		/********* end *********/

		// 实例化一个Dog对象，设置属性name和age，调用voice()和eat()方法，再打印出名字和年龄信息
		/********* begin *********/
        Dog dog = new Dog();
        dog.setName("大黑狗");
        dog.setAge(8);
        dog.voice();
        dog.eat();
        System.out.println(dog.getName()+dog.getAge()+"岁");
		/********* end *********/

	}
}

class Animal {
	/********* begin *********/
    private String name;
    private int age;
    void setName(String name){
        this.name=name;
    }
    void setAge(int age){
        this.age=age;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
	/********* end *********/

}

class Cat extends Animal {
	// 定义Cat类的voice()和eat()方法
	/********* begin *********/
    void voice(){
        System.out.println(this.getName()+"喵喵叫");
    }
    void eat(){
        System.out.println(this.getName()+"吃鱼");
    }
	/********* end *********/
}

class Dog extends Animal {
	// 定义Dog类的voice()和eat()方法
	/********* begin *********/
    void voice(){
        System.out.println(this.getName()+"汪汪叫");
    }
    void eat(){
        System.out.println(this.getName()+"吃骨头");
    }
	/********* end *********/
}