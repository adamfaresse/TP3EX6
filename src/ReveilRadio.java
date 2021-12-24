public final class ReveilRadio implements ModeReveil{
    private static ReveilRadio INSTANCE;
    // ... autres attributs
    private ReveilRadio() { }
    public static ReveilRadio getInstance() {
        if(INSTANCE == null) {INSTANCE = new ReveilRadio();}
        return INSTANCE;
    }

    @Override
    public ModeReveil next(Reveil r) {
        return ReveilEteint.getInstance();
    }
}
