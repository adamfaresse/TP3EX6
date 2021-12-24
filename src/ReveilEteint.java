public final class ReveilEteint implements ModeReveil{

        private static ReveilEteint INSTANCE;
        // ... autres attributs
        private ReveilEteint() { }
        public static ReveilEteint getInstance() {
            if(INSTANCE == null) {INSTANCE = new ReveilEteint();}
            return INSTANCE;
        }


    @Override
    public ModeReveil next(Reveil r) {
        return ReveilBuzzer.getInstance();
    }
}
