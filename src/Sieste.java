public class Sieste implements Observateur{
    private boolean sieste = false;
    private int heureFinSieste;
    private int minuteFinSieste;
    HorlogeReveil h;
    Sieste(HorlogeReveil h){
        this.h = h;
    }
    void sleep(int m) {
        sieste = true;
        minuteFinSieste = (h.getMinutes() + m) % 60;
        heureFinSieste = (h.getHeures() + m / 60) % 24;
    }

    void snooze() {
        h.getReveil().sonOff();
        sleep(9);
    }
    @Override
    public void miseAJour(HorlogeReveil h) {
        if(sieste && h.getHeures() == heureFinSieste && h.getMinutes() == minuteFinSieste){
            h.getReveil().sonOn();
            sieste = false;
        }

    }
}
