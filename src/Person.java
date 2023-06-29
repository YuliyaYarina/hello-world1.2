public class Person {
String name;
int age;

public Person(String name, int age){
    this.name = name;
    this.age = age;
}

public String getName(){
    return name;
}

public int getAge(){
    return age;
}

public boolean isAdalt() {
    return getAge() > 18;
}
public String toString() {
    return "name " + this.name + " age " + this.age;
}
}
