package classes.servic;

import classes.classes.Person;
import classes.enums.Gender;

import java.util.List;

public interface Servisable {
   List<Person> createPersons(List<Person>people);
   List<Person> findByName(List<Person>people,String name);
   List<Person> findByAge(List<Person>people,int age);
   List<Person> getAll();
   List<Person> getGender(List<Person>people, Gender gender);
   String takeMoney(String name,List<Person>people,String names,List<Person>people1,int summa);
   List<Person> findById(List<Person>people,long id);

//  int getAge(List<Person>people);




}
