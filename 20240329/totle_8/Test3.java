package case3;

public class superTest {
	public static void main(String[] args) {
		// 实例化一个Student类的对象s，为Student对象s中的school赋值，打印输出信息
		/********* begin *********/
        Student s = new Student("张三",18,"哈佛大学");
        System.out.println("姓名："+s.getName()+"，年龄："+s.getAge()+"，学校："+s.getSchool());
		/********* end *********/
	}
}

class Person {
	/********* begin *********/
    private String name;
    private int age;
    Person(String name,int age){
        this.name=name;
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

class Student extends Person {
	/********* begin *********/
    String school;
    Student(String name,int age,String school){
        super(name,age);
        this.school=school;
    }
    String getSchool(){
        return school;
    }
	/********* end *********/
}
