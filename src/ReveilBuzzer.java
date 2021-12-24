public final class ReveilBuzzer implements ModeReveil{

    private static ReveilBuzzer INSTANCE;
    // ... autres attributs
    private ReveilBuzzer() { }
    public static ReveilBuzzer getInstance() {
        if(INSTANCE == null) {INSTANCE = new ReveilBuzzer();}
        return INSTANCE;
    }

    @Override
    public ModeReveil next(Reveil r) {
        return ReveilRadio.getInstance();
    }
}
