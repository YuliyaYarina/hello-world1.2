
public class Main {

    public static void main(String[] args) {
        Person[] people = {
                new Person("sarah", 30, 101),
                new Person("sar", 60, 102),
                new Person("kyl", 33, 103),
                new Person("nana", 14, 104),
                new Person("spu", 13, 107),
                new Person("sari", 26, 105),
                new Person("km", 33, 109),
        };

        Customer[] customers = {
                new Customer("sarah", 30, 101, 60001),
                new Customer("sar", 60, 102, 60002),
                new Customer("kyl", 33, 103, 60003),
        };

        Gamer[] gamers = {
                new Gamer("spu", 13, 107, "PS"),
                new Gamer("sari", 26, 105, "PC"),
                new Gamer("km", 33, 109, "PS"),
        };

        PrintService printService = new PrintService();
        printService.print(people);
        printService.print(customers);
        printService.print(gamers);


    }

}