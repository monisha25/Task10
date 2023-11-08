package task10;

public class Person {
	private String name; //the constructor Person takes in the parameters name and age
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
public static void main(String args[]){

	Person person1 = new Person("monisha", 25);
	System.out.println(person1.getName()); 
	System.out.println(person1.getAge());

}
}
