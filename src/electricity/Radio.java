package electricity;

public class Radio implements ElectricityConsumer
{
    public void playMusic() {
        System.out.println("Радио Играет");
    }

    @Override
    public void electricityOn(Object sender)
    {
        playMusic();
    }
}
