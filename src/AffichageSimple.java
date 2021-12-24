public class AffichageSimple implements AffichageHeure{
    @Override
    public void miseAJour(HorlogeReveil h) {
        System.out.println(h.getHeures() + ":" + h.getMinutes());
    }
}
