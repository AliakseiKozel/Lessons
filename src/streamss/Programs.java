package streamss;

import java.util.ArrayList;
import java.util.List;

public class Programs
{
    public static void main( String[] args )
    {
        List<Person> persons = new ArrayList<>();

        persons.add( new Person( "serj", 38 ) );
        persons.add( new Person( "anna", 8 ) );
        persons.add( new Person( "maja", 18 ) );
        persons.add( new Person( "petr", 12 ) );
        persons.add( new Person( "john", 24 ) );

//        for( Person p : persons )
//        {
//            System. out.println(p);
//        }
        /**
         * stream возвращает обьект класса стрим,
         * у которого набор методов в качестве параметров принимают функциональные интерфейсы
         */
        // persons.stream().forEach( p -> System.out.println(p));

        /**
         * фильтрацияб где в предикейт метода фильтер передается булен и возвращается стрим согласно тому что булен ртру
         */
        persons.stream()
               .filter( p -> p.getAge() >= 18 )
               .sorted( (p1, p2) -> p1.getName().compareTo( p2.getName() ) )           //сортировка без компаратора срабатывает только тогда,
                                                // когда входящие объекты класса реализуют  интерфейс comparable и возвращает инт
               .forEach( System.out::println );

    }
}
