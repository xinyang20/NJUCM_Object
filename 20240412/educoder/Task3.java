package case3;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pppName = sc.next();
		int pppAge = sc.nextInt();
		String bpName = sc.next();
		int bpAge = sc.nextInt();
		String ppcName = sc.next();
		int ppcAge = sc.nextInt();
		String bcName = sc.next();
		int bcAge = sc.nextInt();
		// 测试运动员(乒乓球运动员和篮球运动员)
		// 乒乓球运动员
		// 通过带参构造函数实例化PingPangPlayer对象ppp
		// 输出'name---age'
		// 分别调用sleep()、eat()、study()、speak()方法
		/********* begin *********/
        PingPangPlayer ppp=new PingPangPlayer(pppName,pppAge);
        System.out.println(ppp.name+"---"+ppp.age);
        ppp.sleep();
        ppp.eat();
        ppp.study();
        ppp.speak();
		/********* end *********/
		System.out.println("----------------");
		// 篮球运动员
		// 通过带参构造函数实例化BasketballPlayer对象bp
		// 输出'name---age'
		// 分别调用sleep()、eat()、study()方法
		/********* begin *********/
        BasketballPlayer bp=new BasketballPlayer(bpName,bpAge);
        System.out.println(bp.name+"---"+bp.age);
        bp.sleep();
        bp.eat();
        bp.study();
		/********* end *********/
		System.out.println("----------------");
		// 测试教练(乒乓球教练和篮球教练)
		// 乒乓球教练
		// 通过带参构造函数实例化PingPangCoach对象ppc
		// 输出'name---age'
		// 分别调用sleep()、eat()、teach()、speak()方法
		/********* begin *********/
        PingPangCoach ppc=new PingPangCoach(ppcName,ppcAge);
        System.out.println(ppc.name+"---"+ppc.age);
        ppc.sleep();
        ppc.eat();
        ppc.teach();
        ppc.speak();
		/********* end *********/
		System.out.println("----------------");
		// 篮球教练
		// 通过带参构造函数实例化BasketballCoach对象bc
		// 输出'name---age'
		// 分别调用sleep()、eat()、teach()方法
		/********* begin *********/
        BasketballCoach bc=new BasketballCoach(bcName,bcAge);
        System.out.println(bc.name+"---"+bc.age);
        bc.sleep();
        bc.eat();
        bc.teach();
		/********* end *********/
		System.out.println("----------------");
	}
}

// 说英语接口 声明抽象方法speak()
interface SpeakEnglish {
	/********* begin *********/
    abstract void speak();
	/********* end *********/
}

// 定义人的抽象类Person 封装name和age
// 无参构造函数
// 有参构造函数初始化name和age
// 定义具体方法sleep() 输出'人都是要睡觉的'
// 抽象方法eat()（吃的不一样）
abstract class Person {
	/********* begin *********/
    String name;
    int age;
    Person(){}
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void sleep(){
        System.out.println("人都是要睡觉的");
    }
    abstract void eat();
	/********* end *********/
}

// 定义运动员Player（抽象类）继承自Person类
// 无参构造函数
// 有参构造函数初始化name和age
// 运动员学习内容不一样，抽取为抽象 定义抽象方法study()
abstract class Player extends Person {
	/********* begin *********/
    Player(){super();}
    Player(String name,int age){
        super(name,age);
    }
    abstract void study();
	/********* end *********/
}

// 定义教练Coach（抽象类）继承自Person类
// 无参构造函数
// 有参构造函数初始化name和age
// 教练教的不一样 定义抽象方法teach()
abstract class Coach extends Person {
	/********* begin *********/
    Coach(){super();}
    Coach(String name,int age){
        super(name,age);
    }
    abstract void teach();
	/********* end *********/
}

// 定义乒乓球运动员具体类PingPangPlayer 继承自Player类并实现SpeakEnglish类（兵乓球运动员需要说英语）
// 无参构造函数
// 有参构造函数初始化name和age
// 实现自己的eat()方法 输出'乒乓球运动员吃大白菜，喝小米粥'
// 实现自己的study()方法 输出'乒乓球运动员学习如何发球和接球'
// 实现自己的speak()方法 输出'乒乓球运动员说英语'
class PingPangPlayer extends Player implements SpeakEnglish {
	/********* begin *********/
    PingPangPlayer(){super();};
    PingPangPlayer(String name,int age){
        super(name,age);
    }
    void eat(){
        System.out.println("乒乓球运动员吃大白菜，喝小米粥");
    }
    void study(){
        System.out.println("乒乓球运动员学习如何发球和接球");
    }
    public void speak(){
        System.out.println("乒乓球运动员说英语");
    }
	/********* end *********/
}

// 定义篮球运动员具体类BasketballPlayer 继承自Player类 不需要继承接口，因为他不需要说英语
// 无参构造函数
// 有参构造函数初始化name和age
// 实现自己的eat()方法 输出'篮球运动员吃牛肉，喝牛奶'
// 实现自己的study()方法 输出'篮球运动员学习如何运球和投篮'
class BasketballPlayer extends Player {
	/********* begin *********/
    BasketballPlayer(){super();};
    BasketballPlayer(String name,int age){
        super(name,age);
    }
    void eat(){
        System.out.println("篮球运动员吃牛肉，喝牛奶");
    }
    void study(){
        System.out.println("篮球运动员学习如何运球和投篮");
    }
	/********* end *********/
}

// 定义乒乓球教练具体类 PingPangCoach 继承自Coach类并实现SpeakEnglish类（兵乓球教练需要说英语）
// 无参构造函数
// 有参构造函数初始化name和age
// 实现自己的eat()方法 输出'乒乓球教练吃小白菜，喝大米粥'
// 实现自己的teach()方法 输出'乒乓球教练教如何发球和接球'
// 实现自己的speak()方法 输出'乒乓球教练说英语'
class PingPangCoach extends Coach implements SpeakEnglish {
	/********* begin *********/
    PingPangCoach(){super();};
    PingPangCoach(String name,int age){
        super(name,age);
    }
    void eat(){
        System.out.println("乒乓球教练吃小白菜，喝大米粥");
    }
    void teach(){
        System.out.println("乒乓球教练教如何发球和接球");
    }
    public void speak(){
        System.out.println("乒乓球教练说英语");
    }
	/********* end *********/
}

// 定义篮球教练具体类BasketballCoach 继承自Coach类 不需要继承接口，因为他不需要说英语
// 无参构造函数
// 有参构造函数初始化name和age
// 实现自己的eat()方法 输出'篮球教练吃羊肉，喝羊奶'
// 实现自己的teach()方法 输出'篮球教练教如何运球和投篮'
class BasketballCoach extends Coach {
	/********* begin *********/
    BasketballCoach(){super();};
    BasketballCoach(String name,int age){
        super(name,age);
    }
    void eat(){
        System.out.println("篮球教练吃羊肉，喝羊奶");
    }
    void teach(){
        System.out.println("篮球教练教如何运球和投篮");
    }
	/********* end *********/
}
