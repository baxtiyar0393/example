package az.mycompany.javalessons.OOPFileWriteRead;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class SortedList {

    public static void main(String[] args) {
        List<Human> humanList = new ArrayList<>();
        humanList.add(new Human("Steven", "King", 45, "Kochhar", "Neena"));
        humanList.add(new Human("Alexande", "Hunold", 40, "Ernst", "Diana"));
        humanList.add(new Human("Nancy", "Greenberg", 55, "John", "Julia"));
        humanList.add(new Human("Payam", "Fripp", 35, "Vollman", "Julia"));
        humanList.add(new Human("Steven", "Hunold", 30, "John", "Neena"));
        humanList.add(new Human("Irene", "Landry", 25, "James", "Laura"));
        humanList.add(new Human("Ernst", "Fripp", 50, "Michael", "Trenna"));
        humanList.add(new Human("John", "Patel", 28, "Stephen", "Janette"));
        humanList.add(new Human("McEwen", "Doran", 60, "Allan", "Clara"));
        humanList.add(new Human("William", "Smith", 38, "Harrison", "Lisa"));
        humanList.add(new Human("Ellen", "Abel", 23, "Jack", "Julia"));
        humanList.add(new Human("Smith", "James", 33, "Michael", "Diana"));
        humanList.add(new Human("Samuel", "McCain", 43, "Pat", "Jennifer"));
        humanList.add(new Human("Hermann", "Baer", 37, "William", "Shelley"));
        humanList.add(new Human("Douglas", "Grant", 53, "Kevin", "Susan"));
        System.out.println("------------------Age sorted asc--------------------------");
        humanList
                .stream()
                .sorted(Comparator.comparingInt(Human::getAge))
                .forEach(System.out::println);

        System.out.println("------------------Age sorted desc-----------------------------");

        humanList
                .stream()
                .sorted(Comparator.comparingInt(Human::getAge).reversed())
                .forEach(System.out::println);

        System.out.println("----------------Name sorted asc-------------------------------");

        humanList
                .stream()
                .sorted(Comparator.comparing(Human::getName))
                .forEach(System.out::println);

        System.out.println("------------------Name sorted desc-----------------------------");

        humanList
                .stream()
                .sorted(Comparator.comparing(Human::getName).reversed())
                .forEach(System.out::println);


    }
}
