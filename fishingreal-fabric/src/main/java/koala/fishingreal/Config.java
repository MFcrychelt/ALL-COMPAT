package koala.fishingreal;

public class Config {
    public static class BooleanWrapper {
        private boolean val;
        public BooleanWrapper(boolean val) { this.val = val; }
        public boolean get() { return val; }
    }

    public static final Config CONFIG = new Config();
    
    public final BooleanWrapper enableCatchInteraction = new BooleanWrapper(false);
    public final BooleanWrapper limitInteractionToWaterBucket = new BooleanWrapper(true);
}
