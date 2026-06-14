package com.wdiscute.starcatcher;

public class SCConfig {
    public static class Wrapper<T> {
        private T val;
        public Wrapper(T val) { this.val = val; }
        public T get() { return val; }
    }

    public static class DoubleWrapper {
        private double val;
        public DoubleWrapper(double val) { this.val = val; }
        public double get() { return val; }
    }

    public static class IntWrapper {
        private int val;
        public IntWrapper(int val) { this.val = val; }
        public int get() { return val; }
    }

    public static class BooleanWrapper {
        private boolean val;
        public BooleanWrapper(boolean val) { this.val = val; }
        public boolean get() { return val; }
    }

    public enum Units {
        METRIC, IMPERIAL, CHEESEBURGER, FOOTBALL, DEVELOPER_HEIGHT, BANANA, DUCK, SPACE_WHALE, SCIENTIFIC
    }

    public enum Sort {
        ALPHABETICAL_DOWN, ALPHABETICAL_UP
    }

    public static final DoubleWrapper MINIGAME_RENDER_SCALE = new DoubleWrapper(1.5);
    public static final IntWrapper MINIGAME_X_OFFSET = new IntWrapper(0);
    public static final IntWrapper MINIGAME_Y_OFFSET = new IntWrapper(0);
    public static final DoubleWrapper HIT_DELAY = new DoubleWrapper(0.0d);
    public static final BooleanWrapper REMOVE_NOTIFICATION_ON_HOVER = new BooleanWrapper(true);
    public static final Wrapper<Units> UNIT = new Wrapper<>(Units.METRIC);
    public static final Wrapper<Sort> SORT = new Wrapper<>(Sort.ALPHABETICAL_DOWN);
    public static final BooleanWrapper ENABLE_VILLAGER_SOUND = new BooleanWrapper(true);
    public static final BooleanWrapper ENABLE_HIT_SOUND = new BooleanWrapper(true);
    public static final BooleanWrapper ENABLE_MISS_SOUND = new BooleanWrapper(true);
    public static final BooleanWrapper VANILLA_PARTIAL_TICK = new BooleanWrapper(false);

    public static final BooleanWrapper GIVE_GUIDE = new BooleanWrapper(true);
    public static final BooleanWrapper SHOW_EXCLAMATION_MARK_PARTICLE = new BooleanWrapper(false);
    public static final BooleanWrapper ENABLE_BONE_MEAL_ON_FARMLAND_FOR_WORMS = new BooleanWrapper(true);
    public static final BooleanWrapper ENABLE_MINIGAME = new BooleanWrapper(true);
    public static final BooleanWrapper ENABLE_FTB_TEAM_SHARING = new BooleanWrapper(true);
    public static final BooleanWrapper ENABLE_SEASONS = new BooleanWrapper(true);

    public static final DoubleWrapper VANISHING_RATE_MULTIPLIER = new DoubleWrapper(1d);
    public static final DoubleWrapper MOVING_SPEED_MULTIPLIER = new DoubleWrapper(1d);
    public static final DoubleWrapper PENALTY_MULTIPLIER = new DoubleWrapper(1d);
    public static final DoubleWrapper DECAY_RATE_MULTIPLIER = new DoubleWrapper(1d);
    public static final DoubleWrapper HP_RATE_MULTIPLIER = new DoubleWrapper(1d);
    public static final DoubleWrapper POINTER_SPEED_MULTIPLIER = new DoubleWrapper(1d);
    public static final BooleanWrapper HIDE_ENTRIES_UNTIL_FOUND = new BooleanWrapper(true);
    public static final DoubleWrapper FISH_PLAYER_MESSAGES_CHANCE = new DoubleWrapper(0.05d);
    public static final BooleanWrapper SAVE_DATA_TO_ITEMS = new BooleanWrapper(true);
    public static final IntWrapper BASE_MIN_TICKS_TO_FISH = new IntWrapper(100);
    public static final IntWrapper BASE_MAX_TICKS_TO_FISH = new IntWrapper(300);
    public static final DoubleWrapper BASE_CHANCE_TO_FISH = new DoubleWrapper(0.005d);
    public static final BooleanWrapper RESTRICT_TACKLE_BOX_TO_TAG = new BooleanWrapper(true);
    public static final BooleanWrapper ENABLE_ROD_MENU = new BooleanWrapper(false);
    public static final DoubleWrapper FISH_MAX_SCALE = new DoubleWrapper(1.5d);
    public static final DoubleWrapper FISH_MIN_SCALE = new DoubleWrapper(0.5d);
    public static final IntWrapper MAX_TACKLE_BOX_FISH_STORAGE = new IntWrapper(900);
}
