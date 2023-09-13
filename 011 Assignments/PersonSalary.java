//  You are given an ArrayList of Person objects. Each Person has attributes name, age, and salary. 
// Write a program to sort the ArrayList in ascending order of age. If two persons have the same age, 
// sort them in descending order of salary. 

import java.util.*;

class Person{
    String name;
    int age;
    int salary;
    public Person(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

public class PersonSalary{

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 25, 3000));
        persons.add(new Person("Peter", 30, 4000));
        persons.add(new Person("Mary", 28, 5000));
        persons.add(new Person("David", 25, 3500));
        persons.add(new Person("Richard", 28, 4500));
        persons.add(new Person("Susan", 28, 3500));
        persons.add(new Person("Joseph", 25, 5000));

        Comparator<Person> compare = new Comparator<>(){
            @Override
            public int compare(Person p1, Person p2){
                if (p1.age == p2.age){
                    return Integer.compare(p2.salary, p1.salary);
                }
                else{
                    return Integer.compare(p1.age, p2.age);
                }
            }
        };

        persons.sort(compare);
        // Collection.sort(persons);

        for (Person person : persons){
            System.out.println(person.name + " " + person.age + " " + person.salary);
        }
    }
}