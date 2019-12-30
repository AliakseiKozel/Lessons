package electricity;

public class Program
{
    public static void fire(Object sender){
        System.out.println("pojar");
    }

    public static void main( String[] args )
    {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        //подписка на событие (event subscribe)
        sw.addElectricityListener( lamp );
        sw.addElectricityListener( radio );

        String abc = "abc";


//        class Fire implements ElectricityConsumer{
//
//            @Override
//            public void electricityOn()
//            {
//                System.out.println("fire");
//            }
//        }
//

        sw.addElectricityListener(
            new ElectricityConsumer()
            {
                @Override
                public void electricityOn( Object sender )
                {
                    System.out.println(abc);
                }
            }
        );

        /**
         * то же самое что и код сверху или закомментированный
         */
        sw.addElectricityListener( Program::fire );
        sw.addElectricityListener( sender -> System.out.println(abc) );

        sw.switchOn();
    }
}
