public class Main {
    public static void main(String[] args) {
      Person sarah = new Person("Sarah", 30);
        if (sarah.isAdalt()) {
            System.out.println("go v bar");
        } else {
            System.out.println("go v sad");
        }
        System.out.println(sarah);
    }
}