package classes.servic;

import classes.classes.Person;
import classes.enums.Gender;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class ServiceImpl implements Servisable {
    List<Person>personList=new ArrayList<>();


    @Override
    public List<Person> createPersons(List<Person> people) {
        this.personList.addAll(people);
            return people;

        }

    @Override
    public List<Person> findByName(List<Person> people, String name) {
        List<Person>findName=new ArrayList<>();
        for (Person person : people) {
            if(person.getName().equals(name)){
               findName.add(person);
            }

        }
        return findName;
    }

    @Override
    public List<Person> findByAge(List<Person> people, int age) {
        List<Person>findage=new ArrayList<>();
        for (Person person : people) {
            if(person.getDateOfBirth()==age){
                findage.add(person);
            }

        }
        return findage;
    }

    @Override
    public List<Person> getAll() {
        return personList;
    }

    @Override
    public List<Person> getGender(List<Person> people, Gender gender) {
        List<Person>males=new ArrayList<>();
        List<Person>females=new ArrayList<>();
        for (Person person : people) {
            if(person.getGender().equals(Gender.MALE)){
                males.add(person);
                System.out.println(males);
            }else {
                females.add(person);
                System.out.println(females);
            }

        }
        return null;
    }

    @Override
    public String takeMoney(String name, List<Person> people, String names, List<Person> people1, int summa) {
        for (Person person : people) {
            if(person.getName().equals(name)){
                for (Person person1 : people1) {
                    if(person1.getName().equals(names)){
                        boolean b=person1.getMoney().intValue()>=summa;
                        if(b){
                            BigDecimal subtract=person1.getMoney().subtract(BigDecimal.valueOf(summa));
                            person1.setMoney(subtract);
                            BigDecimal add=person.getMoney().add(BigDecimal.valueOf(summa));
                            person.setMoney(add);
                            return "Zavtra obiazatelno verni!";
                        }else return "Stolko deneg net!";
                    }

                }
            }

        }
        return null;
    }

    @Override
    public List<Person> findById(List<Person> people, long id) {
        List<Person>findId=new ArrayList<>();
        for (Person person : people) {
            if(person.getId()==id){
              findId.add(person);
            }

        }
        return findId ;
    }

    }
