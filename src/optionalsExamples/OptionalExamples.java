package optionalsExamples;

import java.io.IOException;
import java.util.Optional;

public class OptionalExamples
{
    public static void main( String[] args )
    {

        String s = null;
/**
 * optional это контейнер, которые может содерожать значение или некоторый тип Т или просто быть null.
 *
 */
        /**
         *  Optional with null
         */
        Optional<String> fullName = Optional.ofNullable( null ); // создали опшнл с налл.
        System.out.println(
            "Full Name is set? " + fullName.isPresent() );  //Метод isPresent() возвращает true если экземпляр Optional содержит не null значение и false в противном случае.
        System.out.println( "Full Name: " + fullName.orElseGet(
            () -> "[none]" ) );  // Метод orElseGet() содержит запасной механизм результата, если Optional содержит null, принимая функции для генерации значения по умолчанию.
        System.out.println( fullName.map( a -> "Hey " + a + "!" ).orElse(
            "Hey Stranger!" ) );  // Метод map() преобразует текущее значение Optional и возвращает новый экземпляр Optional. Метод orElse() похож на orElseGet(),
        // но вместо функции он принимает значение по умолчанию

        /**
         * Optional without null
         */
        Optional<String> firstName = Optional.of( "Tom" );
        System.out.println( "First Name is set? " + firstName.isPresent() );
        System.out.println( "First Name: " + firstName.orElseGet( () -> "[none]" ) ); // метод не отработает, так как Optional не содержит null
        System.out.println( firstName.map( a -> "Hey " + a + "!" ).orElse( "Hey Stranger!" ) );
        System.out.println();

        Optional.ofNullable( s ).orElseThrow( () -> new RuntimeException( "all is good" )  ); // При значении null, пробрасывает ексепшн


        System.out.println( Optional.ofNullable( "sd" ).map( String::getBytes ).get() ); //мутод вернет новый экземпляр класса Optional, в котором стринг будет заменен массивом байтов

        Optional.ofNullable( "asd" ).filter( a -> a.matches( "as" )); }


}
