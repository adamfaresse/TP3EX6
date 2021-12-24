public class SonReveilRadio implements SonReveil{
    private Radio radio = new Radio();
    @Override
    public void on() {
        radio.allume();
    }

    @Override
    public void off() {
        radio.eteint();
    }
}
