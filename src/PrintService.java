public class PrintService {
   public void print(Person[] people){
      System.out.println("размер списка: " + people.length);
      for (int i = 0; i < people.length; i++) {
         Person person = people[i];
         System.out.println("Имя " + person.getName() +
                 "; Возраст " + person.getAge() +
                 "; номер " + person.getPhoneNumber());
      }
      System.out.println();
   }
   public void print(Customer[] customers) {
      System.out.println("Размер списка покупателей: " + customers.length);
      for (int i = 0; i < customers.length; i++) {
         Customer customer = customers[i];
         System.out.println("Имя " + customer.getName()
                 + "; Возраст " + customer.getAge()
                 + "; номер " + customer.getPhoneNumber()
                 + "; номер сарты " + customer.getCardNomber());
      }
      System.out.println();

   }
   public void print(Gamer[] gamers) {
      System.out.println("Размер списка игроков: " + gamers.length);
      for (int i = 0; i < gamers.length; i++) {
         Gamer gamer = gamers[i];
         System.out.println("Имя " + gamer.getName()
                 + "; Возраст " + gamer.getAge()
                 + "; номер " + gamer.getPhoneNumber()
                 + "; номер сарты " + gamer.getPlatform());
      }
      System.out.println();

   }
}
