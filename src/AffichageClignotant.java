public class AffichageClignotant implements AffichageHeure{
    private boolean isTrue = true;
    @Override
    public void miseAJour(HorlogeReveil h) {
        if(isTrue){
            isTrue = false;
            System.out.println(h.getHeures() + ":" + h.getMinutes());
        }else{
            isTrue = true;
            System.out.println(h.getHeures() + "" + h.getMinutes());
        }



    }
}
