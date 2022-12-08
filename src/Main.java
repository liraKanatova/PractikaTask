import classes.classes.Person;
import classes.enums.Gender;
import classes.servic.ServiceImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person1=new Person(123,"Inna",20, Gender.FEMALE, BigDecimal.valueOf(20000));
        Person person2=new Person(124,"Imran",19, Gender.MALE, BigDecimal.valueOf(10000));
        Person person3=new Person(125,"Oleg", 18, Gender.MALE, BigDecimal.valueOf(12000));
        Person person4=new Person(126,"Alan",23, Gender.MALE, BigDecimal.valueOf(9000));
        ArrayList<Person>personArrayList=new ArrayList<>(Arrays.asList(person1,person2,person3,person4));
        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);
        Scanner scanner3=new Scanner(System.in);
       ServiceImpl service=new ServiceImpl();
        System.out.println("""
                1 CreatePersons!
                2 FindByName!
                3 FindByAge!
                4 GetAll!
                5 GetGender!
                6 FindById!
                7 TakeMoney!
                """);
        while (true){
            switch (scanner.nextInt()){
                case 1:
                    System.out.println(service.createPersons(personArrayList));
                    break;
                case 2:
                    System.out.println("Atin jaziniz!");
                    System.out.println(service.findByName(personArrayList, scanner1.nextLine()));
                    break;
                case 3:
                    System.out.println("Jashin jaziniz!");
                    System.out.println(service.findByAge(personArrayList, scanner.nextInt()));
                    break;
                case 4:
                    System.out.println(service.getAll());
                    break;
                case 5:
                    System.out.println(service.getGender(personArrayList,Gender.MALE));
                case 6:
                    System.out.println("Idsin jaziniz!");
                    System.out.println(service.findById(personArrayList, scanner1.nextLong()));
                    break;
                case 7:
                    System.out.println("Atin jaziniz! ");
                    System.out.println("Kancha akcha kerek jaziniz!");
                    System.out.println(service.takeMoney( scanner1.nextLine(), personArrayList, scanner3.nextLine(),personArrayList,scanner2.nextInt()));
                    break;


            }
        }


    }
}