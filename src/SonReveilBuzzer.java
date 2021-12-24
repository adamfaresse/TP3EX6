public class SonReveilBuzzer implements SonReveil {

    private Buzzer buzzer = new Buzzer();


    @Override
    public void on() {
        buzzer.demarre();
    }

    @Override
    public void off() {
        buzzer.stoppe();
    }


}
